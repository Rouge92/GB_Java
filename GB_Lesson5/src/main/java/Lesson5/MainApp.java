package Lesson5;

public class MainApp {
    public static void main(String[] args) {
        employee[] persArray = new employee[5];
        persArray[0] = new employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30.000, 41);
        persArray[1] = new employee("Fedor Kiselev", "QA", "fedor@mailbox.com", "897675843", 35.000, 43);
        persArray[2] = new employee("Vasiliy Sidorov", "Designer", "vasya@mailbox.com", "892567862", 40.000, 30);
        persArray[3] = new employee("Pavel Suchoy", "Manager", "pavel@mailbox.com", "845672312", 25.000, 24);
        persArray[4] = new employee("Petr Perviy", "3D Artist", "petr@mailbox.com", "892312009", 50.000, 32);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].print();
        }
    }
}
