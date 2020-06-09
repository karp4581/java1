package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight, weightfood, FoodCoeff;
    public double getWeight() {return weight;}
    public double getFoodCoeff() {return 0.02;}
    public double calculateFoodWeight(){
       weightfood = weight * getFoodCoeff();
       return weightfood;
    }

    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK,}
    enum FoodKind {UNKNOWN, HAY, CORN}

    public Animal(double weight) {
        this.weight=weight;}

        public AnimalKind getKind () {return AnimalKind.ANIMAL;}
        public FoodKind getFoodKind() {return FoodKind.UNKNOWN;}
    public String toStringFull(){
        return "I am" + "," + " " + getKind() + " "  + "eat" + " " + getFoodKind() + " " + calculateFoodWeight();
    }

    @Override
    public String toString() {
        return "I am" + "," + " " + getKind()  + " " + "eat" + " " + getFoodKind();
    }

        public static void printInfo (Animal animal) {
        System.out.println(animal);
        System.out.println(animal.toStringFull());

    }
    public static void main(String[] args) {
        Animal animal = new Animal(50.0);
        Cow cow = new Cow(100.0);
        Hamster hamster = new Hamster(1.0);
        Duck duck = new Duck(3.1);
        printInfo(cow);
        printInfo(hamster);
        printInfo(duck);
        printInfo(animal);
    }}

