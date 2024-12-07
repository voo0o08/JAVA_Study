package CH02;

public class _01_Stiring1
{
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); //29

        // 대소문자 변환
        System.out.println(s.toUpperCase());

        // 소문자로 변환
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // flase
        System.out.println(s.indexOf("Java")); // 위치정보 7
        System.out.println(s.indexOf("C#")); // 포함 안되면 -1
        System.out.println(s.indexOf("and")); // 12 -> 제일 처음 나온 and
        System.out.println(s.lastIndexOf("and")); // 23 -> 제일 마지막에 나온 and
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.endsWith(".")); // .으로 안끝나서 flase


    }
}
