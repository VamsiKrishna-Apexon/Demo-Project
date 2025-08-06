package com.apexon.demo.service;

import com.apexon.demo.dto.ProjectDTO;
import com.apexon.demo.entity.Employee;
import com.apexon.demo.entity.Project;
import com.apexon.demo.repository.EmployeeRepository;
import com.apexon.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public ProjectDTO getProject(long id){

        ProjectDTO projectDTO = new ProjectDTO();
        Optional<Project> projectOpt = projectRepository.findById(id);
//        List<Employee> employees = employeeRepository.findAllByProjectId(id);

        Project project = projectOpt.get();
        projectDTO.setId(project.getId());
        projectDTO.setTitle(project.getTitle());
        projectDTO.setStartDate(project.getStartDate());
        projectDTO.setEndDate(project.getEndDate());
        projectDTO.setBudget(project.getBudget());
        projectDTO.setEmployeeCount(project.getEmployees().size());
        return projectDTO;
    }
}
