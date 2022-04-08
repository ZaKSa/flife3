package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Plan {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToMany(mappedBy = "plan")
    private List<Product> products = new ArrayList<Product>();

    @ManyToMany//(mappedBy = "plan")
    private List<Exercise> exercises = new ArrayList<Exercise>();

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> user = new ArrayList<User>();

    /*@ManyToMany(fetch = FetchType.EAGER)
    Set<Exercise> exercises = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Exercise> products = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "plans")
    Set<User> users = new HashSet<>();*/
}
