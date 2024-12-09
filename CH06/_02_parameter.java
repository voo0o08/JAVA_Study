package CH06;

public class _02_parameter {
    public static void power(int val){
        int result = val * val;
        System.out.println("number의 2승은? "+result);
    }

    public static void powerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i<exponent; i++){
            result *= num;
        }
        System.out.println(num +"의 " + exponent + "승은 " + result);
    }

    public static void main(String[] args) {
        // 파라미터 = 전달값
        power(3);

        powerByExp(2, 3);
    }
}
