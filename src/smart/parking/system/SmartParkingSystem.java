/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smart.parking.system;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SmartParkingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
              ParkingManager manager = new ParkingManager(5); // 5 Slots Passes
       
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Park Car");
            System.out.println("2. Park Bike");
            System.out.println("3. Exit Vehicle");
            System.out.println("4. Show Slots");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Car Number: ");
                String num = sc.next();

                Vehicle car = new Car(num);

                ParkingTicket ticket = manager.parkVehicle(car);

                if (ticket != null)
                    System.out.println("Ticket ID: " + ticket.getTicketId());

            }

            else if (choice == 2) {

                System.out.print("Enter Bike Number: ");
                String num = sc.next();

                Vehicle bike = new Bike(num);

                ParkingTicket ticket = manager.parkVehicle(bike);

                if (ticket != null)
                    System.out.println("Ticket ID: " + ticket.getTicketId());

            }

            else if (choice == 3) {

                System.out.print("Enter Ticket ID: ");
                String id = sc.next();

                manager.exitVehicle(id);

            }

            else if (choice == 4) {

                manager.showAvailableSlots();

            }

            else if (choice == 5) {
                break;
            }

        }

        sc.close();

    }
        
        
    
}
