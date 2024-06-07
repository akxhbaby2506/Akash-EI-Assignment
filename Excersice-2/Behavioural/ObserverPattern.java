import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

    // Subject interface
    interface Subject {
        void attach(Observer observer);
        void detach(Observer observer);
        void notifyObservers();
    }

    // Concrete subject
    static class AnimalSubject implements Subject {
        private final List<Observer> observers = new ArrayList<>();
        private String state;

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
            notifyObservers();
        }

        @Override
        public void attach(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }

    // Observer interface
    interface Observer {
        void update();
    }

    // Concrete observers
    static class LandAnimalObserver implements Observer {
        private final AnimalSubject subject;

        public LandAnimalObserver(AnimalSubject subject) {
            this.subject = subject;
            this.subject.attach(this);
        }

        @Override
        public void update() {
            System.out.println("Land Animal Observer: State changed to " + subject.getState());
        }
    }

    static class WaterAnimalObserver implements Observer {
        private final AnimalSubject subject;

        public WaterAnimalObserver(AnimalSubject subject) {
            this.subject = subject;
            this.subject.attach(this);
        }

        @Override
        public void update() {
            System.out.println("Water Animal Observer: State changed to " + subject.getState());
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        AnimalSubject animalSubject = new AnimalSubject();

        // Attach observers
        new LandAnimalObserver(animalSubject);
        new WaterAnimalObserver(animalSubject);

        // Change subject state and notify observers
        animalSubject.setState("Lion");
        System.out.println();

        animalSubject.setState("Shark");
    }
}
