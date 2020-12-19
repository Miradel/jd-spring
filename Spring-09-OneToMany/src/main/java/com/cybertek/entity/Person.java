package com.cybertek.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "person")
    private List<Address> addresses;

//   Case1
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="person_id")
//    private List<Address> addresses;

    public Person( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
