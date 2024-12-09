package CH05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회 -> idx를 이용하고 싶을 때
        String[] coffees = new String[] {"아아", "카페모카", "카페라떼", "카푸치노"};

        // 배열의 길이를 이용한 순회
        for (int i=0; i<coffees.length; i++){
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");
        // enhanced for (for-each) 반복문 -> 배열을 처음부터 끝까지
        for (String coffee : coffees){
            System.out.println(coffee+" 하나");
        }
        System.out.println("주세요");
    }
}
