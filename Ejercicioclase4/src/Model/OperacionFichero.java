package Model;

import java.io.*;

public class OperacionFichero {


    public void textReader(String path){

        File file = new File(path);
        FileReader fileReader = null;
        int letras = 0;
        int oraciones = 0;

        try {
            fileReader = new FileReader(file);

            int characterCode = -1;
            while ((characterCode = fileReader.read()) != -1) {
                char reader =(char) characterCode;
                if (Character.isLetter(reader)){
                    letras++;
                }
                if (reader == '.' || reader == '!' || reader == '?') {
                    oraciones++;
                }
                System.out.printf(String.valueOf(reader));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error en entrada/salida");
        } catch (IOException e) {
            System.out.println("Error en lector");
        }
        finally {
            try {
                System.out.println();
                System.out.printf("Numero de todas las letras en texto: %d\n",letras);
                System.out.printf("Numero de todas las oraciones en texto: %d",oraciones);
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }
    }

    public void cifrador(String path,String path1){
        File file = new File(path);
        File file1 = new File(path1);
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            char characterleter;
            int characterCode = -1;
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);

            while ((characterCode = fileReader.read()) != -1) {
                System.out.print(characterCode + " ");
                fileWriter.write(characterCode + " ");
            }
        } catch (IOException e) {
            System.out.println("Error en entrada/salida");
        }finally {
            try{
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }

    }

}
