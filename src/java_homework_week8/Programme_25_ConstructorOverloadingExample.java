package java_homework_week8;
//25. Example of Constructor Overloading
public class Programme_25_ConstructorOverloadingExample {
    //Java program to overload constructors
    int id;
    String name;
    int age;

    //Creating two argument constructor
    Programme_25_ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //creating three args constructor
    Programme_25_ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme_25_ConstructorOverloadingExample s1 = new Programme_25_ConstructorOverloadingExample(111, "Karan");
        Programme_25_ConstructorOverloadingExample s2 = new Programme_25_ConstructorOverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}



