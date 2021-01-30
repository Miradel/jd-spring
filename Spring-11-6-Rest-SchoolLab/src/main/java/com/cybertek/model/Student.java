package com.cybertek.model;

import com.cybertek.enums.AddressType;
import com.cybertek.enums.Status;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value={"hibernateLazyInitializer"},ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private LocalDate birthday;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Parent parent;



}
