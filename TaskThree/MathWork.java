import java.util.Random;

public class MathWork {
	public static void main(String[] args) {
     MathWork m = new MathWork();
     m.divisible(10);

     int [] arr = {1,1,1,2,2,3,3,3,4,5,5,5,6,6,7,8,8,9,9,10};



	}



public void divisible(int a) {

 for (int i = 1; i < 100; i++) {
       if (i % a == 0) {
         System.out.println(i);

       }

 }


}

public int getRandom(int [] array) {
     Random rmd = new Random();

     return array[rmd.nextInt(array.length)];

  }


  public void printNumberRecursion(int b) {
      if (b > 0) {
        System.out.println(b);
        b = b - 1;
        printNumberRecursion(b);

      }
    

  }

}