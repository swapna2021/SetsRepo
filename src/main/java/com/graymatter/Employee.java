package com.graymatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee> {
	
	private String empName;
	private int empId;
	private double empSal;
	private String city;
	
	
	@Override
	public int compareTo(Employee o) {
		
		
		//return this.getEmpId()-e.getEmpId();
		//return this.getEmpName().compareTo(e.getEmpName());
		return (int)(this.getEmpSal()-o.getEmpSal());
	}
//	
//	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		
//		return super.clone();
//	}
	
	
}
