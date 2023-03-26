public class ServiceStation {


    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            car.service();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            truck.service();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            //System.out.println("Обслуживаем " + bicycle.modelName);
            //for (int i = 0; i < bicycle.wheelsCount; i++) {
            bicycle.service();
        }
    }
}
