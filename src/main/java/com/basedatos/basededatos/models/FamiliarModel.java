package com.basedatos.basededatos.models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(schema = "registro")
@CrossOrigin
public class FamiliarModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Last_Name")
    private String Last_Name;

    @Column(name = "Birth_Date")
    private String Birth_Date;

    @Column(name = "Type_Familiar")
    private String Type_Familiar;

    @Column(name = "Status")
    private String Status;
}
