public class Main {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\ebari\\OneDrive\\Desktop\\test\\f1_dataset_test.csv";
        CVSReader cvs = new CVSReader();

        cvs.leerArchivoCSV(rutaArchivo);



    }
}