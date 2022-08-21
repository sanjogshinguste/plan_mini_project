package com.plan.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "PLAN_CATEGORY")
public class PlanCategory {
	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	private Integer categoryId;
	
	@Column(name = "CATEGORY_NAME")
	
	private String categoryName;
	@Column(name = "ACTIVE_SW")
	
	private String activeSW;
	@Column(name = "CREATE_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name = "UPDATE_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
	@Column(name = "CREATED_BY")
	
	private String createdBy;
	@Column(name = "UPDATED_BY")
	
	private String updatedBy;

}
