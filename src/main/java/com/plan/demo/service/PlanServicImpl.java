package com.plan.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plan.demo.entity.PlanMaster;
import com.plan.demo.repo.PlanCategoryRepo;
import com.plan.demo.repo.PlanMasterRepo;

@Component
public class PlanServicImpl implements PlanService {

	@Autowired
	PlanCategoryRepo planCategoryRepo;
	@Autowired
	PlanMasterRepo planMasterRepo;

	@Override
	public Map<Integer, String> getPlanCategories() {
		// TODO Auto-generated method stub
		Map<Integer, String> planCategories = new HashMap<Integer, String>();
		planCategoryRepo.findAll().forEach(planCat -> {
			planCategories.put(planCat.getCategoryId(), planCat.getCategoryName());
		});
		return planCategories;
	}

	@Override
	public Boolean savePlan(PlanMaster planMaster) {
		return planMasterRepo.save(planMaster).getPlanId() != null;
	}

	@Override
	public List<PlanMaster> getAllPlans() {
		// TODO Auto-generated method stub
		return planMasterRepo.findAll();
	}

	@Override
	public PlanMaster getPlanById(Integer id) {
		// TODO Auto-generated method stub
		return planMasterRepo.findById(id).get();
	}

	@Override
	public Boolean updatePlan(PlanMaster planmaster) {
		// TODO Auto-generated method stub
		Boolean updated = false;
		if (planMasterRepo.existsById(planmaster.getPlanId())) {
			planMasterRepo.save(planmaster);
			updated = true;
		}
		return updated;
	}

	@Override
	public Boolean deletePlan(Integer planId) {
		// TODO Auto-generated method stub
		Boolean deleted = false;

		if (planMasterRepo.existsById(planId)) {
			planMasterRepo.deleteById(planId);
			;
			deleted = true;
		}
		return deleted;
	}

	@Override
	public Boolean changeActiveStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
