/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;
//https://www.geeksforgeeks.org/java/java-util-package-java/ 

import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class ParkingManager {

    private ArrayList<ParkingSlot> slots;
    private HashMap<String, ParkingTicket> activeTickets;
    public int totalSlots;

    public ParkingManager(int totalslots) {
        slots = new ArrayList<>();
        activeTickets = new HashMap<>();
        this.totalSlots = totalslots;

        for (int i = 1; i <= totalSlots; i++) {

            slots.add(new ParkingSlot(i));
        }

    }

    public ParkingSlot findAvailableSlot() {

        for (ParkingSlot Slot : slots) {

            if (Slot.isAvailable()) {
                return Slot;
            }

        }
        return null;

    }

    public ParkingTicket parkVehicle(Vehicle v) {

        ParkingSlot Slot = findAvailableSlot();

        if (Slot == null) {
            System.out.println("No Slot Available!");
            return null;
        }

        Slot.assignVehicle(v);

        String ticketId = "T" + System.currentTimeMillis();
        ParkingTicket ticket = new ParkingTicket(ticketId, v);

        activeTickets.put(ticketId, ticket);

        System.out.println("Vehicle Parked at slot: " + Slot.getSlotId());

        return ticket;

    }

    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    public double exitVehicle(String ticketId) throws InvalidTicketException {
        ParkingTicket ticket = activeTickets.get(ticketId);

        if (ticket == null) {
            // Throw exception instead of just printing
            throw new InvalidTicketException("Ticket ID '" + ticketId + "' not found in the system!");
        }

        ticket.closeTicket();

        long hours = ticket.getParkingDuration();
        double fee;
        fee = ticket.getVehicle().calculateFee(hours);

        for (ParkingSlot slot : slots) {
            if (slot.getVehicle() == ticket.getVehicle()) {
                slot.removeVehicle();
                break;
            }
        }

        activeTickets.remove(ticketId);

        long exactMinutes = ticket.getExactParkedMinutes();
        System.out.println("-----------------------------------");
        System.out.println("Total Parked Time: " + exactMinutes + " minutes");
        System.out.println("Billed Time: " + hours + " hour(s)");
        System.out.println("Total Parking Fee: " + fee + " Tk");
        System.out.println("-----------------------------------");

        return fee;

    }

    public void showAvailableSlots() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()) {
                System.out.println("Slot " + slot.getSlotId() + " is free");
            }
        }
    }

}
