package com.coding.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Sid;
	
	private String Sname;
	private String Sgen;
	private String Scource;
	private Long Sno;
	private String Sdob;
	private List<String> Slang;
	private String Spwd;
	
}
