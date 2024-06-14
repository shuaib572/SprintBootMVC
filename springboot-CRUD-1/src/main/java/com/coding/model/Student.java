package com.coding.model;


import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stdId;
	private String stdName;
	private String stdGen;
	private String stdCource;
	private String stdDob;
	private String stdAddr;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> stdLang;
	private String stdPwd;
	
	
}

