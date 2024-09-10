package com.api.crud.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@Entity
@Table(name = "User")
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID id;

    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private Integer number;



}
