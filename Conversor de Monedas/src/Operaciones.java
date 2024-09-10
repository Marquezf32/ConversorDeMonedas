package ProyectoConversorMonedas;

import java.io.IOException;
import java.util.Scanner;

public class Operaciones {

    public String conversorMonedas() throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la moneda a");
        String monedaA = teclado.nextLine();

        System.out.println("Ingrese el nombre de la moneda b");
        String monedaB = teclado.nextLine();

        System.out.println("Ingrese el monto a convertir:");
        double monto = teclado.nextDouble();

        ApiMoneda apiMoneda = new ApiMoneda();
        String url = "https://v6.exchangerate-api.com/v6/9a9033f87382a50991d67c0c/pair/"+monedaA+"/"+monedaB;
        DTOMonedas api = apiMoneda.obtenerConversion(url);

        double resultado = monto * api.conversion_rate();

        System.out.println(resultado);
        return String.valueOf(resultado);
    }
}
