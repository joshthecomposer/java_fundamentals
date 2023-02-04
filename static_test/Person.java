public class Person {
    private String name;
    private int age;

    private static int numberOfPeople = 0;

    public Person(String name, int age) {
        System.out.println("Creating new person");
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void getNumberOfPeople() {
        System.out.println("The number of people is " + numberOfPeople);
    }

}