public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refil = 1100;
        int bonus;
        if (refil >= 1000) {
            bonus = refil + (refil / 100);
        } else {
            bonus = refil;
        }
        System.out.println("текущий счет:" + (balance + bonus));
    }
}

