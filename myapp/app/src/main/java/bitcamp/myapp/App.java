package bitcamp.myapp;

// 코드 본문에서 사용할 클래스가 어떤 패키지의 클래스인지 지정한다.
import java.util.Scanner;

public class App {

  static final int MAX_SIZE = 100;

  static Scanner scanner = new Scanner(System.in);
  static int[] no = new int[MAX_SIZE];
  static String[] name = new String[MAX_SIZE];
  static String[] email = new String[MAX_SIZE];
  static String[] password = new String[MAX_SIZE];
  static char[] gender = new char[MAX_SIZE];

  public static void main(String[] args) {

    // 키보드 스캐너 준비

    int userId = 1;
    int length = 0;

    printTitle();

    // 회원정보 등록
    for (int i = 0; i < MAX_SIZE; i++) {
      inputMember(i, userId);
      length++;
      if (!promptContinue()) {
        break;
      }
    }

    printMembers(length);

    scanner.close();
  }

  static void printTitle() {
    System.out.println("나의 목록 관리 시스템");
    System.out.println("----------------------------------");
  }

  static void inputMember(int i, int userId) {

    System.out.print("이름? ");
    name[i] = scanner.next();

    System.out.print("이메일? ");
    email[i] = scanner.next();

    System.out.print("암호? ");
    password[i] = scanner.next();

    /*
     * 성별?
     * 
     * 1. 남자
     * 2. 여자
     * > 1
     * > 2
     * > 3
     * 무효한 번호입니다?
     * 성별:
     * 1. 남자
     * 2. 여자
     * >
     * 
     */

    loop: while (true) {

      System.out.println("성별: ");
      System.out.println(" 1. 남자");
      System.out.println(" 2. 여자");
      System.out.print("> ");
      String menuNo = scanner.next();
      scanner.nextLine(); // 입력 값(token)을 읽고 난 후에 남아 있는 줄바꿈 코드를 제거한다.

      // if (menuNo.equals("1")) {
      // gender[i] = 'M';
      // break;
      // } else if (menuNo.equals("2")) {
      // gender[i] = 'W';
      // break;
      // } else {
      // System.out.println("무효한 번호입니다.");
      // }

      switch (menuNo) {
        case "1":
          gender[i] = 'M';
          break loop;
        case "2":
          gender[i] = 'W';
          break loop;
        default:
          System.out.println("무효한 번호입니다.");
      }
    }

    no[i] = userId++;
  }

  static boolean promptContinue() {
    System.out.println("계속 하시겠습니까?(Y/n) ");
    String response = scanner.nextLine();
    if (!response.equals("") && !response.equalsIgnoreCase("Y")) {
      return false;
    }
    return true;
  }

  static void printMembers(int length) {

    System.out.println("---------------------------------------");

    System.out.println("번호, 이름, 이메일, 성별");
    System.out.println("---------------------------------------");

    for (int i = 0; i < length; i++) {
      System.out.printf("%d, %s, %s, %c\n", no[i], name[i], email[i], gender[i]);
    }
  }

}