import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String rutaArchivo = "C:\\Users\\ebari\\OneDrive\\Desktop\\test\\f1_dataset_test.csv";
        CVSReader cvs = new CVSReader();

        cvs.leerArchivoCSV(rutaArchivo);

        txtReader t = new txtReader();
        System.out.println(t.txtreader());




    }
}