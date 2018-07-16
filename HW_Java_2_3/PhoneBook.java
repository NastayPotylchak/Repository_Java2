package Lesson2_2.Lesson2_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = init();

        addPhoneBook(phoneBook, "4-10-48", "Московский");

        getPhoneFromBook(phoneBook, "Московский");

    }

    static HashMap<String, String> init(){

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("4-26-48", "Московский");
        phoneBook.put("4-47-12", "Смоленский");
        phoneBook.put("4-00-15", "Минский");
        phoneBook.put("4-44-96", "Ленинградский");
        phoneBook.put("4-49-66", "Воронежский");

        return phoneBook;
    }

    public static void addPhoneBook(HashMap<String, String> phoneBook, String phone, String surname){
        phoneBook.put(phone, surname);
    }

    public static void getPhoneFromBook(HashMap<String, String> phoneBook, String surname){

        String strFind = "";
        String strResultFind;

        Set<Map.Entry<String, String>> result = phoneBook.entrySet();

        for (Map.Entry<String, String> o : result) {

            if (o.getValue() == surname ){
              strFind += o.getKey() + ",";
            }
        }

        strResultFind = strFind != "" ? "Найдены номера: " + strFind: "Номеров в справочнике не найдено.";

        System.out.println(strResultFind);

    }


}
