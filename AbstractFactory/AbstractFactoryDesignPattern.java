package com.creational.abstractfactory;

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {
        // Create a SimpleVehicleFactory
        VehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();

        // Create vehicles using SimpleVehicleFactory
        Vehicle marutiSwift = simpleVehicleFactory.getVehicle("MARUTI");
        Vehicle hyundaiSantro = simpleVehicleFactory.getVehicle("HYUNDAI");

        System.out.println("Simple Vehicle Factory:");
        System.out.println("Maruti Swift Mileage: " + marutiSwift.getMilage());
        System.out.println("Hyundai Santro Mileage: " + hyundaiSantro.getMilage());

        // Create a LuxuryVehicleFactory
        VehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();

        // Create vehicles using LuxuryVehicleFactory
        Vehicle nissanGTR = luxuryVehicleFactory.getVehicle("NISSAN");
        Vehicle bugattiVeyron = luxuryVehicleFactory.getVehicle("BUGATTI");

        System.out.println("\nLuxury Vehicle Factory:");
        System.out.println("Nissan GTR Mileage: " + nissanGTR.getMilage());
        System.out.println("Bugatti Veyron Mileage: " + bugattiVeyron.getMilage());
    }
}
