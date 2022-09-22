public class Palindrome {
	
public void printIfPalindrome(String tekst) {
	String p = tekst.toLowerCase();
	String r ="";
	for (int i = tekst.length()-1; i >= 0; i--) {
         r = r + p.charAt(i);

	}
   if (r.equals(p)) {
       System.out.println(tekst);

   }

}


}

