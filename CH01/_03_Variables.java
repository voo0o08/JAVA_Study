package CH01;

public class _03_Variables {
    public static void main(String[] args) {
        String my_name; // my_name이라는 문자열 변수 선언
        my_name = "이윤서"; // 위에서 바로 선언해도 됨
        // String my_name = "이윤서"

        int hour = 15;

        System.out.println(my_name + "님, 배송이 시작되었습니다.");
        System.out.println(my_name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        my_name = "강백호"; // 값 update
        System.out.println(my_name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; // float변수를 사용할 때는 값 뒤에 f를 붙여야함
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // 21억 보다 크면 int아니고 long해야함
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}
