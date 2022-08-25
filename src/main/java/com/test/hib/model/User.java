package com.test.hib.model;
import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {
	private Integer id;
	private String fullname,email,password,city;
	private int age;
	private double salary;
	
	public User(String fullname, String email, String password, String city, int age, double salary) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.city = city;
		this.age = age;
		this.salary = salary;
	}
	public User() {}
	
	@Column(name="USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", city="
				+ city + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
