package com.classroom.assignment.model.request;

public class Comment {

  private String name;
  private String content;
  private String Email;

  public Comment(String name, String content, String Email) {
    this.setName(name);
    this.setContent(content);
    this.setEmail(Email);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }
}
