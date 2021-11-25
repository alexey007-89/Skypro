package ru.skypro.environment.homework1;

public class ServiceStation {
    public void check(Car car) {
        if (car != null) {
            checkTyre(car);
            car.checkEngine();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            checkTyre(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            checkTyre(bicycle);
        }
    }

    private void checkTyre(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}
