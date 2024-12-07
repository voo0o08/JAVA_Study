package CH02;
/*
주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램 작성
- 주민번호 13자리
- 앞 6자리는 생년월일, 뒷7자리는 ~
- 입력 데이터는 -를 포함한 14자리의 문자열 형태
 */
public class _Quiz_03 {
    public static void main(String[] args) {
        String my_id = "901231-1234567";

        System.out.println(my_id.substring(0, my_id.indexOf("-")+2));
    }
}
