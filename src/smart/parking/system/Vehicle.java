/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;

import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public abstract class Vehicle {

    //Uml onusare variable nisi
    protected String vehicleNumber;
    protected LocalDateTime entryTime;
    protected FeeCalculator feeCalculator;

    // constructor create korsi
// Inside Vehicle.java constructor
    public Vehicle(String number, FeeCalculator calculator) {
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Vehicle number cannot be empty!");
        }
        vehicleNumber = number;
        entryTime = LocalDateTime.now();
        feeCalculator = calculator;
    }

    public double calculateFee(long hours) {

        return feeCalculator.calculateFee(hours); //calculateFee interface ore call dim ar hours variable er modhe ja thakbe nibe
    }

    public abstract String getVehicleType(); // abstract dekhe sudhu body die rakhsi body car and bike class ee banaitam

}
