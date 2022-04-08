package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String surname;

    private String gender;

    private Double height;

    private Double weight;

    private String phone_number;

    private String email;

    private String password;

    private Boolean privilege;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;
}
