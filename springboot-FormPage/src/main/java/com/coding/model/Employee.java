package com.coding.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Employee {
	
	 private Integer eid;
	 private String ename;
	 private Double esal;
	 private String empgen;
	 private String addr;
	 private String dept;
	 private List<String> eclient;
	 private String eshift;
	 private String date;
	 private String pass;
	 
}
