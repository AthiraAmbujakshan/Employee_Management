package com.cognizant.EmployeeManagement.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="employee_management")
public class Employee {
		@Id
	
	@Column(name="employee_id")
		 
		private int id;
	@Column(name="firstName")
	//@NotEmpty(message="firstName cannot be null")
	private String firstName;
	@Column(name="lastName")
	//@NotEmpty(message="lastName cannot be null")
	//@Size(min=3,max=10, message="lastName must be minimum 8 character")
	private String lastName;
	@Column(name="mail_id")
	//@org.hibernate.validator.constraints.Email(message="enter a valid email")
	
	private String email;
	@Column(name="contact_number")
	//@NotEmpty(message="enter a valid number")
	@Size(min=0,max=10)
	private String contactNumber;
	@Column(name="gender")
	//(message="choose a gender")
	private String gender;
	@Column(name="age")
	//@Min(value=22,message="age should not be less than 22")
	//@Max(value=60,message="age should not be more than 60")
	private int age;
	
	@Column(name="job_location")
	//@NotBlank(message="enter a jobLocation")
	private String jobLocation;
	@Column(name="Business_Unit")
	//@NotBlank(message="enter a businessUnit")
	private String businessUnit;
	@Column(name="project_id")
	@NotEmpty(message="mention projectId")
	private int projectId;
	@Column(name="Job_title")
	//@NotBlank(message="mention jobTitle")
	private String jobTitle;
	
	@Column(name="DateOfJoining")
	//@NotNull @Past
		private Date dateOfJoining;
	@Column(name="Salary")
	
	private Double salary;
		public Employee() { }
public Employee(String firstName, String lastName, String email, 
		String contactNumber, String gender, int age,
	           String jobLocation, String businessUnit, int projectId, 
	            String jobTitle, Date dateOfJoining, Double salary) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.contactNumber = contactNumber;
			this.gender = gender;
			this.age = age;
			this.jobLocation = jobLocation;
			this.businessUnit = businessUnit;
			this.projectId = projectId;
			this.jobTitle = jobTitle;
			this.dateOfJoining = dateOfJoining;
			this.salary = salary;
		}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getJobLocation() {
	return jobLocation;
}
public void setJobLocation(String jobLocation) {
	this.jobLocation = jobLocation;
}
public String getBusinessUnit() {
	return businessUnit;
}
public void setBusinessUnit(String businessUnit) {
	this.businessUnit = businessUnit;
}
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}

public Date getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(Date dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", contactNumber=" + contactNumber + ", gender=" + gender + ", age=" + age + ", jobLocation="
			+ jobLocation + ", businessUnit=" + businessUnit + ", projectId=" + projectId + ", jobTitle=" + jobTitle
			+ ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
}
}	
		
		
		
		
		
		
		
		