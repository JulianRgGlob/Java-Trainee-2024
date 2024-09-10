package com.rest.RestServiceDoc.dao.entity.book;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "Book")
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @OneToOne
    private Category category;
    @Column
    private String name;
    @OneToOne
    private List<Tags> tags;
    @Column
    private StatusBook statusBook;

}
