import java.lang.reflect.Array;
import java.util.ArrayList;
public class GetAllFiveCardHands {
    /**
     * with list of letters [a,b,c,d,e,f,g]
     * to get 5 card combinations
     * for any combination chosen from this list, the combination either has the first element in the list or it doesn't
     * therefore some combos include the first and others don't
     *
     * def combos(list, targetLength):
     *      if targetLength == 1: return createListsFromElements(list)
     *      if list.size() == targetLength: return list wrapped in a list
     *      first = list[0]
     *      rest = list[1:]
     *      combosWithoutFirst = combos(rest, targetLength)
     *      shortCombos = combos(rest, targetLength-1)
     *      combosWithFirst = list[0] + shortCombos for all in shortCombos
     *      return combosWithoutFirst and combosWithFirst
      */
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        System.out.println(getCombos(letters, 2));
    }

    public static ArrayList<ArrayList<Character>> getCombos(ArrayList<Character> letters, int length){
        if(letters.size() == length){
            ArrayList<ArrayList<Character>> toReturn =  new ArrayList<ArrayList<Character>>();
            toReturn.add(letters);
            return toReturn;
        }
        if(length == 1){
            return createListsFromElements(letters);
        }
        char first = letters.get(0);
        ArrayList<Character> others = new ArrayList<Character>(letters.subList(1, letters.size()));
        ArrayList<ArrayList<Character>> combosWithoutFirst = getCombos(others, length);
        ArrayList<ArrayList<Character>> shortCombos = getCombos(others, length-1);
        ArrayList<ArrayList<Character>> combosWithFirst = addFirst(first, shortCombos);

        ArrayList<ArrayList<Character>> allCombos = new ArrayList<ArrayList<Character>>();
        allCombos.addAll(combosWithFirst);
        allCombos.addAll(combosWithoutFirst);
        return allCombos;
    }

    public static ArrayList<ArrayList<Character>> createListsFromElements(ArrayList<Character> list){
        ArrayList<ArrayList<Character>> listedElems = new ArrayList<ArrayList<Character>>();
        for(char c : list){
            ArrayList<Character> toAdd = new ArrayList<Character>();
            toAdd.add(c);
            listedElems.add(toAdd);
        }
        return listedElems;
    }

    public static ArrayList<ArrayList<Character>> addFirst(char toAdd, ArrayList<ArrayList<Character>> list){
        ArrayList<ArrayList<Character>> toReturn = new ArrayList<ArrayList<Character>>();
        for(ArrayList<Character> a : list){
            a.add(0, toAdd);
            toReturn.add(a);
        }
        return toReturn;
    }
}