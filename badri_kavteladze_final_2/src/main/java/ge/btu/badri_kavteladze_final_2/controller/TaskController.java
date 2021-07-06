package ge.btu.badri_kavteladze_final_2.controller;

import ge.btu.badri_kavteladze_final_2.dto.task.*;
import ge.btu.badri_kavteladze_final_2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("get-task")
    public GetTaskOutput getTask(@RequestBody GetTaskInput getTaskInput) {
        return taskService.getTask(getTaskInput);
    }

    @PostMapping("get-tasks")
    public GetAllTasksOutput getAllTasks(@RequestBody GetAllTasksInput getAllTasksInput) {
        return taskService.getAllTasks(getAllTasksInput);
    }

    @PostMapping("add-task")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @PostMapping("delete-task")
    public DeleteTaskOutput deleteTask(@RequestBody DeleteTaskInput deleteTaskInput) {
        return taskService.deleteTask(deleteTaskInput);
    }

    @PostMapping("update-task")
    public UpdateTaskOutput updateTask(@RequestBody UpdateTaskInput updateTaskInput) {
        return taskService.updateTask(updateTaskInput);
    }

}
