public class SingletonPattern {

    // AnimalKingdom singleton class
    static class AnimalKingdom {
        private static AnimalKingdom instance;

        private AnimalKingdom() {
            // Private constructor to prevent instantiation
        }

        public static AnimalKingdom getInstance() {
            if (instance == null) {
                instance = new AnimalKingdom();
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Welcome to the Animal Kingdom!");
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        AnimalKingdom kingdom1 = AnimalKingdom.getInstance();
        AnimalKingdom kingdom2 = AnimalKingdom.getInstance();

        kingdom1.showMessage();

        // Verify that kingdom1 and kingdom2 are the same instance
        System.out.println("Are both instances the same? " + (kingdom1 == kingdom2));
    }
}
