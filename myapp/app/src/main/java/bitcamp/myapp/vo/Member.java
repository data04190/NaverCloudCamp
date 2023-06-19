package bitcamp.myapp.vo;

public class Member {
  private int no;
  private String name;
  private String email;
  private String password;
  private char gender;

  public int getNo() {
    return this.no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public char getGender() {
    return this.gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

}
