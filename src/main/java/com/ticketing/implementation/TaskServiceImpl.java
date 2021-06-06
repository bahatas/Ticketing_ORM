package com.ticketing.implementation;

import com.ticketing.dto.TaskDTO;
import com.ticketing.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO,Long> implements TaskService {


    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findbyId(id);
    }

    @Override
    public void delete(TaskDTO taskDTO) {

        super.delete(taskDTO);
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public TaskDTO save(TaskDTO taskDTO) {
       return super.save(taskDTO.getId(),taskDTO);
    }

    @Override
    public void update(TaskDTO taskDTO) {

        TaskDTO previousTask=findById(taskDTO.getId());
        taskDTO.setAssignedDate(previousTask.getAssignedDate());
        taskDTO.setTaskStatus(previousTask.getTaskStatus());
        super.update(taskDTO.getId(),taskDTO);
    }
}
