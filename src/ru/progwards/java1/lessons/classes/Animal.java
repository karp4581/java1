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
    AnimalKind animal1 = AnimalKind.ANIMAL;
    FoodKind food1 = FoodKind.UNKNOWN;
    AnimalKind animal2 = AnimalKind.COW;
    FoodKind food2 = FoodKind.HAY;
    AnimalKind animal3 = AnimalKind.HAMSTER;
    FoodKind food3 = FoodKind.CORN;
    AnimalKind animal4 = AnimalKind.DUCK;
    FoodKind food4 = FoodKind.CORN;

    public Animal(double weight) {
        this.weight=weight;}

        public AnimalKind getKind () {return animal1;}
        public FoodKind getFoodKind() {return food1;}
    public String toStringFull(){
        return "I am" + "," + getKind() + " "  + "eat" + " " + getFoodKind() + " " + calculateFoodWeight();
    }

    @Override
    public String toString() {
        return "I am" + "," + getKind()   + "eat" + getFoodKind();
    }

   public static class Cow extends Animal {
       public Cow(double weight) {
           super(weight);}

       @Override
       public AnimalKind getKind () {return animal2;}
       @Override
       public FoodKind getFoodKind() {return food2;}
       @Override
       public double getFoodCoeff() {return 0.05;}

   }

    public static class Hamster extends Animal {
        public Hamster(double weight) {
            super(weight);
        }
        @Override
        public AnimalKind getKind () {return animal3;}
        @Override
        public FoodKind getFoodKind() {return food3;}
        @Override
        public double getFoodCoeff() {return 0.03;}
          }
    public static class Duck extends Animal {
        public Duck(double weight) {
            super(weight);
        }
        @Override
        public AnimalKind getKind () {return animal4;}
        @Override
        public FoodKind getFoodKind() {return food4;}
        @Override
        public double getFoodCoeff() {return 0.04;}
    }
    public static void printInfo (Animal animal) {
        System.out.println(animal);
        System.out.println(animal.toStringFull());

    }
    public static void main(String[] args) {
Cow cow = new Cow(100.0);
Hamster hamster = new Hamster(5.0);
Duck duck = new Duck(3.1);
       printInfo(cow);
        printInfo(hamster);
        printInfo(duck);

    }}
