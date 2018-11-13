import java.util.HashMap;

class Scrabble {
	private String word;

    Scrabble(String word) {
    	this.word = word.toLowerCase();
    }

    int getScore() {
    	HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>() {{
    		put('a', 1);
    		put('b', 3);
    		put('c', 3);
    		put('d', 2);
    		put('e', 1);
    		put('f', 4);
    		put('g', 2);
    		put('h', 4);
    		put('i', 1);
    		put('j', 8);
    		put('k', 5);
    		put('l', 1);
    		put('m', 3);
    		put('n', 1);
    		put('o', 1);
    		put('p', 3);
    		put('q', 10);
    		put('r', 1);
    		put('s', 1);
    		put('t', 1);
    		put('u', 1);
    		put('v', 4);
    		put('w', 4);
    		put('x', 8);
    		put('y', 4);
    		put('z', 10);
    	}};
    	int sum = 0;
    	char[] letters = word.toCharArray();
    	for (int i = 0; i < letters.length; i++) {
    		int val = dictionary.get(letters[i]);
    		sum = sum + val;
    	}
    	return sum;
    }

}
