package day_21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
	Set<String> vowels = new HashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
	List<String> vowelsList = new ArrayList<>(vowels);
		System.out.println("vowels set = "+vowels);
		System.out.println("vowelsList = "+vowelsList);
	vowels.add("o");
	vowelsList.add("a");
	vowelsList.add("u");
		System.out.println("vowels set = "+vowels);
		System.out.println("vowelsList = "+vowelsList);
	vowels = new HashSet<>(vowelsList);
		System.out.println("vowels set = "+vowels);
	}

}
