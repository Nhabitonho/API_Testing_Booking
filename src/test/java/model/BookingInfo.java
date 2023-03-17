package model;

import lombok.Data;

@Data
public class BookingInfo {
    private String firstname;
    private String lastname;
    private String totalprice;
    private Boolean depositpaid;
    private Dates bookingdates;
    private String checkin;
    private String checkout;
    private String additionalneeds;

}
