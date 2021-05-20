import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileRead {


    public static void Reading(String name1) {


        String fileName = name1;
        String line;
        BufferedReader bufferedReader = null;

        try {

            FileReader fileReader = new FileReader(fileName + ".txt");

            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Невозможно открыть файл '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла '" + fileName + "'");
        } finally {

            // Закрываем файл

            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ignored) {
            }
        }
    }
}


