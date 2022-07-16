public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int x = 1100;
        int p;
        if (x >= 1000) {
            p = x + (x / 100);
        } else {
            p = x;
        }
        System.out.println("текущий счет:" + (amount + p));
    }
}

