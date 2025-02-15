abstract class Car{
    abstract public void fueltype();
    public void color(){
        System.out.println("Black Color");
    }
}

class Tata extends Car{
    public void fueltype(){
        System.out.println("Diesel Car");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Tata nexon =new Tata();
        nexon.fueltype();
        nexon.color();
    }
}
