/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;

/**
 *
 * @author User
 */
public class BikeFeeCalculator implements FeeCalculator {
    @Override
    public double calculateFee(long hours){
        
        return hours*2000;
    }
}
