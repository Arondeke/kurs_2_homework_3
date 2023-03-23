public class ServiceStation {

    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);

            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }
}