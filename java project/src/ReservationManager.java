public class ReservationManager {
    private SeatManager seatManager;

    public ReservationManager(SeatManager seatManager) {
        this.seatManager = seatManager;
    }

    public void reserveSeat(int num, String name) {
        if (num < 1 || num > 10) {
            System.out.println("잘못된 좌석 번호입니다.");
        } else if (seatManager.getSeat(num - 1) != null) {
            System.out.println("이미 예약된 좌석입니다.");
        } else {
            seatManager.setSeat(num - 1, name);
            System.out.println("예약이 완료되었습니다.");
        }
    }
}