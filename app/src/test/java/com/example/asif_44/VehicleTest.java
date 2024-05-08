package com.example.asif_44;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {
    @Test
    public void sedanDriveTest() {
        Sedan sedan = new Sedan();
        sedan.petrol(5.0);
        sedan.drive();
        assertEquals(5.0, sedan.getMileage(), 0.0);
    }

    @Test
    public void motorcycleDriveTest() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.petrol(3.0);
        motorcycle.drive();
        assertEquals(1.5, motorcycle.getMileage(), 0.0);
    }

    @Test
    public void suvDriveTest() {
        SUV suv = new SUV();
        suv.petrol(10.0);
        suv.drive();
        assertEquals(4.0, suv.getMileage(), 0.0);
    }

}