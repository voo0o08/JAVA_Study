package CH05;
/*
배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램
- 신발 사이즈는 250~295 5단위로 증가
- 신발 사이즈 수는 총 10가지
*/
public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열 사용하기
        int[] options = new int[10];

//        int size = 250;
        for (int i=0; i<options.length;i++){
            options[i] = 250 + i*5;
        }

        for(int option:options){
            System.out.println("사이즈 "+option);
        }
    }
}
