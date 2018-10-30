class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String stringified = Integer.toString(numberToCheck);
		char[] digits = stringified.toCharArray();
		int reps = digits.length;
		double sum = 0;
		for (int i = 0; i < reps; i++) {
			int num = Character.getNumericValue(digits[i]);
			sum = sum + Math.pow(num, reps);
		}
		
		if(sum == numberToCheck)
			return true;
		else
			return false;
	}

}
