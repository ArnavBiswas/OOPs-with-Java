/*4.Write a Java program which will display the following pattern.

     *
    * *
   * * *
  * * * *
 * * * * *


*/
public class Patteern2 {
        public static void main(String[] args) {
        int rows = 5 ;
        for (int i = 1; i <=rows; i++) {
            for (int s = i ; s < rows; s++){
                System.out.print(" ");
            }
            for(int j = 1 ;j<=i ;j++ ){
                System.out.print("* ");
            }
            System.err.println( );  
        }
    }
}
