class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int[] digits = createDigits(input);
        int sum = 0;
        for (int num : digits) sum += num;
        Double square = Math.pow(sum, 2);
        return square.intValue();
    }

    int computeSumOfSquaresTo(int input) {
        int[] digits = createDigits(input);
        int sum = 0;
        for (int num : digits) {
            Double square = Math.pow(num, 2);
            sum += square.intValue();
        }
        return sum;
    }


    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    int[] createDigits(int input) {
        int[] digits = new int[input];
        for (int i = 0; i < input; i++) digits[i] = i + 1;
        return digits;
    }

}
