package com.example.asif_44;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 class Vehicle {
    private int wheels;
    private double fuel;
    private double mileage;

    public Vehicle(int wheels) {
        this.wheels = wheels;
        this.fuel = 0.0;
        this.mileage = 0.0;
    }

    public int getWheels() {
        return wheels;
    }

    public double getFuel() {
        return fuel;
    }

    public double getMileage() {
        return mileage;
    }

    public void petrol(double liters) {
        fuel += liters;
    }

    public void drive(double distance, double fuelConsumption) {
        if (fuel >= fuelConsumption) {
            fuel -= fuelConsumption;
            mileage += distance;
        }
    }
}
 class Sedan extends Vehicle {
    public Sedan() {
        super(4);
    }


    public void drive() {
        super.drive(5.0, 2.0);
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }


    public void drive() {
        super.drive(1.5, 0.5);
    }
}
 class SUV extends Vehicle {
    public SUV() {
        super(4);
    }


    public void drive() {
        super.drive(4.0, 2.5);
    }
}
//class SUV extends Vehicle {
//    public SUV() {
//        super(4);
//    }
//
//
//    public void drive() {
//        super.drive(4.0, 2.5);
//    }
//}
 class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showColor() {
        System.out.println("Color: " + name);
    }
}
class Red extends Color {
    public Red() {
        super("Red");
    }
}
 class Blue extends Color {
    public Blue() {
        super("Blue");
    }
}
class Green extends Color {
    public Green() {
        super("Green");
    }
}

public class MainActivity extends AppCompatActivity {

    private TextView uiJudgmentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sedanButton = findViewById(R.id.sedan_button);
        Button motorcycleButton = findViewById(R.id.moto);
        Button suvButton = findViewById(R.id.suv);
        uiJudgmentText = findViewById(R.id.ui);

        sedanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sedan sedan = new Sedan();
                sedan.drive();
                updateUI("Sedan driven");
            }
        });

        motorcycleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Motorcycle motorcycle = new Motorcycle();
                motorcycle.drive();
                updateUI("Motorcycle driven");
            }
        });

        suvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SUV suv = new SUV();
                suv.drive();
                updateUI("SUV driven");
            }
        });
    }

    private void updateUI(String message) {
        uiJudgmentText.setText(message);
    }
//    private void update ui {
//
//        u
//    }
}
