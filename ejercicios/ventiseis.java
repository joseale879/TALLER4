package ejercicios;

public class ventiseis {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println(a);
        System.out.println(b);

        while (c < 100000) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
