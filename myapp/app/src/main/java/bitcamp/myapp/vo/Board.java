package bitcamp.myapp.vo;

public class Board {

  private static int boardNo = 1;

  private int no;
  private String title;
  private String content;
  private String writer;
  private String password;
  private int viewCount;
  private long createdDate;

  public Board() {
    this.no = boardNo++;
    this.createdDate = System.currentTimeMillis();
  }

  public Board(int no) {
    this.no = no;
    this.createdDate = System.currentTimeMillis();
  }


  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }

    Board m = (Board) obj;
    if (this.getNo() != m.getNo()) {
      return false;
    }
    // if (this.getName() != null && !this.getName().equals(m.getName())) {
    // return false;
    // }
    // if (this.getEmail() != null && !this.getEmail().equals(m.getEmail())) {
    // return false;
    // }
    // if (this.getPassword() != null && !this.getPassword().equals(m.getPassword())) {
    // return false;
    // }
    // if (this.getGender() != m.getGender()) {
    // return false;
    // }
    return true;
  }

  public String getPassword() {
    return password;
  }

  public static int getBoardNo() {
    return boardNo;
  }

  public static void setBoardNo(int boardNo) {
    Board.boardNo = boardNo;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(long createdDate) {
    this.createdDate = createdDate;
  }



}