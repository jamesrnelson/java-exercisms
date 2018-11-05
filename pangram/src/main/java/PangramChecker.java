import java.util.HashMap;

public class PangramChecker {
	
    public boolean isPangram(String input) {
    	String lowercased = input.toLowerCase();
    	String justLetters = lowercased.replaceAll("[^a-zA-Z]", "");
    	char[] letters = justLetters.toCharArray();
    	HashMap<Character, Integer> dictionary = new HashMap(26);
        if (input == "")
        	return false;
        else
        	for (int i = 0; i < letters.length; i++) {
        		if (dictionary.containsKey(letters[i])) {
        			int currentValue = dictionary.get(letters[i]);
        			dictionary.put(letters[i], currentValue++);
        		} else {
        			dictionary.put(letters[i], 1);
        		}
        	}
        	if (dictionary.size() == 26)
        		return true;
        	else
        		return false;
    }

}
