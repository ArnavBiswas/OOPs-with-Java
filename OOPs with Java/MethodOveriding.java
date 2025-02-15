class Bank{
    void show(){
        System.out.println("Rate Of Interest bank is 5%");
    }
}

class SBI extends Bank{
    @Override
    void show(){
        System.out.println("Rate Of Interest bank is 6.5%");
    }
}
class PNB extends Bank{
    @Override
    void show(){
        System.out.println("Rate Of Interest bank is 6%");
    }
}
public class MethodOveriding {
    public static void main(String[] args) {
        Bank obj=new Bank();
        SBI obj1=new SBI();
        PNB obj2=new PNB();
        obj.show();
        obj1.show();
        obj2.show();

    }
}
