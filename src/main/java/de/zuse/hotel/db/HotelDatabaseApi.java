package de.zuse.hotel.db;

import de.zuse.hotel.core.Booking;
import de.zuse.hotel.core.Guest;
import java.util.List;

public interface HotelDatabaseApi
{
    //Guest
    public boolean addGuest(Guest guest);
    public boolean removeGuest(int guestId);
    public boolean updateGuest( Guest updatedGuest); //should we use the Id or not
    public Guest getGuest(int guestID);
    public List<Guest> getAllGuest();

    //Booking
    public boolean addBooking(Booking booking);
    public boolean removeBooking(int bookingID);
    public boolean updateBooking(Booking updatedBooking);
    public Booking getBooking(int bookingID);
    public List<Booking> getAllBooking();

    /**
     * Optional
     */
    public void shutdown();
}
