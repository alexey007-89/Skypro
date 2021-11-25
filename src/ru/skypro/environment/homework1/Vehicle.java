package ru.skypro.environment.homework1;

public class Vehicle {

    private String modelName;
    private int wheelsCount;

    protected Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected String getModelName() {
        return modelName;
    }

    protected void setModelName(String modelName) {
        this.modelName = modelName;
    }

    protected int getWheelsCount() {
        return wheelsCount;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
