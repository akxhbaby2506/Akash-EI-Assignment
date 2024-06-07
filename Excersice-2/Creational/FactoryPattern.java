public class FactoryPattern {

    // Animal interface
    interface Animal {
        void speak();
    }

    // Dog class
    static class Dog implements Animal {
        @Override
        public void speak() {
            System.out.println("Woof Woof");
        }
    }

    // Cat class
    static class Cat implements Animal {
        @Override
        public void speak() {
            System.out.println("Meow Meow");
        }
    }

    // AnimalFactory class
    static class AnimalFactory {
        // Method to get an animal based on type
        public Animal getAnimal(String animalType) {
            if (animalType == null) {
                return null;
            }
            if (animalType.equalsIgnoreCase("DOG")) {
                return new Dog();
            } else if (animalType.equalsIgnoreCase("CAT")) {
                return new Cat();
            }
            return null;
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.getAnimal("DOG");
        dog.speak();

        Animal cat = animalFactory.getAnimal("CAT");
        cat.speak();
    }
}
