package com.codegym.c0624g1springboot.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
}
