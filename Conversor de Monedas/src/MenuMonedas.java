package ProyectoConversorMonedas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuMonedas {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<String> historial = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        int salir = 0;
        while (salir != 1) {
            System.out.println(
                    """
                                     Bienvenido al Menu del conversor de monedas Alura
                                     **************************************************
                                    \s
                                     Ingrese una opcion:\s
                                    \s
                                     1-Convertir moneda
                                     2-Lista de monedas mas utilizadas
                                     3-Historial de conversion
                                     4-Salir
                                   **************************************************
                            \s""");

            int opcion = teclado.nextInt();


            if (opcion == 1) {
                historial.add(operaciones.conversorMonedas());
            } else if (opcion == 2) {
                System.out.println("""
                        **************************************************
                        Le presentamos algunas de las monedas mas utilizadas:
                        \s
                        ARS -- Peso argentino,
                        USD -- Dolar estadounidense,
                        EUR -- Euro,
                        GBP -- Libra esterlina,1
                        BRL -- Real brasilero,
                        CNY -- Yuan chino,
                        JPY -- Yen japones
                        **************************************************
                       \s""");
            } else if (opcion == 3) {
                System.out.println(historial);
            } else if (opcion == 4) {
                System.out.println("Finalizo el programa.");
                salir = 1;
            }


        }



    }
}
