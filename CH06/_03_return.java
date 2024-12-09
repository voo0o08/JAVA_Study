package CH06;

public class _03_return {
    // 호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-4567";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    public static void main(String[] args) {
        // 반환값 = return
        String contact = getPhoneNumber();
        System.out.println("호텔 전화번호 : "+ contact);

        String address = getAddress();
        System.out.println("호텔 주소 : "+address);
    }
}
