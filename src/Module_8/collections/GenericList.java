package collections;

import java.util.ArrayList;

public class GenericList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("У");
		stringList.add("победы");
		stringList.add("много");
		stringList.add("отцов");
		stringList.add("только");
		stringList.add("поражение");
		stringList.add("сирота");
		System.out.println(stringList);

		String str = stringList.get(2);
		System.out.println(str);
		str = stringList.get(3);
		System.out.println(str);
		str = stringList.get(0);
		System.out.println(str);
		str = stringList.get(1);
		System.out.println(str);
	}

}
