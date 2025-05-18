package com.company.oop.dealership.models;

import com.company.oop.dealership.models.contracts.Comment;
import com.company.oop.dealership.models.contracts.Motorcycle;
import com.company.oop.dealership.models.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class MotorcycleImpl extends AbstractVehicle implements Motorcycle {

    public static final int CATEGORY_LEN_MIN = 3;
    public static final int CATEGORY_LEN_MAX = 10;
    private static final String CATEGORY_LEN_ERR = format(
            "Category must be between %d and %d characters long!",
            CATEGORY_LEN_MIN,
            CATEGORY_LEN_MAX);

    private String category;
    private final int wheels = 2;

    private final List<Comment> comments = new ArrayList<>();

    public MotorcycleImpl(String make, String model, double price, String category) {
        super(make, model, price);
        setCategory(category);
    }

    private void setCategory(String category) {
        if (category.length() < CATEGORY_LEN_MIN || category.length() > CATEGORY_LEN_MAX) {
            throw new IllegalArgumentException(CATEGORY_LEN_ERR);
        }
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.MOTORCYCLE;
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
        return String.format(
                "#. Motorcycle:\n" +
                        "Make: %s\n" +
                        "Model: %s\n" +
                        "Wheels: %d\n" +
                        "Price: %.2f\n" +
                        "Category: %s",
                getMake(), getModel(), getWheels(), getPrice(), getCategory());
    }


}
