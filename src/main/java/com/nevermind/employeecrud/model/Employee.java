package com.nevermind.employeecrud.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phoneNumber;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String employeeCode;
	
	
	public Employee(String name, String email, String jobTitle, String phoneNumber, String imageUrl, String employeeCode) {
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phoneNumber = phoneNumber;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}
	
	
}
