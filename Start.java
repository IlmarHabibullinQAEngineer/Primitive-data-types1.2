public class Start {

    public static void main(String[] args) {

        // contribute- сумма пополнения.
        // wallet- счет на данный момент.

        int wallet = 100;
        int contribute = 2000;

        // bonus- бонус от суммы пополнения.

        int bonus = contribute / 100;

        if (contribute >= 1000) {
            System.out.println("Счет: " + (wallet + contribute + bonus));
            System.out.println("Бонус: " + bonus);
        } else {
            System.out.println("Счет: " + (wallet + contribute));
        }

    }
}
