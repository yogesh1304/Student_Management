package com.nbsc.nbsc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    private Integer id;
    private String sname;
    private String course;

}
