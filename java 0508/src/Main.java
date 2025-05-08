import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();


        switch (score/10) {
            case 10:
                System.out.print("성적: A");
                break;

            case 9:
                System.out.print("성적: A");
                break;

            case 8:
                System.out.print("성적: B");
                break;

            case 7:
                System.out.print("성적: C");
                break;

            case 6:
                System.out.print("성적: D");
                break;

                default:
                System.out.println("성적: F");
                System.exit(0); // 프로그램 종료
        }
    }
}