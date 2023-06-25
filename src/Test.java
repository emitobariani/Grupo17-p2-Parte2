import uy.edu.um.prog2.adt.F1Betting;

import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String option = "0";
        System.out.println("Cargando datos de tweets...");
        F1Betting f1Betting = new F1Betting();
        System.out.println("Datos cargados correctamente");


        do {

            System.out.println("Ingrese 1 para ver el Listar los 10 pilotos activos en la temporada 2023 más mencionados en los tweets en un mes");
            System.out.println("Ingrese 2 para ver Top 15 usuarios con más tweets");
            System.out.println("Ingrese 3 para ver Cantidad de hashtags distintos para un día dado. El día será ingresado en el formato YYYY-MM-DD.");
            System.out.println("Ingrese 4 para ver Hashtag más usado para un día dado en el formato YYYY-MM-DD.");
            System.out.println("Ingrese 5 para ver Top 7 cuentas con más favoritos");
            System.out.println("Ingrese 6 para ver Cantidad de tweets con una palabra o frase específicos");
            System.out.println("Ingrese 0 para salir");
            option = sc.next();


            switch (option){

                case "1":
                    int year = 0;
                    int month = 0;
                    System.out.println("Ingrese el año: ");
                    year = sc.nextInt();
                    System.out.println("Ingrese el mes: ");
                    month = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Top 10 drivers");
                    f1Betting.top10DriversByMenciones(month, year);
                    break;

                case "2":
                    System.out.println("-----------------------------------");
                    System.out.println("Usuarios con mas cantidad de tweets");
                    System.out.println("-----------------------------------");
                    f1Betting.Top15UsersConMasTweets();
                    break;

                case "3":

                    System.out.println("Ingrese el año: ");
                    year = sc.nextInt();
                    System.out.println("Ingrese el mes: ");
                    month = sc.nextInt();
                    System.out.println("Ingrese el dia: ");
                    int day = sc.nextInt();
                    sc.nextLine();
                    if(year > 2022 || year < 2021){
                        System.out.println("El año ingresado no es valido");
                        break;
                    }
                    if(month > 12 || month < 1){
                        System.out.println("El mes ingresado no es valido");
                        break;
                    }
                    if(day > 31 || day < 1){
                        System.out.println("El dia ingresado no es valido");
                        break;
                    }
                    f1Betting.cantidadDeHashtagsDistintos(year, month, day);
                    break;


                case "4":
                    break;


                case "5":
                    System.out.println("-----------------------------------");
                    System.out.println("Usuarios con mas cantidad de favoritos");
                    System.out.println("-----------------------------------");
                    f1Betting.Top7UserFavourites();
                    break;

                case "6":
                    System.out.println("Ingrese frase o pasabra: ");
                    sc.nextLine();
                    String texto = sc.nextLine();
                    f1Betting.tweetConFraseOPalabra(texto);
                    break;

            }

        } while (!option.equals("0"));
        System.out.println("Saliendo...");

    }
}