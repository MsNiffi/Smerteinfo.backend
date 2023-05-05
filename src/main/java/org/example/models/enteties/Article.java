package org.example.models.enteties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Article {
@Id
private int articleId;
private String title;
private String body;
private LocalDate publishedOn;

@ManyToMany
@JoinTable(name = "contributer_article", joinColumns = {@JoinColumn(name = "article_id")},inverseJoinColumns = {@JoinColumn(name = "contributer_id")})
private Set<Contributer> authors;

}
