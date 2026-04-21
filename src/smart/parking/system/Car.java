/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;

/**
 *
 * @author User
 */
public class Car extends Vehicle {
    
    public Car(String number){
        super(number, new CarFeeCalculator());
    }
    @Override
    public String getVehicleType(){
        
        return "Car";
        
    }
}
