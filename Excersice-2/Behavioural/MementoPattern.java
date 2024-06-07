import java.util.ArrayList;
import java.util.List;

public class MementoPattern {

    // Memento class
    static class AnimalMemento {
        private final String state;

        public AnimalMemento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    // Originator class
    static class Animal {
        private String name;
        private String type;

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public AnimalMemento save() {
            return new AnimalMemento(type);
        }

        public void restore(AnimalMemento memento) {
            this.type = memento.getState();
        }

        @Override
        public String toString() {
            return "Animal [Name=" + name + ", Type=" + type + "]";
        }
    }

    // Caretaker class
    static class Caretaker {
        private final List<AnimalMemento> mementos = new ArrayList<>();

        public void addMemento(AnimalMemento memento) {
            mementos.add(memento);
        }

        public AnimalMemento getMemento(int index) {
            return mementos.get(index);
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        Animal animal = new Animal();
        Caretaker caretaker = new Caretaker();

        animal.setName("Simba");
        animal.setType("Lion");
        caretaker.addMemento(animal.save());

        System.out.println(animal);

        // Change the state
        animal.setType("Elephant");
        caretaker.addMemento(animal.save());

        System.out.println(animal);

        // Restore to previous state
        animal.restore(caretaker.getMemento(0));
        System.out.println(animal);
    }
}
