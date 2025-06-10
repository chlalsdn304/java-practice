public class SeatManager {
    private String[] seats;

    public SeatManager(int seatCount) {
        seats = new String[seatCount];
    }

    public void showSeats() {
        System.out.println("\n=== 현재 좌석 상태 ===");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                System.out.printf("%d번 좌석: 비어 있음\n", i + 1);
            } else {
                System.out.printf("%d번 좌석: %s 예약\n", i + 1, seats[i]);
            }
        }
    }

    public String getSeat(int index) {
        return seats[index];
    }

    public void setSeat(int index, String name) {
        seats[index] = name;
    }
}