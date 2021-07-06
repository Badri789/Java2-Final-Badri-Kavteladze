package ge.btu.badri_kavteladze_final_2.dto.task;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateTaskInput {
    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
}
