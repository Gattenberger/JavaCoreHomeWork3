package JavaCoreHome4;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {

    ArrayList<String> goroda = new ArrayList<>(Arrays.asList("Moscow", "Sarotov", "Rostov", "Moscow", "Omsk", "Kalyga",
            "Tambov", "Rostov", "Tver", "Moscow", "Yglich", "Noginsk", "Yfa", "Rzhev", "Tomsk"));
        System.out.print("Full city list:");
        System.out.print(goroda);

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : goroda) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out:println);

        System.out.println("Unique words: ");
        Set<String> unique = new HashSet<>(goroda);
        unique.forEach(System.out:println);

}
    Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", 12345);
        phonebook.add("Petrov", 25648);
        phonebook.add("Sidorov", 26589);
        phonebook.add("Smirnov", 12486);
        phonebook.add("Ivanov", 96485);
        phonebook.add("Stepanov", 45297);
        phonebook.add("Smirnov", 45236);
        phonebook.add("Yshakov", 65428);
        phonebook.add("Stepanov", 52187);

        phonebook.get("Stepanov");
        phonebook.get("Ivanov");
        phonebook.get("Smirnov");
        phonebook.get("Kyznestov");
}

}
