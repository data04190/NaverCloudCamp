package bitcamp.myapp;

import bitcamp.util.Calculator;

public class Test {

  public static void main(String[] args) {
    // 2 * 3 + 7 - 2 / 2 = ?
    // 3 - 1 * 7 + 15 / 3 = ?
    // => 연산자 우선 순위를 고려하지 않고 앞에서부터 뒤로 순차적으로 계산한다.

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.init(2);
    c2.init(3);
    c1.multiple(3);
    c2.minus(1);
    c1.plus(7);
    c2.multiple(7);
    c1.minus(2);
    c2.plus(15);
    c1.divide(2);
    c2.divide(3);

    System.out.println(c1.getResult());
    System.out.println(c2.getResult());

  }

}