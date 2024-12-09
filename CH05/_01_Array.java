package CH05;

public class _01_Array {
    public static void main(String[] args) {
        // 변수 : 하나의 자료
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        String coffeeRoss = "아아";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");

        // 배열 선언 첫 번째 방법
        String[] coffees = new String[4];

        // 두 번째 방법 -> []위치가 앞이던지 뒤던지
        String coffees2[] = new String[4];
        coffees2[0] = "아메리카노"; // 0부터 시작
        coffees2[1] = "카페모카";
        coffees2[2] = "라떼";
        coffees2[3] = "카푸치노";

        // 배열 선언 세 번째 방법
        String[] coffees3 = new String[] {"아아", "카페모카", "카페라떼", "카푸치노"};

        // 배열 선언 네 번째 방법
        String[] coffees4 = {"아아", "카페모카", "카페라떼", "카푸치노"};
        System.out.println("---------------------------");

        // 값 변경
        coffees4[2] = "뜨아";

        // 커피 주문
        for (int i=0;i<=3;i++){
            System.out.println(coffees4[i] + " 하나");
        }

        // 다른 자료형도 똑같다
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};

    }
}
