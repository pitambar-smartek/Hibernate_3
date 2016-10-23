package com.pitambar.persistence;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int employeeId;
	private String name;
	private int departmentNumber;
	private int[] phones;
	private Contact[] contacts;
	private List<String> locations;
	private Set<Project> projects;
	private Collection<String> logs;
	private Collection<String> logsBackUp;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name
				+ ", departmentNumber=" + departmentNumber + ", phones="
				+ Arrays.toString(phones) + ", contacts="
				+ Arrays.toString(contacts) + ", locations=" + locations
				+ ", projects=" + projects + ", logs=" + logs + ", logsBackUp="
				+ logsBackUp + ", tokens=" + tokens + ", extras=" + extras
				+ ", projMap=" + projMap + "]";
	}

	private Map<String, String> tokens;
	private Map<String, String> extras;
	private Map<String, Project> projMap;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int[] getPhones() {
		return phones;
	}

	public void setPhones(int[] phones) {
		this.phones = phones;
	}

	public Contact[] getContacts() {
		return contacts;
	}

	public void setContacts(Contact[] contacts) {
		this.contacts = contacts;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public Collection<String> getLogs() {
		return logs;
	}

	public void setLogs(Collection<String> logs) {
		this.logs = logs;
	}

	public Collection<String> getLogsBackUp() {
		return logsBackUp;
	}

	public void setLogsBackUp(Collection<String> logsBackUp) {
		this.logsBackUp = logsBackUp;
	}

	public Map<String, String> getTokens() {
		return tokens;
	}

	public void setTokens(Map<String, String> tokens) {
		this.tokens = tokens;
	}

	public Map<String, String> getExtras() {
		return extras;
	}

	public void setExtras(Map<String, String> extras) {
		this.extras = extras;
	}

	public Map<String, Project> getProjMap() {
		return projMap;
	}

	public void setProjMap(Map<String, Project> projMap) {
		this.projMap = projMap;
	}

	public void displayEmployeeDetails() {
		System.out.println("The Emp Id=" + employeeId + " Dept= "
				+ departmentNumber + " Name=" + name);
		for (int i : phones) {
			System.out.println("Phone No" + i);
		}
		for (Contact contant : contacts) {
			System.out.println("The Contact mail+" + contant.getContactEmail()
					+ " Contact Phone=" + contant.getContactName() + " Name="
					+ contant.getContactName());

		}
		
	}

}
