public class FacadePattern {

    // Lion class
    static class Lion {
        public void roar() {
            System.out.println("Lion roars");
        }
    }

    // Elephant class
    static class Elephant {
        public void trumpet() {
            System.out.println("Elephant trumpets");
        }
    }

    // Monkey class
    static class Monkey {
        public void screech() {
            System.out.println("Monkey screeches");
        }
    }

    // ZooFacade class
    static class ZooFacade {
        private final Lion lion;
        private final Elephant elephant;
        private final Monkey monkey;

        public ZooFacade() {
            this.lion = new Lion();
            this.elephant = new Elephant();
            this.monkey = new Monkey();
        }

        public void lionRoar() {
            lion.roar();
        }

        public void elephantTrumpet() {
            elephant.trumpet();
        }

        public void monkeyScreech() {
            monkey.screech();
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        ZooFacade zoo = new ZooFacade();

        zoo.lionRoar();
        zoo.elephantTrumpet();
        zoo.monkeyScreech();
    }
}
