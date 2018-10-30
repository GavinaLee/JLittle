package com.tongyidi.jlittle;

import java.math.BigDecimal;

public class User {
	private String name;
	private int age;
	private BigDecimal salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", salary=" + salary + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
