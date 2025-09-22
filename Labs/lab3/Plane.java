import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        this.seat = new PlaneSeat[12];
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
        numEmptySeat = 12;
    }

    public PlaneSeat[] sortSeats() {
        PlaneSeat[] sortedSeats = Arrays.copyOf(seat, seat.length);
        Arrays.sort(sortedSeats, Comparator.comparingInt(PlaneSeat::getCustomerID));
        return sortedSeats;
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + this.numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        for (PlaneSeat s: seat) {
            if (!s.isOccupied()) {
                System.out.println("SeatID " + s.getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] tempSeats;

        if (bySeatId) {
            tempSeats = Arrays.copyOf(seat, seat.length);
            Arrays.sort(tempSeats, Comparator.comparingInt(PlaneSeat::getSeatID));
        } else {
            tempSeats = sortSeats();
        }

        System.out.println("The assigned seats are: ");
        for (PlaneSeat s: tempSeats) {
            if (s.isOccupied()) {
                System.out.println("SeatID: " + s.getSeatID() + " assigned to CustomerID " + s.getCustomerID());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        PlaneSeat s = seat[seatId - 1];
        if (!s.isOccupied()) {
            s.assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat " + seatId + " assigned to customer " + cust_id + "!");
        } else {
            System.out.println("Seat " + seatId + " is already occupied!");
        }
    }

    public void unAssignSeat(int seatId) {
        PlaneSeat s = seat[seatId - 1];
        if (s.isOccupied()) {
            s.unassign();
            numEmptySeat++;
            System.out.println("Seat " + seatId + " unassigned!");
        } else {
            System.out.println("Seat " + seatId + " is already empty!");
        }
    }
}