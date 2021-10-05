package JavaCoreHome4;

public class PhoneBook {

    private Map<String, Integer> phonebook;
    Phonebook() {
        phonebook = new TreeMap<>();
    }
    public void add(String surname, int number) {
        phonebook.put(surname, number);
    }
    public void get(String surname){
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<String, Integer>> set = phonebook.entrySet();
            for (Map.Entry<String, Integer> temp : set) {
                if(temp.getValue().equals(number)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Phone number is not found");
        }
    }
}
