package com.company.oop.dealership.models;

import com.company.oop.dealership.models.contracts.Comment;
import com.company.oop.dealership.models.contracts.Truck;
import com.company.oop.dealership.models.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class TruckImpl extends AbstractVehicle implements Truck {

    public static final int WEIGHT_CAPACITY_MIN = 1;
    public static final int WEIGHT_CAPACITY_MAX = 100;
    private static final String WEIGHT_CAPACITY_ERR = format(
            "Weight capacity must be between %d and %d!",
            WEIGHT_CAPACITY_MIN,
            WEIGHT_CAPACITY_MAX);

    private final int weightCapacity;
    private final int wheels = 8;
    private final List<Comment> comments = new ArrayList<>();

    public TruckImpl(String make, String model, double price, int weightCapacity) {
        super(make, model, price);
        if (weightCapacity < WEIGHT_CAPACITY_MIN || weightCapacity > WEIGHT_CAPACITY_MAX) {
            throw new IllegalArgumentException(WEIGHT_CAPACITY_ERR);
        }
        this.weightCapacity = weightCapacity;
    }

    @Override
    public int getWeightCapacity() {
        return weightCapacity;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
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
    public String toString() {
        return String.format("#. Truck:\nMake: %s\nModel: %s\nWheels: %d\nPrice: %.2f\nWeight Capacity: %d",
                getMake(), getModel(), getWheels(), getPrice(), getWeightCapacity());
    }
}
