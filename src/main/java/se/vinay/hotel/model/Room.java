package se.vinay.hotel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Room
{
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private Boolean isBooked = false;
    private List<BookedRoom> bookings;

    // to avoid nullPointerException
    public Room()
    {
        this.bookings = new ArrayList<>();
    }
}
