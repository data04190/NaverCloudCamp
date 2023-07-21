package coding.ex001;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;

public class Test2 {

  public static void main(String[] args) {
    String str = "Be strong, be fearless, be beautiful. "
        + "And believe that anything is possible when you have the right "
        + "people there to support you. ";

    Map<Character, Integer> result = new HashMap<>();

    for (char ch : str.toCharArray()) {

      // BiFunction<T,U,R> 인터페이스
      // => R apply(T, U);
      // Map.compute(키, 값을 리턴할 객체);

      class MyValue implements BiFunction<Character, Integer, Integer> {
        public Integer apply(Character t, Integer value) {
          // 이 메서드는 Map.compute() 호출한다.
          // 파라미터로 넘어오는 것은 기존에 저장된 키와 값이다.
          // 해당 키의 값이 없다면 null이 넘어온다.

          if (value == null) {
            return 1;
          }
          return value + 1;
        }

      }
      result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }

    for (Entry<Character, Integer> entry : result.entrySet()) {
      System.out.printf("%c: %d\n", entry.getKey(), entry.getValue());
    }

    char[] arr = str.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      char ch = arr[i];
      System.out.println(ch);
    }

  }

}
