class Hamming {
	private String leftStrand;
	private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
    	if (leftStrand.length() != rightStrand.length()) {
    		throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    	} else {
	    	this.leftStrand = leftStrand;
	    	this.rightStrand = rightStrand;
    	}
    }

    int getHammingDistance() {
    	int counter = 0;
		char[] leftChars = leftStrand.toCharArray();
		char[] rightChars = rightStrand.toCharArray();
		for (int i = 0; i < leftChars.length; i++) {
			if (leftChars[i] != rightChars[i])
				counter++;
			else
				counter = counter + 0;
		}
		return counter;
    }

}
