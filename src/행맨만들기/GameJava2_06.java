package ��Ǹ����;

import java.io.IOException;

public class GameJava2_06 {
	public static void main(String[] args) throws IOException{
		Hangman hangman = new Hangman();
		
		int result = hangman.playGame();
		
		System.out.println();
		if(result<=2) {
			System.out.println("�� ���߾��!");
		}else if(result<=3) {
			System.out.println("���߾��!");
		}else if(result<=4) {
			System.out.println("�����̳׿�!");
		}else {
			System.out.println("�й��ϼ���!");
		}
	}
}