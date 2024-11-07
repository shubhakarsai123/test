import java.util.*;
public class Example1 {
   public static void main(String[] args) {
      // creating an instance of Scanner class
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to check palindrome: ");
      // to take input from user
      int num = sc.nextInt();
      // copying the original input 
      int copy = num;
      // variable to store the result
      int revVal = 0;
      // loop to check palindrome
      while(copy != 0) {
         int rem = copy % 10; // extracting remainder
         copy /= 10; // dividing and storing the number 
         revVal = revVal * 10 + rem; // reversing 
      }
      // checking whether the reverse and original number is same or not
      if(num == revVal) {
         System.out.println(num + " is a Palindrome number");
      } else {
         System.out.println(num + " is not a Palindrome number");
      }
   }
}
