public class Car {
 
    private String model;
    private double price;
    private boolean isRunning;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
        this.isRunning = false; 
    }

    public void start() {
        if (!isRunning) {
            System.out.println("The car is starting.");
            isRunning = true;
        } else {
            System.out.println("The car is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            System.out.println("The car is stopping.");
            isRunning = false;
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    public void move() {
        if (isRunning) {
            System.out.println("The car is moving.");
        } else {
            System.out.println("Start the car before moving.");
        }
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

 class Driver {

    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drive(Car car) {
        if (car != null) {
            System.out.println(name + " is driving the " + car.getModel() + ".");
            car.move();
        } else {
            System.out.println(name + " has no car to drive.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
