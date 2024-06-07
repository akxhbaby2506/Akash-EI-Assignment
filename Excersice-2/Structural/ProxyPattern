public class ProxyPattern {

    // Lion interface
    interface Lion {
        void roar();
    }

    // RealLion class
    static class RealLion implements Lion {
        @Override
        public void roar() {
            System.out.println("Real Lion roars");
        }
    }

    // ProxyLion class
    static class ProxyLion implements Lion {
        private RealLion realLion;

        @Override
        public void roar() {
            if (realLion == null) {
                realLion = new RealLion();
            }
            System.out.println("Proxy Lion controls access");
            realLion.roar();
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        Lion lion = new ProxyLion();
        lion.roar();
    }
}
