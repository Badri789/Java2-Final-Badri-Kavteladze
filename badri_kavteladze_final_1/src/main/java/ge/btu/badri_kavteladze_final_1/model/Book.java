package ge.btu.badri_kavteladze_final_1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;

    @ToString.Exclude
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Tag> tags = new ArrayList<>();

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();

    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL)
    private Attachment attachment;

}
