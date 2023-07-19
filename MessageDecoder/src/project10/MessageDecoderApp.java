package project10;

import java.util.Scanner;

public class MessageDecoderApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char s=scan.next().charAt(0);
		scan.close();

		System.out.println(MessageDecoder.decodeCharacter(s));
	}

}
