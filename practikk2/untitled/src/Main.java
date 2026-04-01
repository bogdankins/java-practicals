public class Main {
    public static void main(String[] args) {

        // 1
        int a = 16;
        int b = 3;
        System.out.println("Результат ділення: " + (a / b));
        System.out.println("Залишок від ділення: " + (a % b));

        // 2
        int num = 45;
        System.out.println("Сума цифр: " + ((num / 10) + (num % 10)));

        // 3
        double d = 7.6;
        System.out.println("Округлене число: " + Math.round(d));

    }
}