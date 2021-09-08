package com.example.springdatajdbc.model;


import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Film {

  @Id
  private long filmId;
  private String title;
  private String description;
  private String releaseYear;
  private long languageId;
  private long rentalDuration;
  private String rentalRate;
  private long length;
  private String replacementCost;
  private String rating;
  private LocalDate lastUpdate;
  private String specialFeatures;
  private String fulltext;
  private long versionValue;


  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(String releaseYear) {
    this.releaseYear = releaseYear;
  }


  public long getLanguageId() {
    return languageId;
  }

  public void setLanguageId(long languageId) {
    this.languageId = languageId;
  }


  public long getRentalDuration() {
    return rentalDuration;
  }

  public void setRentalDuration(long rentalDuration) {
    this.rentalDuration = rentalDuration;
  }


  public String getRentalRate() {
    return rentalRate;
  }

  public void setRentalRate(String rentalRate) {
    this.rentalRate = rentalRate;
  }


  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }


  public String getReplacementCost() {
    return replacementCost;
  }

  public void setReplacementCost(String replacementCost) {
    this.replacementCost = replacementCost;
  }


  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }


  public LocalDate getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(LocalDate lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public String getSpecialFeatures() {
    return specialFeatures;
  }

  public void setSpecialFeatures(String specialFeatures) {
    this.specialFeatures = specialFeatures;
  }


  public String getFulltext() {
    return fulltext;
  }

  public void setFulltext(String fulltext) {
    this.fulltext = fulltext;
  }


  public long getVersionValue() {
    return versionValue;
  }

  public void setVersionValue(long versionValue) {
    this.versionValue = versionValue;
  }

}
