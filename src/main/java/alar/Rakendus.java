package alar;

public class Rakendus {
    public static void main(String[] args) {
        System.getProperties().put("server.port", 4424);
        Rakendus r = new Rakendus();
    }
    public Boolean isMunchausenNumber(String number) {
        Double sum = 0.0;

        if (number.equals(null)) {
            return false;
        }

        if (number.equals("")) {
            return false;
        }
        try {
            Double total = Double.parseDouble(number);
            char numbersArr[] = number.toCharArray();
            for(char c: numbersArr) {
                Double currentNumChar = Double.valueOf(Character.getNumericValue(c));
                if(currentNumChar.equals(0.0) || currentNumChar.equals(0)){
                    sum += 0;
                } else{
                    sum += Math.pow(currentNumChar, currentNumChar);
                }
            }
            if (sum.equals(total)) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }


    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
