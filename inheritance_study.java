class Cal{
    int v1, v2;
    // 생성자
    Cal(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
    }
}

// 상속 클래스
class Cal3 extends Cal{
    Cal3(int v1, int v2){
        super(v1, v2); //super = 부모클래스
        System.out.println("Cal3 생성자");
    }
}

public class inheritance_study {
    public static void main(String[] args) {
        Cal c = new Cal(2, 1);
        Cal3 c3 = new Cal3(2, 1);
    }
}
