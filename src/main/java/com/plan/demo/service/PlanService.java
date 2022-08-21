package com.plan.demo.service;

import java.util.List;
import java.util.Map;

import com.plan.demo.entity.PlanMaster;


 
public interface PlanService {

	public Map<Integer, String>  getPlanCategories();
	public Boolean savePlan(PlanMaster planMaster);
	public List <PlanMaster> getAllPlans();
	public PlanMaster getPlanById(Integer id);
	public Boolean updatePlan(PlanMaster planmaster);
	public Boolean deletePlan(Integer planId);
	public Boolean changeActiveStatus();
}
