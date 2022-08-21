package com.plan.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plan.demo.entity.PlanMaster;

@Repository
public interface  PlanMasterRepo extends JpaRepository<PlanMaster, Integer> {

}
