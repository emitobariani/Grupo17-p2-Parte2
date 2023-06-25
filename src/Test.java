import uy.edu.um.prog2.adt.F1Betting;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Cargando datos de tweets...");
            F1Betting f1Betting = new F1Betting();
            System.out.println("Datos cargados con éxito.");
            System.out.println("Ingrese 1 para el Top 10 drivers");
            option = sc.nextInt();

            switch (option){

                case 1:
                    int year = 0;
                    int month = 0;
                    System.out.println("Ingrese el año");
                    year = sc.nextInt();
                    System.out.println("Ingrese el mes");
                    month = sc.nextInt();
                    System.out.println("Top 10 drivers");
                    f1Betting.top10DriversByMenciones(month, year);
                    break;
                    case 2:
                        System.out.println("imprimir contenido de la lista de tweets");
                        f1Betting.impimirContent();
            }

        } while (option != 0);
        System.out.println("Saliendo...");

    }
}
