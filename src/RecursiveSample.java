import java.util.ArrayList;
class RecursiveSample {
	public static void main(String[] args){
		ArrayList<String> words = new ArrayList<String>();
		words.add("h");
		words.add("a");	
		System.out.println(find(words, "a"));
		ArrayList<String> strings = new ArrayList<>();
		strings.add("Hello");
		strings.add("Goodbye");
		strings.add("Yes");
		strings.add("No");
		System.out.println(findMin(strings));
	}

	public static boolean find(ArrayList<String> words, String elem){
		if(words.size() == 0){
			return false;
		}else if(words.get(0).equals(elem)){
			return true;
		}	
		return find(new ArrayList<String>(words.subList(1, words.size())), elem);
	}

	public static String findMin(ArrayList<String> list) {
		return findMin(list, 0);
	}

	private static String findMin(ArrayList<String> list, int start){
		if(start == list.size()-1){
			return list.get(start);
		}
		String first = list.get(start);
		String minInRest = findMin(list, start+1);

		if(first.compareTo(minInRest) < 0){
			return first;
		}else{
			return minInRest;
		}
	}
	/**
	 * recursive sort
	 * if list is empty return
	 * move min to front then sort rest
	 */
}
