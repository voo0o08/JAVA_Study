package CH05;

import java.beans.beancontext.BeanContextChild;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i=0; i<seats.length; i++){
            for (int j=0; j<seats[i].length; j++){
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------");
        // 세로 크기 10 X 가로 크기 15에 해당하는 영화관 좌석 선언
        // + 선언만 할 때는 크기 선언 해줘야함!
        String[][] seats3 = new String[10][15];
        for (int i=0; i<seats3.length; i++){
            for (int j=0; j<seats3[i].length; j++){
                char seat_id =  (char) (65+i); // 형변환
                seats3[i][j] = seat_id + String.valueOf(j+1);

            }
        }
        for (int i=0; i<seats3.length; i++){
            for (int j=0; j<seats3[i].length; j++){
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
