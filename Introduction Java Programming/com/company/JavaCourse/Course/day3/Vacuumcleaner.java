package com.company.JavaCourse.Course.day3;

import com.company.JavaCourse.Course.day3.Address;

public class Vacuumcleaner {
    public void vacuum(Address address){
        System.out.println("vacuum noise, to clean the house at " + address.getCity() + " " + address.getStreetName() + " " + address.getNr());
    }
}
