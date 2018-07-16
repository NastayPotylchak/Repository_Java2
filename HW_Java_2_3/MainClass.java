package Lesson2_2.Lesson2_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        String arrWords[] = {"one", "two", "two", "two", "three", "four", "four", "five", "six", "six"}; // исходный массив

        ///Список уникальных слов в массиве
        printListUniqueWords(arrWords);

        System.out.println("");

        /// Кол-во вхождений каждого слова
        countWords(arrWords);

    }

    public static void printListUniqueWords (String arrWords[]){
        ArrayList<String> duplicateWords = new ArrayList<String>(); /// массив-дубликатов
        ArrayList<String> listWords = new ArrayList<String>(); /// результирующий набор

        for (int i = 0; i < arrWords.length; i++) {

            for (int j = i + 1; j < arrWords.length; j++) {
                if (arrWords[j].equals(arrWords[i])) {
                    duplicateWords.add(arrWords[j]);
                }

            }
        }


        for (int k = 0; k < arrWords.length; k++) {
            if (!duplicateWords.contains(arrWords[k])) {
                listWords.add(arrWords[k]);
            }
        }

        System.out.println(listWords);
    }

    public static void countWords (String arrWords[]) {

        String strTemp;
        ArrayList<String> listWords = new ArrayList<String>();
        HashMap<String, Integer> listHash = new HashMap<String, Integer>();

        for (int i = 0; i < arrWords.length; i++) {
          listWords.add(arrWords[i]);

        }

        for (int j = 0; j < listWords.size(); j++) {
           strTemp = listWords.get(j);

           if (!listHash.containsKey(strTemp)){
               listHash.put(strTemp, 1);
           }
           else {
               listHash.put(strTemp, listHash.get(strTemp) + 1);
           }

        }

        for (Map.Entry<String, Integer> resultListWords : listHash.entrySet()){
            String once = resultListWords.getValue().equals(2) || resultListWords.getValue().equals(3) || resultListWords.getValue().equals(4) ? " раза" : " раз";

            System.out.println("Слово ''" + resultListWords.getKey() + "'' встречается " + resultListWords.getValue() + once);
        }

    }

}
