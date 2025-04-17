import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음료의 종류를 선택하세요:/n 1.아메리카노(3000원),2.카페라떼(4000원),3.카푸치노(4500원)  ");
        int cf1,cf2,cf3,won,sma,med,lag;

        cf1 =scanner.nextInt();
        cf2 =scanner.nextInt();
        cf3 =scanner.nextInt();
        if (cf1==1) {
            won =3000;
        } else if (cf2 == 2 ) {
            won =4000;
        } else if (cf3 == 3) {
            won =4500;
        }

        System.out.print("음료의 크기를 선택하세요: 1.Small(기본가격),2.Medium(500원),3.Large(1000원)  ");

        sma =scanner.nextInt();
        med =scanner.nextInt();
        lag =scanner.nextInt();
        if (med==2) {
            won = +500;
        } else if ( lag== 3 ) {
            won = +1000;
        }

        System.out.print("추가 옵션을 선택하세요:1.기본(없음),2.샷추가(+500원),3.시럽추가(+300원),4.샷과 시럽 모두 추가(+800원)  ");

        sma =scanner.nextInt();
        med =scanner.nextInt();
        lag =scanner.nextInt();
        if (med==2) {
            won = +500;
        } else if ( lag== 3 ) {
            won = +1000;
        }




    }
}