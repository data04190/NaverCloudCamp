package bitcamp.test.step16.vo;

public class Score {

  private String name;
  public int kor;
  public int eng;
  public int math;
  private int sum;
  private float aver;

  // 생성자: 인스턴스를 생성한 직후 호출하는 메소드
  public Score(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
  }

  public void compute() {
    this.sum = this.kor + this.eng+ this.math;
    this.aver = this.sum / 3f;
  }

  // getter : private 으로 접근이 막힌 변수의 값을 리턴해주는 메서드
  public int getSum() {
    return this.sum;
  }

  //getter : private 으로 접근이 막힌 변수의 값을 리턴해주는 메서드
  public float getAver() {
    return this.aver;
  }

  public String getName() {
    return this.name;
  }

}