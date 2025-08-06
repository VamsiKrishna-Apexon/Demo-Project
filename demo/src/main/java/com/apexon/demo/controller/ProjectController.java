package com.apexon.demo.controller;

import com.apexon.demo.dto.ProjectDTO;
import com.apexon.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getProject(@PathVariable long id){
        try {
            ProjectDTO projectDTO = projectService.getProject(id);
            return ResponseEntity.ok(projectDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
