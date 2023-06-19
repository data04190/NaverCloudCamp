package bitcamp.test;

import bitcamp.myapp.vo.Member;

public class Test2 {

  public static void main(String[] args) {

    Member m1 = new Member();
    m1.setNo(1);
    m1.setName("홍길동");
    m1.setEmail("hong@test.com");
    m1.setPassword("1111");
    m1.setGender('M');

    Member m2 = new Member();
    m2.setNo(1);
    m2.setName("유관순");
    m2.setEmail("hong@test.com");
    m2.setPassword("2222");
    m2.setGender('M');

    System.out.println(m1.equals(m2));
    System.out.println(m1 == m2);

    Object obj1 = m1;
    Object obj2 = m2;

    System.out.println(obj1.equals(obj2));
    // 다형적 변수의 규칙
    // => 컴파일이 통과되면,
    // JVM이 메서드를 호출할 때,
    // 다형적 변수가 실제 가리키는 인스턴스의 클래스부터 찾아 올라 간다.
  }

}
