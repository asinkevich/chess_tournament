package by.bsuir.tournament.model;

import org.springframework.samples.petclinic.BaseEntity;

import java.util.Date;

public class NewsArticle extends BaseEntity {
  private String name;
  private String text;
  private Date date;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return getName();
  }
}
