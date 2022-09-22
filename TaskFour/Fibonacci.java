public class Fibonacci {
	
public static void main(String[] args) {
 
  Fibonacci f = new Fibonacci();
 f.fibonacci(1,1);


  }

public void fibonacci(int a, int b) {
    
     if (a < 1000) {
    System.out.println(a + " \t");
      int sum = a + b; 
      a = b;
      b = sum;
      fibonacci(a,b);
    

     }

    }

  }



