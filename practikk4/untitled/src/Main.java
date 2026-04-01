public class Main {
    public static void main(String[] args) {

        // 1
        System.out.println("--- 1 ---");
        System.out.print("for: ");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }

        System.out.print("\nwhile: ");
        int j = 500;
        while (j <= 650) {
            System.out.print(j + " ");
            j += 10;
        }

        System.out.print("\ndo-while: ");
        int k = 500;
        do {
            System.out.print(k + " ");
            k += 10;
        } while (k <= 650);
        System.out.println("\n");

        // 2
        System.out.println("--- 2 ---");
        int a = 2;
        while (a < 5000) {
            System.out.print(a + " ");
            a = 2 * a - 1;
        }
        System.out.println("\n");

        // 3
        System.out.println("--- 3 ---");
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 4
        System.out.println("--- 4 ---");
        int factFor = 1;
        for (int i = 1; i <= 10; i++) {
            factFor *= i;
        }
        System.out.println("Факторіал for: " + factFor);

        int factWhile = 1;
        int c = 1;
        while (c <= 10) {
            factWhile *= c;
            c++;
        }
        System.out.println("Факторіал while: " + factWhile);
        System.out.println();

        // 5
        System.out.println("--- 5 ---");
        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                if (h / 10 == m % 10 && h % 10 == m / 10) {
                    count++;
                }
            }
        }
        System.out.println("Кількість співпадінь: " + count);
    }
}