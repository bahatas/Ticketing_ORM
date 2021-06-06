package com.ticketing.controller;


import com.ticketing.dto.ProjectDTO;
import com.ticketing.service.UserService;
import com.ticketing.utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @Autowired
    UserService userService;

    @RequestMapping("/create")
    public String createProject(Model model) {

        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("managers",userService.findAll());
        return "/project/create";
    }
    @PostMapping("/create")
    public String insertProject(ProjectDTO project){
        projectService.save(project);
        project.setProjectStatus(Status.OPEN);

        return "redirect:/project/create";

    }

    @GetMapping("/delete/{projectCode}")
    public String deletebyId(@PathVariable("projectCode")ProjectDTO projectDTO){

        projectService.deleteById( projectDTO.getProjectCode());

        return "redirect:/project/create";

    }

    @GetMapping("/complete/{projectCode}")
    public String completeProject(@PathVariable("projectCode") ProjectDTO projectDTO){
        projectService.complete(projectDTO);

        return "redirect:/project/create";
    }
    @GetMapping("/update/{projectCode}")
    public String editProject(@PathVariable("projectCode") String projectCode,  Model model){

        model.addAttribute("project",projectService.findById(projectCode));
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("managers",userService.findAll());

        return "project/update";
    }
    @PostMapping("/update/{projectCode}")
    public String updateproject(@PathVariable("projectCode") ProjectDTO projectDTO){
        projectService.update(projectDTO);

        return "redirect:/project/create";
    }
}
