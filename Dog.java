public class Dog {

    private String breed;
    private int age;
    private String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public void bark() {
        System.out.println("Woof Woof!");
    }

    public void sleep() {
        System.out.println("Zzzz... (Dog is sleeping)");
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    public static void main(String[] args) {
  
        Dog myDog = new Dog("Golden Retriever", 2, "Golden");

        System.out.println("Breed: " + myDog.getBreed());
        System.out.println("Age: " + myDog.getAge() + " years");
        System.out.println("Color: " + myDog.getColor());

        myDog.bark();
        myDog.sleep();
    }
}
