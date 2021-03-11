package lab3;
import java.util.Scanner;
public class Exercise2 {

 
	String getImage(String s) {
	  StringBuffer sb=new StringBuffer(s);
	  sb.reverse() ;
	  String str=sb.toString();
	  
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
     Exercise2 ex2=new Exercise2();
     String str=ex2.getImage(s);
     System.out.println(s+"|"+ str);
	}
}


