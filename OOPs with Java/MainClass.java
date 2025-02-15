interface A{
    void show();
}
interface C{
    void show();
}
class B implements A,C{
    public void show (
            System.out.println("Mehod Override successfully");
        )
    }

public class MainClass{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }

}
