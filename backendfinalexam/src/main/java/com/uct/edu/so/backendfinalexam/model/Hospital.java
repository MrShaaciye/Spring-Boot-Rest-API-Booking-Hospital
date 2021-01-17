package com.uct.edu.so.backendfinalexam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hsid", insertable = false, nullable = false)
    private int id;

    @Column(name = "hsname", nullable = false)
    private String name;

    @Column(name = "hsphone", nullable = false)
    private String phone;

    @Column(name = "hsreason", nullable = false)
    private String reason;

    @Column(name = "hshospital", nullable = false)
    private String hospital;

    @Column(name = "hsdoctor", nullable = false)
    private String doctor;

    @Column(name = "hsfee", nullable = false)
    private BigDecimal fee;

    @Basic
    @Column(name = "hsdate", nullable = false)
    private Date date;

    @Column(name = "hsstatus", columnDefinition = "bit default 0", nullable = false)
    private boolean status;
}
