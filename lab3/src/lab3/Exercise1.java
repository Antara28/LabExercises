package lab3;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		int n,sum=0;
		while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
	}

}
