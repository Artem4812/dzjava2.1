public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int bonus = amount / 20;
        if (amount < 20) {
            bonus = 0;
        }
        System.out.println("Бонус =" + bonus);
    }
}