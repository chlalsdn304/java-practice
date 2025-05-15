import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("1부터 100사이의 수를 입력하세요: ");
        num = scanner.nextInt();

        for (int i = 1; i <= 100; i++ ) {
            if (1 <= num && num <= 100) {
                System.out.println("입력 완료! 프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다. 1부터 100 사이의 수를 입력하세요.");
                num = scanner.nextInt();
            }

        }
    }
}