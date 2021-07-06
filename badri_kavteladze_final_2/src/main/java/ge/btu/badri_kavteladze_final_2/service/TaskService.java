package ge.btu.badri_kavteladze_final_2.service;

import ge.btu.badri_kavteladze_final_2.dto.task.*;

public interface TaskService {
    GetTaskOutput getTask(GetTaskInput getTaskInput);

    GetAllTasksOutput getAllTasks(GetAllTasksInput getAllTasksInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);

    UpdateTaskOutput updateTask(UpdateTaskInput updateTaskInput);
}
