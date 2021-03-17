package com.sha.springbootawscodepipeline.model;


import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlIDREF;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="username", unique= true)
    private String username;

    @Column(name= "create_time")
    private LocalDateTime createTime;
}
