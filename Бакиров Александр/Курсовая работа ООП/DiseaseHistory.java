
import java.io.FileWriter;
import java.io.IOException;

public class DiseaseHistory {

    public DiseaseHistory() {
    }


    public static void newHistory(String patientName) {


        FileWriter diseaseHistory;

        try {

            diseaseHistory = new FileWriter(patientName + ".txt", true);

            /*String header = "История болезни пациента: " + patientName;

            diseaseHistory.write(header);

            diseaseHistory.append('\n');
            */

            diseaseHistory.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

