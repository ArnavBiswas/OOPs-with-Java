class Calcualte{
    int length,breadth,height;
    void Volume(int length){
        double result;
        result = ((4.0/3)*(22.0/7)*(length*length*length));
        System.out.println("The volume of sphere is " +result);
    }
    void Volume(int length,int height){
        double result;
        result = ((1.0/3)*(22.0/7)*(length*length*height));
        System.out.println("The volume of cone is " +result);
    }
    void Volume(int length, int height , int breadth){
        double result;
        result= (length*breadth*height);
        System.out.println("The volume of box is " +result);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
       Calcualte o = new Calcualte();
       o.Volume(5);
        o.Volume(5, 10, 15);
       o.Volume(5, 10);
    }
}
