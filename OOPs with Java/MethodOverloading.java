public class MethodOverloading {
    public int sum(int a,int b){
        return a+b;
    }    

    public int sum(int a,int b,int c){
        return a+b+c;
    }

    public String sum(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.sum(1,2,3));
        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum("Arnav", "Biswas"));
    }
}
