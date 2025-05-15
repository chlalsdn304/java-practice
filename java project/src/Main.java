import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seats = new String[10]; // 좌석 10개 고정
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
                // 좌석 상태 보기
                for (int i = 0; i < 10; i++) {
                    if (seats[i] == null) {
                        System.out.println((i + 1) + "번 좌석: 비어 있음");
                    } else {
                        System.out.println((i + 1) + "번 좌석: " + seats[i] + " 예약");
                    }
                }

            } else if (choice == 2) {
                // 좌석 예약
                System.out.print("예약할 좌석 번호 (1~10): ");
                int num = sc.nextInt();
                sc.nextLine(); // 개행 제거

                if (num < 1 || num > 10) {
                    System.out.println("잘못된 좌석 번호입니다.");
                } else if (seats[num - 1] != null) {
                    System.out.println("이미 예약된 좌석입니다.");
                } else {
                    System.out.print("예약자 이름: ");
                    String name = sc.nextLine();
                    seats[num - 1] = name;
                    System.out.println("예약 완료!");
                }

            } else if (choice == 3) {
                // 예약 취소
                System.out.print("취소할 좌석 번호 (1~10): ");
                int num = sc.nextInt();
                sc.nextLine(); // 개행 제거

                if (num < 1 || num > 10) {
                    System.out.println("잘못된 좌석 번호입니다.");
                } else if (seats[num - 1] == null) {
                    System.out.println("이미 비어 있는 좌석입니다.");
                } else {
                    System.out.print("예약자 이름 확인: ");
                    String name = sc.nextLine();
                    if (seats[num - 1].equals(name)) {
                        seats[num - 1] = null;
                        System.out.println("예약 취소 완료!");
                    } else {
                        System.out.println("이름이 일치하지 않습니다.");
                    }
                }

            } else if (choice == 4) {
                // 종료
                System.out.println("프로그램 종료.");
                break;

            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
}