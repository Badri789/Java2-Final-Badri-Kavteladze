package ge.btu.badri_kavteladze_final_2.service.impl;

import ge.btu.badri_kavteladze_final_2.dto.task.*;
import ge.btu.badri_kavteladze_final_2.model.Task;
import ge.btu.badri_kavteladze_final_2.repository.TaskRepository;
import ge.btu.badri_kavteladze_final_2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTaskOutput getTask(GetTaskInput getTaskInput) {
        Task task = taskRepository.getById(getTaskInput.getId());
        GetTaskOutput getTaskOutput = new GetTaskOutput();
        getTaskOutput.setId(task.getId());
        getTaskOutput.setTitle(task.getTitle());
        getTaskOutput.setDescription(task.getDescription());
        getTaskOutput.setStartDate(task.getStartDate());
        getTaskOutput.setEndDate(task.getEndDate());

        return getTaskOutput;
    }

    @Override
    public GetAllTasksOutput getAllTasks(GetAllTasksInput getAllTasksInput) {
        List<TaskDTO> taskDTOList = new ArrayList<>();

        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            taskDTOList.add(taskDTO);
        }

        GetAllTasksOutput getAllTasksOutput = new GetAllTasksOutput();
        getAllTasksOutput.setTasks(taskDTOList);
        return getAllTasksOutput;
    }


    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());

        taskRepository.save(task);
        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setSuccessMsg(String.format("%s was added successfully", addTaskInput.getTitle()));
        return addTaskOutput;
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = taskRepository.getById(deleteTaskInput.getId());
        taskRepository.delete(task);

        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setSuccessMsg(String.format("%s was deleted successfully", task.getTitle()));
        return deleteTaskOutput;
    }

    @Override
    public UpdateTaskOutput updateTask(UpdateTaskInput updateTaskInput) {
        Task task = taskRepository.getById(updateTaskInput.getId());

        task.setTitle(updateTaskInput.getTitle());
        task.setDescription(updateTaskInput.getDescription());
        task.setStartDate(updateTaskInput.getStartDate());
        task.setEndDate(updateTaskInput.getEndDate());

        taskRepository.save(task);

        UpdateTaskOutput updateTaskOutput = new UpdateTaskOutput();
        updateTaskOutput.setSuccessMsg(String.format("%s was updated successfully", updateTaskInput.getTitle()));
        return updateTaskOutput;
    }
}
