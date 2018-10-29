class ReverseString {

    String reverse(String inputString) {
        char[] letters = inputString.toCharArray();
        for (int i=0; i<letters.length/2; i++) {
        	char temp = letters[i];
        	letters[i] = letters[letters.length -i -1];
        	letters[letters.length -i -1] = temp;
        }
        return new String(letters);
    }
  
}