package de.evoila.eprofiler.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.SEQUENCE;

@MappedSuperclass
public abstract class BaseEntity {
  @Id
  @GeneratedValue(strategy = AUTO)
  private long id;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
