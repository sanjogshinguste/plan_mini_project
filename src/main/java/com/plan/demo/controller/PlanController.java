package com.plan.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plan.demo.entity.PlanMaster;
import com.plan.demo.service.PlanService;

@RestController
@CrossOrigin
@RequestMapping("/plan")

public class PlanController {

	@Autowired
	PlanService planService;

	@GetMapping("/planCategories")
	public ResponseEntity<Map<Integer, String>> getPlanCategories() {
		return new ResponseEntity<>(planService.getPlanCategories(), HttpStatus.OK);
	}

	@GetMapping("/allPlan")
	public ResponseEntity<List<PlanMaster>> getAllPlan() {
		return new ResponseEntity<List<PlanMaster>>(planService.getAllPlans(), HttpStatus.OK);
	}

	@GetMapping("/plan/{planId}")
	public ResponseEntity<PlanMaster> getPlanById(@PathVariable Integer planId) {
		return new ResponseEntity(planService.getPlanById(planId), HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<String> savePlan(@RequestBody PlanMaster plaMaster) {
		String planSaveMsg = "";

		boolean isPlanSave = planService.savePlan(plaMaster);
		if (isPlanSave) {
			planSaveMsg = "plan save successFully";
		} else {
			planSaveMsg = "plan  not save successFully";
		}

		return new ResponseEntity(planSaveMsg, HttpStatus.CREATED);

	}

	@PostMapping("/updatePlan")
	public ResponseEntity<String> updatePlan(@RequestBody PlanMaster plaMaster) {
		String planUpdateMsg = "";

		boolean isPlanupdate = planService.updatePlan(plaMaster);
		if (isPlanupdate) {
			planUpdateMsg = "plan save successFully";
		} else {
			planUpdateMsg = "plan  not save successFully";
		}

		return new ResponseEntity(planUpdateMsg, HttpStatus.OK);

	} 

	@PostMapping("/deletePlan")
	public ResponseEntity<String> deletePlan(@PathVariable Integer planId) {
		String planDeleteMsg = "";

		boolean isPlanDelete = planService.deletePlan(planId);
		if (isPlanDelete) {
			planDeleteMsg = "plan save successFully";
		} else {
			planDeleteMsg = "plan  not save successFully";
		}

		return new ResponseEntity(planDeleteMsg, HttpStatus.OK);

	}
}
