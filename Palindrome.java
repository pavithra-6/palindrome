package guvi;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
		// TODO Auto-generated method stub
String a;
Scanner s=new Scanner(System.in);
a=s.next();
StringBuffer s1=new StringBuffer(a).reverse();
if(a.equals(s1.toString())){
	System.out.println("this is palindrome");
}
	else{
	System.out.println("this is not palindrome");
	}

	}

}
