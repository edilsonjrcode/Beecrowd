import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();

        Double pesoA = 2d;
        Double pesoB = 3d;
        Double pesoC = 5d;

        Double media = ((a * pesoA) + (b * pesoB) + (c * pesoC)) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f\n", media);

        scan.close();

    }

}