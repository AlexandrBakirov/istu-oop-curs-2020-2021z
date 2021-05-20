import java.util.ArrayList;

public class Operation {


    static ArrayList<Patients> listOfPatients = new ArrayList<>();


    public static void addPatient(Patients patients) {
        listOfPatients.add(patients);
    }

    // Вывод списка пациентов

    public static void printPatients(){
        int x = 1;
        while (x < listOfPatients.size()) {
            if (x % 2 != 0) {

                DiseaseHistory history = new DiseaseHistory();
                try {

                    // Создаем историю болезни для всех пациентов, находящихся в списке пациентов

                    history.newHistory(listOfPatients.get(x).name);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.print("Имя пациента: " + listOfPatients.get(x).name + ". Диагноз: " + listOfPatients.get(x).disease + ". Дата поступления: " + listOfPatients.get(x).dateOfReception + ". Возраст: " + listOfPatients.get(x).age);
                System.out.println();
                x += 2;
            } else
                x += 1;
        }
        System.out.println("\n" + "Всего пациентов " + x / 2);

    }


    // Вывод списка болезней

    public static void printIllness() {
        for (int x = 1; x < listOfPatients.size() ; x+=2) {
            System.out.println(" Имя пациента: " + listOfPatients.get(x).name + ". Диагноз: " + listOfPatients.get(x).disease);
        }
    }


}
