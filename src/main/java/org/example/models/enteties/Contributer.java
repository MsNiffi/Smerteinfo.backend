package org.example.models.enteties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Contributer {
    @Id
    private int contrbuterId;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String linkToWebsite;


}
