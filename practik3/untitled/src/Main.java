public class Main {
    public static void main(String[] args) {

        // 1
        int n = 60;
        if (n > 50 && n < 100) {
            System.out.println("Число " + n + " міститься в проміжку (25; 100)");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (25; 100)");
        }

        // 2
        int x = 845;
        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("найбільша цифра: " + max);

        // 3
        int p1 = 1;
        int p2 = 2;

        if (p2 == 2) {
            if (p1 < p2) p2 = 3;
            else p2 = 1;
        }

        if (p1 < p2) {
            System.out.println("Ви піднялись на " + p2 + " поверх");
        } else if (p1 > p2) {
            System.out.println("Ви спустились на " + p2 + " поверх");
        }

        // 4
        String v = "Yes";
        switch (v) {
            case "Так": case "OK": case "Yes": case "Y": case "+": case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Hi": case "NO": case "N": case "-": case "No":
                System.out.println("Я відмовляюся!");
                break;
        }
    }
}