package automation;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		String numb = sc.nextLine();
		ReverseNumber rev = new ReverseNumber();
		System.out.println(rev.reverseNumber(numb));
		sc.close();
	}
	
	public String reverseNumber(String number) {
		String tempnumber ="";
		for(int i=number.length()-1;i >=0 ;i--) {
			tempnumber+=number.charAt(i);
		}
		return "The reverse number is: " +tempnumber;
	}

}
