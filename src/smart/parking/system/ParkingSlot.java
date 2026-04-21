/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;

/**
 *
 * @author User
 */
public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private Vehicle vehicle;
    String getSlotId;

    public ParkingSlot(int id) {
        slotId = id;
        isOccupied = false;
    }

    public void assignVehicle(Vehicle v) {

        vehicle = v;
        isOccupied = true;
    }

    public void removeVehicle() {
        vehicle = null;
        isOccupied = false;

    }

    public boolean isAvailable() {

        return !isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSlotId() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return slotId;
    }
    

}
