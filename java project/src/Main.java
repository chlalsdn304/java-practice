import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seats = new String[10];
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
                showSeats(seats);



            } else if (choice == 2) {
                System.out.print("예약할 좌석 번호를 입력하세요 (1~10): ");
                int num = sc.nextInt();
                sc.nextLine(); // 개행 제거

                if (num < 1 || num > 10) {
                    System.out.println("잘못된 좌석 번호입니다.");
                } else if (seats[num - 1] != null) {
                    System.out.println("이미 예약된 좌석입니다.");
                } else {
                    System.out.print("예약자 이름을 입력하세요: ");
                    String name = sc.nextLine();
                    seats[num - 1] = name;
                    System.out.println("예약이 완료되었습니다.");
                }

            } else if (choice == 3) {
                // 예약 취소
                System.out.print("취소할 좌석 번호를 입력하세요 (1~10): ");
                int num = sc.nextInt();
                sc.nextLine(); // 개행 제거

                if (num < 1 || num > 10) {
                    System.out.println("잘못된 좌석 번호입니다.");
                } else if (seats[num - 1] == null) {
                    System.out.println("예약되지 않은 좌석입니다.");
                } else {
                    System.out.print("예약자 이름을 입력하세요: ");
                    String name = sc.nextLine();

                    if (seats[num - 1].equals(name)) {
                        seats[num - 1] = null;
                        System.out.println("예약이 취소되었습니다.");
                    } else {
                        System.out.println("이름이 일치하지 않습니다. 취소할 수 없습니다.");
                    }
                }

            } else if (choice == 4) {
                // 종료
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }

        sc.close();
    }

    public static void showSeats(String[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                System.out.printf("%d번 좌석: 비어 있음\n", i + 1);
            } else {
                System.out.printf("%d번 좌석: %s 예약\n", i + 1, seats[i]);
            }
        }
    }
}
