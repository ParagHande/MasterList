package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class MasterList {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String parentCode;
    private String parentName;
    private String name;
    private String plan;
    private String option;
    private String optionFrequency;
    private String subCategory;
    private String sector;
    private String benchmark;
    private Integer faceValue;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getOptionFrequency() {
		return optionFrequency;
	}
	public void setOptionFrequency(String optionFrequency) {
		this.optionFrequency = optionFrequency;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBenchmark() {
		return benchmark;
	}
	public void setBenchmark(String benchmark) {
		this.benchmark = benchmark;
	}
	public Integer getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(Integer faceValue) {
		this.faceValue = faceValue;
	}
	
	@Override
	public String toString() {
		return "MasterList [id=" + id + ", parentCode=" + parentCode + ", parentName=" + parentName + ", name=" + name
				+ ", plan=" + plan + ", option=" + option + ", optionFrequency=" + optionFrequency + ", subCategory="
				+ subCategory + ", sector=" + sector + ", benchmark=" + benchmark + ", faceValue=" + faceValue + "]";
	}
	
    
    
    
}