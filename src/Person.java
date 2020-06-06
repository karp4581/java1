public class Person {
    private String name;
    private int age;
    private String country;

    public Person() {
        this.country = "RU";
    }

    public Person(String name1, int age1) {
        this();
        name = name1;
        age = age1;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}

