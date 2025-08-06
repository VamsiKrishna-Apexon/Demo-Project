package com.apexon.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "projects")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Date startDate;
    private Date endDate;
    private double budget;
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;
}
