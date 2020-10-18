package Lesson5;

class employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    int age;

    employee(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void print() {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

}


