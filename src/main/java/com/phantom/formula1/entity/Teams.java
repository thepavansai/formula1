package com.phantom.formula1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="f1teams2025")
public class Teams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String driver1;
	private String driver2;
	
//	public Teams() {
//		super();
//	}
//	public Teams(Integer id, String name, String driver1, String driver2) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.driver1 = driver1;
//		this.driver2 = driver2;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDriver1() {
//		return driver1;
//	}
//
//	public void setDriver1(String driver1) {
//		this.driver1 = driver1;
//	}
//
//	public String getDriver2() {
//		return driver2;
//	}
//
//	public void setDriver2(String driver2) {
//		this.driver2 = driver2;
//	}
//	
//	@Override
//	public String toString() {
//		return "Teams [id=" + id + ", name=" + name + ", driver1=" + driver1 + ", driver2=" + driver2 + "]";
//	}
}
