public class ReservationManager {
    private SeatManager seatManager;

    public ReservationManager(SeatManager seatManager) {
        this.seatManager = seatManager;
    }

    public void reserveSeat(int num, String name) {
        if (num < 1 || num > 45) {
            System.out.println("잘못된 좌석 번호입니다.");
        } else if (seatManager.getSeat(num - 1) != null) {
            System.out.println("이미 예약된 좌석입니다.");
        } else if (isNameAlreadyReserved(name)) {
            System.out.println("이미 다른 좌석을 예약하셨습니다.");
        } else {
            seatManager.setSeat(num - 1, name);
            System.out.println("예약이 완료되었습니다.");
        }
    }

    public void cancelReservation(int num, String name) {
        if (num < 1 || num > 45) {
            System.out.println("잘못된 좌석 번호입니다.");
        } else if (seatManager.getSeat(num - 1) == null) {
            System.out.println("예약되지 않은 좌석입니다.");
        } else if (!seatManager.getSeat(num - 1).equals(name)) {
            System.out.println("이름이 일치하지 않습니다. 취소할 수 없습니다.");
        } else {
            seatManager.setSeat(num - 1, null);
            System.out.println("예약이 취소되었습니다.");
        }
    }

    private boolean isNameAlreadyReserved(String name) {
        for (int i = 0; i < 45; i++) {
            String reservedName = seatManager.getSeat(i);
            if (name.equals(reservedName)) {
                return true;
            }
        }
        return false;
    }
}