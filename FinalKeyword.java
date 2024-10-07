public class FinalKeyword {

    class Bike {
        final void even() {
            System.out.println("Reading");
        }
    }

    class Honda extends Bike {
        void run() {
            System.out.println("Running safely with the speed of 40kmph");
        }
    }

    public static void main(String[] args) {
        // implement program of final keyword with different uses
        // final double pi = 3.14159;
        // pi = 6.256;
        // System.out.println("Value of pi is: " + pi);

        Honda hondaObj = new Honda();
        hondaObj.even();
        hondaObj.run();

    }
}
