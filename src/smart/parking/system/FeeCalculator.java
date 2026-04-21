/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;

/**
 *
 * @author User
 */
public interface FeeCalculator {
    
    /**
     *
     * @param hours
     * @return
     */
    double calculateFee( long hours);
    
}
