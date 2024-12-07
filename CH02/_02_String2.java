package CH02;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace("and", ","));// and를 ,로 변환
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Java"))); //s.indexOf("Java") = 7
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치 = 포함 O, 끝 위치 포함 X

        // 공백 제거
        s = "           I love Java.         ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
    }

}
