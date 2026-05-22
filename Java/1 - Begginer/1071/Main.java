import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        int numeroFinal = scan.nextInt();
        int numeroInicial = scan.nextInt();
        int acumulador = 0;
        
        for(int x = (numeroInicial + 1); x < numeroFinal; x++){
            if(x % 2 != 0){
                acumulador += x;
            }
        }

        System.out.println(acumulador);

        scan.close();
 
    }
 
}