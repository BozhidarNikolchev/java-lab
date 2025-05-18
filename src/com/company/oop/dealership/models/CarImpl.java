package com.company.oop.dealership.models;

import com.company.oop.dealership.models.contracts.Car;
import com.company.oop.dealership.models.contracts.Comment;
import com.company.oop.dealership.models.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class CarImpl extends AbstractVehicle implements Car {

    public static final int CAR_SEATS_MIN = 1;
    public static final int CAR_SEATS_MAX = 10;
    private static final String CAR_SEATS_ERR = format(
            "Seats must be between %d and %d!",
            CAR_SEATS_MIN,
            CAR_SEATS_MAX);

    private int seats;
    private final int wheels = 4;

    private final List<Comment> comments = new ArrayList<>();

    public CarImpl(String make, String model, double price, int seats) {
        super(make, model, price);
        setSeats(seats);
    }

    private void setSeats(int seats) {
        if (seats < CAR_SEATS_MIN || seats > CAR_SEATS_MAX) {
            throw new IllegalArgumentException(CAR_SEATS_ERR);
        }
        this.seats = seats;
    }

    @Override
    public int getSeats() {
        return seats;
    }


    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }

    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public List<Comment> getComments() {
        return new ArrayList<>(comments);
    }


    @Override
    public String toString() {
        return String.format("#. Car:\n" +
                        "Make: %s\n" +
                        "Model: %s\n" +
                        "Wheels: %d\n" +
                        "Price: %.2f\n" +
                        "Seats: %d",
                getMake(), getModel(), getWheels(), getPrice(), getSeats());
    }


}
