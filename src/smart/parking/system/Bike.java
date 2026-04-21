/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;

/**
 *
 * @author User
 */
public class Bike extends Vehicle{
    
    public Bike(String number){
        super(number, new BikeFeeCalculator());
    }
    
    @Override
    public String getVehicleType(){
        
        return "Bike";
    }
    
}
