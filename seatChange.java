package javaFirst;

import java.util.ArrayList;
import java.util.Collections;

public class seatChange {

	public static void main(String[] args) {
		//　席替えのプログラミングを作成
		ArrayList<String> human = new ArrayList<String>();
		human.add("1");
		human.add("2");
		human.add("3");
		human.add("4");
		human.add("5");
		human.add("6");
		human.add("7");
		human.add("8");
		human.add("9");
		human.add("10");
		human.add("11");
		human.add("12");
		human.add("13");
		human.add("14");
		
		Collections.shuffle(human);
		
		System.out.println("席替え");
		System.out.println(human.get(0) + " | " + human.get(1)   + " | " + human.get(2)   + " | ");
		System.out.println(human.get(3) + " | " + human.get(4)   + " | " + human.get(5)   + " | ");
		System.out.println(human.get(6) + " | " + human.get(7)   + " | " + human.get(8)   + " | ");
		System.out.println(human.get(9) + " | " + human.get(10)   + " | " + human.get(11)   + " | ");
		System.out.println(human.get(12) + " | " + human.get(13)   + " | ");
		
	}

}
