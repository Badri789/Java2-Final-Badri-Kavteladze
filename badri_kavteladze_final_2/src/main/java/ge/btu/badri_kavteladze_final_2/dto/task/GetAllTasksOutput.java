package ge.btu.badri_kavteladze_final_2.dto.task;

import lombok.Data;

import java.util.List;

@Data
public class GetAllTasksOutput {
    List<TaskDTO> tasks;
}
