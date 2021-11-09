import java.util.Scanner;

public class RectanguloDibujado {
    public static void main(String[] args) {
        int i, j, base, altura;
        Scanner sc=new Scanner(System.in);

        System.out.println("introduce la base");
        base=sc.nextInt();
        System.out.println("introduce la altura");
        altura= sc.nextInt();

        while (base>0 && altura>0) {
            while (base>0 ) {
                base--;
                while (altura>0) {
                    altura--;
                    System.out.println("*");
                }

            }

        }  System.out.println("error");

    }
}
