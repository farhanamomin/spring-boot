package com.farhana.lmspractice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")

public class CourseDetails {
    @Id
    @GeneratedValue

    private int id;
    private String titlet;
    private String categoryt;
    private  String pricet;
    private String imgt;
    private  String desct;



}
