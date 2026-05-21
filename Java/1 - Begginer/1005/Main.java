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

        Double pesoA = 3.5;
        Double pesoB = 7.5;

        Double media = ((a * pesoA) + (b * pesoB)) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f\n", media);

        scan.close();

    }

}