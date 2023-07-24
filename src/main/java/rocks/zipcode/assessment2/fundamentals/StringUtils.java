package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        if(amountOfPadding <= 0){
            return stringToBePadded;
        }
        int paddingLength = Math.max(0, amountOfPadding - stringToBePadded.length());
        StringBuilder paddedString = new StringBuilder();

        for(int i = 0; i < paddingLength; i++){
            paddedString.append(' ');
        }
        paddedString.append(stringToBePadded);
        return paddedString.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        if(amountOfPadding <= 0){
            return stringToBePadded;
        }
        int paddingLength = Math.max(0, amountOfPadding - stringToBePadded.length());
        StringBuilder paddedString = new StringBuilder();

        for(int i = 0; i < paddingLength; i++){
            paddedString.append(' ');
        }
        paddedString.append(stringToBePadded);
        return paddedString.toString();
    }


    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        if (numberOfTimeToRepeat <= 0) {
            return "";
        }
        StringBuilder repeatedString = new StringBuilder();
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            repeatedString.append(stringToBeRepeated);
        }
        return repeatedString.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        for(char ch : string.toCharArray()){
            if (!Character.isLetter(ch)){
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for(char ch : string.toCharArray()){
            if (!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        for(char ch : string.toCharArray()){
            if (!Character.isLetterOrDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
