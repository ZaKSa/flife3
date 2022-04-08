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
public class Exercise {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToMany
    //@JoinColumn(name="plan_id")
    private List<Plan> plan = new ArrayList<Plan>();;

    private String name;

    private Double energy_consumption;

    private Integer duration;
}
