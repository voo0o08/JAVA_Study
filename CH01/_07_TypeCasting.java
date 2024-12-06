package CH01;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

// 형변환
public class _07_TypeCasting {
    public static void main(String[] args) {
        // int -> float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        // float, double -> int
        float score_f = 93.5F;
        double score_d = 98.8;
        System.out.println((int) score_f); //93 -> 소수점 그냥 버림
        System.out.println((int) score_d); //98 -> 소수점 그냥 버림

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93+98의 결과가 나옴
        System.out.println(score); // 191

        // 만약 93 + 98.8을 score_d에 넣으면 93은 자동으로 93.0으로 연산
        // 그래서 에러 안남
        score_d = 93 + 98.8; // = (double)93 + 98.8
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double 범위가 커질 때 : 자동 형변환

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int 범위가 작아질 때 : 수동 형변환

        // 숫자를 문자열로
        System.out.println("\n숫자 -> 문자열");
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        // 위에 두개 똑같음
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        System.out.println("\n문자열 -> 숫자");
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d);

    }
}

