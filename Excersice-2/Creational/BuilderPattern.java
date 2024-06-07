public class BuilderPattern {

    // Animal class with Builder
    static class Animal {
        private String name;
        private String species;
        private int age;

        private Animal(Builder builder) {
            this.name = builder.name;
            this.species = builder.species;
            this.age = builder.age;
        }

        public static class Builder {
            private String name;
            private String species;
            private int age;

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setSpecies(String species) {
                this.species = species;
                return this;
            }

            public Builder setAge(int age) {
                this.age = age;
                return this;
            }

            public Animal build() {
                return new Animal(this);
            }
        }

        @Override
        public String toString() {
            return "Animal [Name=" + name + ", Species=" + species + ", Age=" + age + "]";
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        Animal lion = new Animal.Builder()
                .setName("Leo")
                .setSpecies("Lion")
                .setAge(5)
                .build();

        Animal eagle = new Animal.Builder()
                .setName("EagleEye")
                .setSpecies("Eagle")
                .setAge(3)
                .build();

        System.out.println(lion);
        System.out.println(eagle);
    }
}
