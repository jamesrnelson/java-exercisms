class Acronym {
	
	private String phrase;

    Acronym(String phrase) {
		this.phrase = modifiedPhrase(phrase);
	}
    
    String modifiedPhrase(String phrase) {
    	phrase = phrase.replaceAll(" - ",  " ");
    	phrase = phrase.replaceAll("-",  " ");
    	phrase = phrase.replaceAll(",", "");
    	return phrase;
    }

    String getAcronym() {
    	String[] words = phrase.split(" ");
    	char[] letters = new char[words.length];
    	for (int i = 0; i < words.length; i++) {
    		letters[i] = words[i].charAt(0);
    	}
    	String acronym = new String(letters);
    	return acronym.toUpperCase();
    }

}
