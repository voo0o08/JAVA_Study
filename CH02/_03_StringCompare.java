package CH02;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false

        // 대소문자 구분 없이 내용이 같은지 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true / 내용만 비교
        System.out.println(s1 == s2); // true / 주소지 비교

        s2 = new String("1234"); // new로 재선언
        System.out.println(s1.equals(s2)); // true / 내용만 비교
        System.out.println(s1 == s2); // flase / 주소지 비교
    }


}
