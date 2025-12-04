package com.company.oop.dealership.models;

import static java.lang.String.format;

public abstract class AbstractVehicle {

    protected static final int MAKE_NAME_LEN_MIN = 2;
    protected static final int MAKE_NAME_LEN_MAX = 15;
    protected static final int MODEL_NAME_LEN_MIN = 1;
    protected static final int MODEL_NAME_LEN_MAX = 15;
    protected static final double PRICE_VAL_MIN = 0.0;
    protected static final double PRICE_VAL_MAX = 1000000;

    private static final String MAKE_NAME_LEN_ERR = format(
            "Make must be between %s and %s characters long!",
            MAKE_NAME_LEN_MIN,
            MAKE_NAME_LEN_MAX);

    private static final String MODEL_NAME_LEN_ERR = format(
            "Model must be between %s and %s characters long!",
            MODEL_NAME_LEN_MIN,
            MODEL_NAME_LEN_MAX);

    private static final String PRICE_VAL_ERR = format(
            "Price must be between %.1f and %.1f!",
            PRICE_VAL_MIN,
            PRICE_VAL_MAX);

    protected String make;
    protected String model;
    protected double price;

    public AbstractVehicle(String make, String model, double price) {
        validateMake(make);
        validateModel(model);
        validatePrice(price);

        this.model = model;
        this.make = make;
        this.price = price;
    }

    protected void validateMake(String make) {
        if (make.length() < MAKE_NAME_LEN_MIN || make.length() > MAKE_NAME_LEN_MAX) {
            throw new IllegalArgumentException(MAKE_NAME_LEN_ERR);
        }
    }

    protected void validateModel(String model) {
        if (model.length() < MODEL_NAME_LEN_MIN || model.length() > MODEL_NAME_LEN_MAX) {
            throw new IllegalArgumentException(MODEL_NAME_LEN_ERR);
        }
    }

    protected void validatePrice(double price) {
        if (price < PRICE_VAL_MIN || price > PRICE_VAL_MAX) {
            throw new IllegalArgumentException(PRICE_VAL_ERR);
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Price: " + price;
    }

}


