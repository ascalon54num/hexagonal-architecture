package com.example.app.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class ProfileEntity {

    @Id
    private Long id;
    private String name;
}
