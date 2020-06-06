public class usePerson {
    public static void main(String[] args) {
       Person person1 = new Person ("Vas",42);
       Person person2 = new Person ("Man",50);
        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getCountry() );
        System.out.println(person2.getName() + " " + person2.getAge() );
    }
}
