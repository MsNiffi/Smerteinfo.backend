package org.example.models.enteties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter

public class Topic {
    @Id
    private int topicId;
    private String name;
    private String description;

}
