import java.util.Random;

public class ChainOfResponsibilityPattern {

    // Handler interface
    interface AnimalHandler {
        void handleRequest(Animal animal);
        void setNext(AnimalHandler handler);
    }

    // Concrete handlers
    static class LandAnimalHandler implements AnimalHandler {
        private AnimalHandler next;

        @Override
        public void setNext(AnimalHandler handler) {
            this.next = handler;
        }

        @Override
        public void handleRequest(Animal animal) {
            if (animal instanceof Lion || animal instanceof Elephant) {
                System.out.println("Handled by LandAnimalHandler: " + animal.getClass().getSimpleName());
            } else {
                if (next != null) {
                    next.handleRequest(animal);
                } else {
                    System.out.println("Cannot handle: " + animal.getClass().getSimpleName());
                }
            }
        }
    }

    static class WaterAnimalHandler implements AnimalHandler {
        private AnimalHandler next;

        @Override
        public void setNext(AnimalHandler handler) {
            this.next = handler;
        }

        @Override
        public void handleRequest(Animal animal) {
            if (animal instanceof Dolphin || animal instanceof Shark) {
                System.out.println("Handled by WaterAnimalHandler: " + animal.getClass().getSimpleName());
            } else {
                if (next != null) {
                    next.handleRequest(animal);
                } else {
                    System.out.println("Cannot handle: " + animal.getClass().getSimpleName());
                }
            }
        }
    }

    // Animal interface
    interface Animal {
        String getType();
    }

    // Concrete animals
    static class Lion implements Animal {
        @Override
        public String getType() {
            return "Land Animal";
        }
    }

    static class Elephant implements Animal {
        @Override
        public String getType() {
            return "Land Animal";
        }
    }

    static class Dolphin implements Animal {
        @Override
        public String getType() {
            return "Water Animal";
        }
    }

    static class Shark implements Animal {
        @Override
        public String getType() {
            return "Water Animal";
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        // Create the chain of responsibility
        AnimalHandler landAnimalHandler = new LandAnimalHandler();
        AnimalHandler waterAnimalHandler = new WaterAnimalHandler();

        landAnimalHandler.setNext(waterAnimalHandler);

        // Generate random animals
        Random random = new Random();
        Animal[] animals = { new Lion(), new Elephant(), new Dolphin(), new Shark() };

        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.getType());
            landAnimalHandler.handleRequest(animal);
            System.out.println();
        }
    }
}
