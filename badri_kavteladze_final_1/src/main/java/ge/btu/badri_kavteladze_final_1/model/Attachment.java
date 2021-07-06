package ge.btu.badri_kavteladze_final_1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pdfUrl;

    @ToString.Exclude
    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    private Book book;

}
