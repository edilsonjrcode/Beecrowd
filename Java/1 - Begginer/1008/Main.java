import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
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

        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();

        LocalTime inicio = LocalTime.of(horaInicial, minutoInicial);
        LocalTime fim = LocalTime.of(horaFinal, minutoFinal);

        Duration tempoJogado = inicio.compareTo(fim) == -1 ? Duration.between(inicio, fim)
                : Duration.between(fim, inicio);

        int horasJogadas = horaInicial == horaFinal && minutoInicial == minutoFinal ? 24 : tempoJogado.toHoursPart();
        int minutosJogados = tempoJogado.toMinutesPart();

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasJogadas, minutosJogados);

        scan.close();

    }

}