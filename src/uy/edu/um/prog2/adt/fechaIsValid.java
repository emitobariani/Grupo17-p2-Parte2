package uy.edu.um.prog2.adt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class fechaIsValid {
    public static boolean verificarFormatoFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            LocalDateTime.parse(fecha, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
