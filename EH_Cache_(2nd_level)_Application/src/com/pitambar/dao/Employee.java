package com.pitambar.dao;

import org.hibernate.cache.CacheConcurrencyStrategy;
 
@Entity
@Table(name = "EMPLOYEE")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
 
    @Column(name = "emp_name")
    private String name;
 
    @Column(name = "emp_salary")
    private double salary;
 
    @OneToOne(mappedBy = "employee")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Address address;
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
}