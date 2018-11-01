class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] sequence = dnaStrand.toCharArray();
        char[] rnaSequence = new char[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
        	if (sequence[i] == 'G') 
        		rnaSequence[i] = 'C';
        	else if (sequence[i] == 'C')
        		rnaSequence[i] = 'G';
        	else if (sequence[i] == 'T')
        		rnaSequence[i] = 'A';
        	else
        		rnaSequence[i] = 'U' ;       		
        }
        return new String(rnaSequence);
        
    }

}
