package bitcamp.myapp;

import bitcamp.util.Calculator;

public class Test {

  public static void main(String[] args) {
    // 2 * 3 + 7 - 2 / 2 = ?
    // 3 - 1 * 7 + 15 / 3 = ?
    // => 연산자 우선 순위를 고려하지 않고 앞에서부터 뒤로 순차적으로 계산한다.

    Calculator.init(2);
    Calculator.multiple(3);
    Calculator.plus(7);
    Calculator.minus(2);
    Calculator.divide(2);

    System.out.println(Calculator.getResult());

    Calculator.init(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.plus(15);
    Calculator.divide(3);

    System.out.println(Calculator.getResult());

  }

}