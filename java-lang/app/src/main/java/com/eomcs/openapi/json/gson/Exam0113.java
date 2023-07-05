// JSON 라이브러리 준비 - Gson 라이브러러 가져오기
// 객체 --> JSON 문자열 : 객체의 필드 값을 json 형식의 문자열로 만들기
package com.eomcs.openapi.json.gson;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;

public class Exam0112 {
  public static void main(String[] args) {

    // 1) 객체 준비
    Member m = new Member();
    m.setNo(100);
    m.setName("홍길동");
    m.setEmail("hong@test.com");
    m.setPassword("1111");
    m.setPhoto("hong.gif");
    m.setTel("010-2222-1111");
    m.setRegisteredDate(new Date(System.currentTimeMillis()));

    // 2) JSON 처리 객체 준비
    // Date 타입의 값을 내보내고 가져올 때 사용할 변환 도구를 준비

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    GsonBuilder builder = new GsonBuilder();
    builder.registerTypeAdapter(Date.class, new JsonSerializer<Date>() {
      return new JsonPrimitive(dateFormat.format(src));
      }
    });

  Gson gson = builder.create();

  // 3) 객체의 값을 JSON 문자열로 얻기
  String jsonStr = gson.toJson(m);

  System.out.println(jsonStr);
}}


