package com.ticketing.implementation;

import com.ticketing.dto.ProjectDTO;
import com.ticketing.service.ProjectService;
import com.ticketing.utils.Status;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {
    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String projectCode) {  // project code burda uniq i=olan aslinda

        super.deleteById(projectCode);
    }

    @Override
    public void delete(ProjectDTO projectDTO) {

        super.delete(projectDTO);
    }

    @Override
    public ProjectDTO findById(String projectCode) {
        return super.findbyId(projectCode);
    }

    @Override
    public ProjectDTO save(ProjectDTO projectDTO) {
        return super.save(projectDTO.getProjectCode(),projectDTO);
    }

    @Override
    public void update(ProjectDTO projectDTO) {

        ProjectDTO newProject = findById(projectDTO.getProjectCode());
        if(projectDTO.getProjectCode()==null){
            projectDTO.setProjectStatus(newProject.getProjectStatus());
        }

        super.update(projectDTO.getProjectCode(),projectDTO);
    }


    @Override
    public void complete(ProjectDTO projectDTO) {
        super.findbyId(projectDTO.getProjectCode()).setProjectStatus(Status.COMPLETE);
        super.save(projectDTO.getProjectCode(),projectDTO);
    }
}
