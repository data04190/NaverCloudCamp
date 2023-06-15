package bitcamp.myapp.handler;

import bitcamp.myapp.vo.Member;

public class MemberList {

  private static final int DEFAULT_SIZE = 3;

  private Member[] members = new Member[DEFAULT_SIZE];
  private int length;


  public void add(Member m) {
    if (this.length == members.length) {
      // 기존 배열 보다 50% 큰 배열을 새로 만든다.
      increase();
    }

    this.members[this.length++] = m;
  }

  private void increase() {

    Member[] arr = new Member[members.length + (members.length >> 1)];

    // 기존 배열의 값을 새 배열로 복사한다.
    for (int i = 0; i < members.length; i++) {
      arr[i] = members[i];
    }
    members = arr;

    // System.out.println("배열 확장: " + members.length);
  }

  public Member[] list() {
    // 리턴할 값을 담을 배열을 생성
    Member[] arr = new Member[this.length];

    for (int i = 0; i < this.length; i++) {
      arr[i] = this.members[i];
    }
    return arr;
  }

  public Member get(int no) {
    for (int i = 0; i < this.length; i++) {
      Member m = this.members[i];
      if (m.getNo() == no) {
        return m;
      }
    }
    return null;
  }


  public boolean delete(int no) {
    int deletedIndex = indexOf(no);
    if (deletedIndex == -1) {
      return false;
    }

    for (int i = deletedIndex; i < this.length - 1; i++) {
      this.members[i] = this.members[i + 1];
    }

    this.members[--this.length] = null;
    return true;
  }


  private int indexOf(int memberNo) {
    for (int i = 0; i < this.length; i++) {
      Member m = this.members[i];
      if (m.getNo() == memberNo) {
        return i;
      }
    }
    return -1;
  }

  //
  // private boolean available() {
  // return this.length < DEFAULT_SIZE;
  // }



}
