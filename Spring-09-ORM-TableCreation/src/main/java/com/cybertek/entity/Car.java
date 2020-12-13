package com.cybertek.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // Create the table, inside has id, make , model Column
@Table(name = "cars")
@NoArgsConstructor
@Getter
@Setter
public class Car {

    /*
        @Id : will decide primary key in the table
     */

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
