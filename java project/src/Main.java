import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SeatManager seatManager = new SeatManager(10);
        ReservationManager reservationManager = new ReservationManager(seatManager);
        int choice;

        while (true) {
            System.out.println("\n=== 버스 좌석 예약 시스템 ===");
            System.out.println("1. 좌석 상태 보기");
            System.out.println("2. 좌석 예약하기");
            System.out.println("3. 예약 취소하기");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");
            choice = sc.nextInt();

            if (choice == 1) {
                seatManager.showSeats();
            } else if (choice == 2) {
                System.out.print("예약할 좌석 번호를 입력하세요 (1~10): ");
                int num = sc.nextInt();
                sc.nextLine();
                System.out.print("예약자 이름을 입력하세요: ");
                String name = sc.nextLine();
                reservationManager.reserveSeat(num, name);
            } else if (choice == 3) {
                System.out.print("취소할 좌석 번호를 입력하세요 (1~10): ");
                int num = sc.nextInt();
                sc.nextLine();
                System.out.print("예약자 이름을 입력하세요: ");
                String name = sc.nextLine();
                reservationManager.cancelReservation(num, name);
            } else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }

        sc.close();
    }
}