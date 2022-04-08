package com.example.demo.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToMany
//    @JoinColumn(name="plan_id")
    private List<Plan> plan = new ArrayList<Plan>();;

    private String name;

    private Double caloric_content;

    private Double weight;

    @Builder
    public Product(Integer id, String name, Double caloric, Double weight) {
        this.id = id;
        this.name = name;
        this.caloric_content = caloric;
        this.weight = weight;
    }
}
