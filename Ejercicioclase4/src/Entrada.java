import Model.OperacionFichero;

public class Entrada {

    public static void main(String[] args) {
        OperacionFichero operacionFichero = new OperacionFichero();

//        operacionFichero.textReader("/Users/vanyagrin/Documents/GitHub/IvanGrin_PRO/Ejercicioclase4/src/textp/text.txt");
        operacionFichero.cifrador("/Users/vanyagrin/Documents/GitHub/IvanGrin_PRO/Ejercicioclase4/src/textp/text.txt","/Users/vanyagrin/Documents/GitHub/IvanGrin_PRO/Ejercicioclase4/src/textp/textWriter.txt");
    }
}