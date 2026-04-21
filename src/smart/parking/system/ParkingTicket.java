/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;
//https://www.geeksforgeeks.org/java/java-time-duration-class-in-java/

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class ParkingTicket {

    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public ParkingTicket(String id, Vehicle vehicle) {
        ticketId = id;
        this.vehicle = vehicle;
        entryTime = LocalDateTime.now();

    }

    public void closeTicket() {
        exitTime = LocalDateTime.now();
    }

    //https://www.geeksforgeeks.org/java/java-time-duration-class-in-java/ ekhan theke paisi
    public long getParkingDuration() {
        long minutes = Duration.between(entryTime, exitTime).toMinutes();
        return (long) Math.ceil(minutes / 60.0); // Rounds up to 1 hour even for 5 mins
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return vehicle;
    }

}
