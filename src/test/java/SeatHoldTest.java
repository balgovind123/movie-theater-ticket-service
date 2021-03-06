import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by asonawane on 11/7/17.
 */
public class SeatHoldTest {


    @Test
    public void testGetNumberOfSeats() throws Exception {
        int numberOfSeats = 5;
        String email = "ak93@gmail.com";
        int[][] seatsOnHold = {{0, 0}, {0, 1}, {0, 2}};

        SeatHold seat = new SeatHold(numberOfSeats, email, seatsOnHold);

        assertThat(seat.getNumberOfSeats()).isEqualTo(5);
    }

    @Test
    public void testGetSeatHoldId() throws Exception {
        int numberOfSeats = 5;
        String email = "ak93@gmail.com";
        int[][] seatsOnHold = {{0, 0}, {0, 1}, {0, 2}};

        SeatHold seat = new SeatHold(numberOfSeats, email, seatsOnHold);

        assertThat(seat.getSeatHoldId()).isBetween(0, 1000);
    }

    @Test
    public void testGetCustomerEmail() throws Exception {
        int numberOfSeats = 5;
        String email = "ak93@gmail.com";
        int[][] seatsOnHold = {{0, 0}, {0, 1}, {0, 2}};

        SeatHold seat = new SeatHold(numberOfSeats, email, seatsOnHold);

        assertThat(seat.getCustomerEmail()).isEqualTo(email);
    }

    @Test
    public void testGetSeatsOnHold() throws Exception {
        int numberOfSeats = 5;
        String email = "ak93@gmail.com";
        int[][] seatsOnHold = {{0, 0}, {0, 1}, {0, 2}};

        SeatHold seat = new SeatHold(numberOfSeats, email, seatsOnHold);

        assertEquals(seatsOnHold, seat.getSeatsOnHold());
    }
}