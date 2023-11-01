package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    String name;
    String address;

    String phone;

    ArrayList<Vehicle> inventory;

    public Dealership (String name,String address, String phone) {
        this.name = name ;
        this.address = address;
        this.phone = phone;

}
}
