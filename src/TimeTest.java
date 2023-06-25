import uy.edu.um.prog2.adt.F1Betting;

import java.io.IOException;


public class TimeTest {
    public static void main(String[] args) throws IOException {
        // revisando memoria
        String rutaData =  "src\\uy\\edu\\um\\prog2\\adt\\f1_dataset_test.csv";
        String rutaDrivers = "src\\uy\\edu\\um\\prog2\\adt\\drivers.txt";
        F1Betting f1Betting = new F1Betting(rutaData, rutaDrivers);


        //revisando memoria de la funcion 1
        long startTime = System.nanoTime();
        f1Betting.top10DriversByMenciones(11,2021);
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecucion1: " + (endTime - startTime) + " nanosegundos");


        //revisando memoria de la funcion 2
        long startTime2 = System.nanoTime();
        f1Betting.Top15UsersConMasTweets();
        long endTime2 = System.nanoTime();
        System.out.println("Tiempo de ejecucion2: " + (endTime2 - startTime2) + " nanosegundos");


        //revisando memoria de la funcion 3
        long startTime3 = System.nanoTime();
        f1Betting.cantidadDeHashtagsDistintos(2021,10,12);
        long endTime3 = System.nanoTime();
        System.out.println("Tiempo de ejecucion3: " + (endTime3 - startTime3) + " nanosegundos");


        //revisando memoria de la funcion 4
        long startTime4 = System.nanoTime();
        f1Betting.hashTagMasUsado(2021,12,10);
        long endTime4 = System.nanoTime();
        System.out.println("Tiempo de ejecucion4: " + (endTime4 - startTime4) + " nanosegundos");


        //revisando memoria de la funcion 5
        long startTime5 = System.nanoTime();
        f1Betting.Top7UserFavourites();
        long endTime5 = System.nanoTime();
        System.out.println("Tiempo de ejecucion5: " + (endTime5 - startTime5) + " nanosegundos");


        //revisando memoria de la funcion 6
        long startTime6 = System.nanoTime();
        f1Betting.tweetConFraseOPalabra("ferrari");
        long endTime6 = System.nanoTime();
        System.out.println("Tiempo de ejecucion6: " + (endTime6 - startTime6) + " nanosegundos");

    }

}

