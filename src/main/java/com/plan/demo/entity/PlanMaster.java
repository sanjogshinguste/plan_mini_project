package com.plan.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="PLAN_MASTER")
@Data
public class PlanMaster {

	@Id
	@GeneratedValue
	
	@Column(name="PLAN_ID")
	private Integer planId;
	
	@Column(name="PLAN_NAME")	
	private String planName;
	
	@Column(name="PLAN_START_DATE")			
	private LocalDate planStartDate;
	
	@Column(name="PLAN_END_DATE")
	private LocalDate planEndDate;
	
	@Column(name="PLAN_CATEGORY_ID")
	private Integer planCategoryId; 
	
	@Column(name="ACTIVE_SW")
	private String activeSW;
	
	@Column(name="CREATE_DATE",updatable = false)
	private LocalDate createdDate;
	
	@Column(name="UPDATE_DATE",insertable = false)
	private LocalDate updatedDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;




}
