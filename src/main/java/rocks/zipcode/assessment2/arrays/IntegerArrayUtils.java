package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        int arrayLength = integerArray.length;
        Integer[] newArray = Arrays.copyOf(integerArray, arrayLength + 1);
        newArray[arrayLength] = valueToBeAdded;
        return newArray;
        // return null;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        int arrayLength = integerArray.length;
        Integer[] newArray = Arrays.copyOf(integerArray, arrayLength);
        newArray[indexToInsertAt] = valueToBeInserted;
        return newArray;
        //return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        int arrayLength = integerArray.length;
        Integer[] newArray = Arrays.copyOf(integerArray, arrayLength + 1);
        newArray[indexToFetch] = indexToFetch;
        return integerArray[indexToFetch];
        //return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] changedArray = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                changedArray[i] = integerArray[i] + 1;
            } else {
                changedArray[i] = integerArray[i] - 1;
            }
        }
        return changedArray;
        //return null;
    }


    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] incrementEven = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                incrementEven[i] = integerArray[i] + 1;
            } else {
                incrementEven[i] = integerArray[i];
            }
        }

        return incrementEven;
        //return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] decrementOdd = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                decrementOdd[i] = input[i] - 1;
            } else {
                decrementOdd[i] = input[i];
            }
        }

            return decrementOdd;
            //return null;

    }
}
