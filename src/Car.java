public class Car extends WheellerTransport implements diagnostable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
        for (int i = 0; i < wheelsCount; i++) {
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}
