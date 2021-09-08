package com.example.springdatajdbc.model;


import org.springframework.data.annotation.Id;

public class Language {


  @Id
  private long languageId;
  private String name;
  private java.sql.Timestamp lastUpdate;


  public long getLanguageId() {
    return languageId;
  }

  public void setLanguageId(long languageId) {
    this.languageId = languageId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
