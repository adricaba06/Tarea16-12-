package com.salesianostriana.dam.tarea_16_12.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "pk")
@Embeddable
public class PK implements Serializable {

  private String subsystem;

  private String username;

  public PK(String subsystem, String username) {
    this.subsystem = subsystem;
    this.username = username;
  }

  public PK() {
  }

}