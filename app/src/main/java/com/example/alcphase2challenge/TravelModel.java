package com.example.alcphase2challenge;

public class TravelModel {

    private String country;
    private String holidayLocation;
    private String amount;

    public TravelModel(String country, String holidayLocation, String amount) {
        this.country = country;
        this.holidayLocation = holidayLocation;
        this.amount = amount;
    }

    public TravelModel() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHolidayLocation() {
        return holidayLocation;
    }

    public void setHolidayLocation(String holidayLocation) {
        this.holidayLocation = holidayLocation;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
