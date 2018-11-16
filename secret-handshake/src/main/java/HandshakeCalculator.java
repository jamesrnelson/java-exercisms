import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        int powerToCheck = (int) (Math.log(number)/Math.log(2)+1e-10);
        int times = powerToCheck + 1;
        String binaryString = "";
        for (int i = 0; i < times; i++) {
            if (Math.pow(2, powerToCheck) <= number) {
                number -= ((int) Math.pow(2, powerToCheck));
                binaryString += "1";
                powerToCheck--;
            } else {
                binaryString += "0";
                powerToCheck--;
            }
        }
        return parseInt(stringified);
    }

}
