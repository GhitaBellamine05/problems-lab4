package problem07;

public class Carpenter implements  Person{
   private String name;
   // Constructor
    Carpenter(){}
    Carpenter(String name){this.name = name;}
    // Getter
    String getName(){return this.name;}
    // Setter
    void setName(String name){this.name = name;}
    @Override
    public void display() {
        System.out.println("I am "+ name + " the Carpenter.");
    }
}
