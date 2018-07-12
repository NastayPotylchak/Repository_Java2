package Lesson2_2;

import java.util.Arrays;
import java.util.Random;

class MainClass {
    public static void main(String[] args) {

        String[][] strArray = new String[4][4];

        int summElements;

        try {
              summElements = sumArrayElements(strArray);
              System.out.println(summElements);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static int sumArrayElements(String[][] strArray) throws MyArraySizeException, MyArrayDataException {
        int colRow = strArray.length;
        int colColumn = strArray[2].length;
        int summArrayElements = 0;

        if (colRow != 4 || colColumn != 4) {
            throw new MyArraySizeException("Допустимая размерность массива 4x4");
        }
        else {
            arrayIitilisation(strArray);
        }

        System.out.println(Arrays.deepToString(strArray));

        for (int i = 0; i < colRow; i++) {
            for (int j = 0; j < colColumn; j++) {
              if (isDigit(strArray[i][j])){
                summArrayElements += Integer.valueOf(strArray[i][j]);
            }
            else {
                  throw new MyArrayDataException("Недопустимое значение в ячейке [" + i + "],[" + j + "]");

              }
            }

        }

        return summArrayElements;
    }

    public static void arrayIitilisation(String[][] strArray) {
        int k = 0;

        Random index = new Random();

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (i == index.nextInt(10)) {
                    strArray[i][j] = "err";
                }
                else {
                    strArray[i][j] = String.valueOf(k);
                }
                k++;
            }

        }

    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class MyArraySizeException extends  Exception {
    public MyArraySizeException (String message) {
        super(message);

    }
}

class MyArrayDataException extends  Exception {
    public MyArrayDataException (String message) {
        super(message);

    }
}