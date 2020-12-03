import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> greaterThan10() {
        int [] values = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 10) {
                result.add(values[i]);
            }
        }
        return result;
    }
    public ArrayList<String> names() {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Nancy");
        people.add("Jinichi");
        people.add("Fujibayashi");
        people.add("Momochi");
        people.add("Ishikawa");
        Collections.shuffle(people);
        ArrayList<String> longerThan5 = new ArrayList<String>();
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
            if(people.get(i).length() > 5) {
                longerThan5.add(people.get(i));
            }
        }
        System.out.println("Names that are longer than five characters: ");
        return longerThan5;
    }
    public void alphabet() {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> letters = new ArrayList<Character>();
        for (int i = 0; i < alpha.length; i++) {
            letters.add(alpha[i]);
        }
        Collections.shuffle(letters);
        System.out.print("Last letter of the shuffled array: ");
        System.out.println(letters.get(letters.size()-1));
        System.out.print("First letter of the shuffled array: ");
        System.out.println(letters.get(0));
        if(letters.get(0) == 'a' || letters.get(0) == 'e' || letters.get(0) == 'i'
        || letters.get(0) == 'o' || letters.get(0) == 'u' || letters.get(0) == 'y') {
            System.out.println("The first letter in the list is a vowel!");
        }
    }
    public ArrayList<Integer> tenRandom() {
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        Random r = new Random();
        int num = 0;
        for(int i = 0; i <= 10; i++) {
            num = r.nextInt(100);
            if(num < 55) {
                i-=1;
            }
            else {
                randoms.add(num);
            }
        }
        return randoms;
    }
    public ArrayList<Integer> tenSorted() {
        ArrayList<Integer> toSort = tenRandom();
        Collections.sort(toSort);
        float min = toSort.get(0);
        float max = toSort.get(0);
        for (int i = 0; i < toSort.size(); i++) {
            System.out.println(toSort.get(i));
            if (toSort.get(i) < min) {
                min = toSort.get(i);
            }
            else if (toSort.get(i) > max) {
                max = toSort.get(i);
            }
        }
        String statement1 = String.format("%s: %.2f", "Maximum", max);
        String statement2 = String.format("%s: %.2f", "Minimum", min);
        System.out.println(statement1);
        System.out.println(statement2);
        
        return toSort;
    }
    public String randString() {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String result = "";
        Random r = new Random();
        for(int num = 1; num <= 5; num++) {
            result+=alpha[r.nextInt(alpha.length)];
        }
        System.out.println(result);
        return result;
    }
    public ArrayList<String> tenStrings() {
        ArrayList<String> tenRando = new ArrayList<String>();
        String string = "";
        for (int num = 1; num <= 10; num++) {
            string = randString();
            tenRando.add(string);
        }
        System.out.println(tenRando);
        return tenRando;
    }
}