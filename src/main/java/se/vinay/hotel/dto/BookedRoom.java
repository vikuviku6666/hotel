package se.vinay.hotel.dto;

public record BookedRoom(String roomNumber, String roomType, String roomStatus, String guestName, String guestEmail, String guestPhone, String checkInDate, String checkOutDate)
{
}
