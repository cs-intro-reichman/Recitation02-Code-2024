// Question 8 
public class LoopsTest {
    public static void main(String[] args) {
        int n = 6;
        // A
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println();
        // B
        for (int i = 0; i < n; ++i) {
            System.out.println(i);
        }
        System.out.println();
        // C
        int i = 0;
        while (i < n) {
            System.out.println(i++);
        }
        System.out.println();
        // D
        int j = 0;
        while (j < n) {
            System.out.println(++j);
        }

    }
}
