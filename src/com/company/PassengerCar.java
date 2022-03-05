package com.company;

import com.company.Car;

import java.util.Random;

public class PassengerCar extends Car {
    private String autoPilot = generateAutoPilot();
    private int capacity;

    public PassengerCar(String model, Rudder rudder, double volume, int capacity) {
        super(model, rudder, volume);
        this.capacity = capacity;
    }

    public String getAutoPilot() {
        return autoPilot;
    }

    public int getCapacity() {
        return capacity;
    }

    final String generateAutoPilot (){
        Random random = new Random();
        boolean autopilots = random.nextBoolean();
        if (autopilots == true){
            return "у вашей машины есть функция автопилот!";
        } else {
            return "ваша машина не имеет функцию автопилот!";
        }
    }

    @Override
    public String getInfoCar() {
        return super.getInfoCar() + ", " + autoPilot + " Capacity: " + capacity;
    }
}
