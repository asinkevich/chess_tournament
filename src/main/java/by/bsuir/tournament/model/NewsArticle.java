package by.bsuir.tournament.model;

import org.springframework.samples.petclinic.BaseEntity;

public class NewsArticle extends BaseEntity {
  private String name;
  private String text;

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

  @Override
  public String toString() {
    return "NewsArticle{" +
        "name='" + name + '\'' +
        ", text='" + text + '\'' +
        '}';
  }
}
