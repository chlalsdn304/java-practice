import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 전체 좌석 수 입력
        System.out.print("전체 좌석 수를 입력하세요: ");
        int totalSeats = sc.nextInt();
        int[] seats = new int[totalSeats]; // 0이면 빈 자리, 1이면 예약됨

        // 2. 메뉴 출력
        System.out.println("\n메뉴를 선택하세요:");
        System.out.println("1. 좌석 상태 보기");
        System.out.println("2. 좌석 예약하기");
        System.out.println("3. 좌석 반납하기");

        int choice = sc.nextInt();

        // 3. 메뉴 선택에 따른 처리
        if (choice == 1) {
            // 좌석 상태 보기
            System.out.println("\n[좌석 상태]");
            for (int i = 0; i < totalSeats; i++) {
                System.out.printf("좌석 %d: %s\n", i + 1, (seats[i] == 0 ? "빈자리" : "예약됨"));
            }

        } else if (choice == 2) {
            // 좌석 예약하기
            System.out.print("예약할 좌석 번호를 입력하세요 (1 ~ " + totalSeats + "): ");
            int seatNum = sc.nextInt();

            if (seatNum < 1 || seatNum > totalSeats) {
                System.out.println("잘못된 좌석 번호입니다.");
            } else if (seats[seatNum - 1] == 1) {
                System.out.println("이미 예약된 좌석입니다.");
            } else {
                seats[seatNum - 1] = 1;
                System.out.println("좌석 " + seatNum + "이 예약되었습니다.");
            }

        } else if (choice == 3) {
            // 좌석 반납하기
            System.out.print("반납할 좌석 번호를 입력하세요 (1 ~ " + totalSeats + "): ");
            int seatNum = sc.nextInt();

            if (seatNum < 1 || seatNum > totalSeats) {
                System.out.println("잘못된 좌석 번호입니다.");
            } else if (seats[seatNum - 1] == 0) {
                System.out.println("해당 좌석은 이미 빈 자리입니다.");
            } else {
                seats[seatNum - 1] = 0;
                System.out.println("좌석 " + seatNum + "이 반납되었습니다.");
            }

        } else {
            System.out.println("잘못된 선택입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}