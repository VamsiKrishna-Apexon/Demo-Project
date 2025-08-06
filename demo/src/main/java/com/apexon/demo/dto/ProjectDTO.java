package com.apexon.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class ProjectDTO {
    private long id;
    private String title;
    private Date startDate;
    private Date endDate;
    private double budget;
    private int employeeCount;
}
