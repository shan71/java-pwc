package com.demo.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MYEMP")
@NamedQueries({
	@NamedQuery(name="query1",query = "select e from Employee as e where e.name like ?1"),
	@NamedQuery(name="query2",query = "select e.name,e.salary from Employee as e")
})
public class Employee {
	@Id
	@Column(name="EMPNO")
	private int empId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ADDRESS")
	private String city;
	
	@Column(name="SALARY")
	private double salary;
	
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "CHILDREN",joinColumns = @JoinColumn(name="EMPNO"))
	@Column(name="children_name")
	private Set<String> children=new HashSet<String>();
	
	@Embedded
	private Address address;
	
	  public Employee() {
	  
	  }
	 

	public Employee(int empId, String name, String city, double salary) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<String> getChildren() {
		return children;
	}

	public void setChildren(Set<String> children) {
		this.children = children;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
