package com.plan.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plan.demo.entity.PlanCategory;

public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer> {

}
