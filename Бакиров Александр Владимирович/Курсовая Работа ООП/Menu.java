import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

class ShowMenu {


    // Меню

    public ShowMenu() {
        printMenu();
        ContextMenu();
        ContextMenu2();
    }

    public void printMenu() {

        /***********************************************************************************************/

        System.out.println("Выберите необходимый пункт, с помощью ввода соответствующей цифры: ");

        System.out.print("1. Ведение справочников" + "\n" +
                "2. Приём пациента" + "\n" +
                "3. Ведение истории болезни пациента" + "\n");

        Scanner input = new Scanner(System.in);
        int select = input.nextInt();

        if (select == 1) ContextMenu();
        else if (select == 2) {

            Patients patient = new Patients();
            patient.PatientInfo();
            Operation.addPatient(patient);

        } else if (select == 3) {

            System.out.println("1. Просмотр истории болезни пациента" + "\n" +
                    "2. Заполнение истории болезни пациента" + "\n" +
                    "0. Назад" + "\n");
            Scanner input0 = new Scanner(System.in);
            var choice = input0.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Введите ФИО пациента, историю болезни которого нужно открыть: ");
                    Scanner name = new Scanner(System.in);
                    var name1 = name.nextLine();
                    int x = 1;
                    while (x < Operation.listOfPatients.size()) {
                        if (name1.equals(Operation.listOfPatients.get(x).name)) {
                            FileRead.Reading(Operation.listOfPatients.get(x).name);
                            break;
                        } else x += 2;
                    }

                    break;
                case 2:
                    break;
                case 0:
                    printMenu();
                    break;
            }
        }

    }

    public void ContextMenu() {
        System.out.println(
                "Ведение справочников: " + "\n" +
                        "1. Список пациентов" + "\n" +
                        "2. Болезни пациентов" + "\n" +
                        "3. Список палат" + "\n" +
                        "4. Список врачей" + "\n" +
                        "0. Назад" + "\n");

        int select;
        Scanner input = new Scanner(System.in);
        select = input.nextInt();
        switch (select) {
            case 1:
                ContextMenu2();
                break;
            case 2:
                Operation.printIllness();
                System.out.println();
                System.out.println("0. Назад");
                Scanner back0 = new Scanner(System.in);
                int select0 = back0.nextInt();
                if (select0 == 0) {
                    ContextMenu();
                }
                break;
            case 3:
                HospitalWards.PrintWards();
                System.out.println();
                System.out.println("0. Назад");
                Scanner back = new Scanner(System.in);
                int select1 = back.nextInt();
                if (select1 == 0) {
                    ContextMenu();
                }
                break;
            case 4:
                Start.printDoctors();
                System.out.println();
                System.out.println("0. Назад");
                Scanner back1 = new Scanner(System.in);
                int select2 = back1.nextInt();
                if (select2 == 0) {
                    ContextMenu();
                }
                break;
            case 0:
                printMenu();
                break;
        }

    }

    public void ContextMenu2() {

        System.out.println(
                "Список пациентов: " + "\n" +
                        "1. Показать пациентов" + "\n" +
                        "0. Назад" + "\n");

        int select;
        Scanner input = new Scanner(System.in);
        select = input.nextInt();

        switch (select) {
            case 1:
                Operation.printPatients();
                System.out.println();
                System.out.println("0. Назад");
                Scanner back = new Scanner(System.in);
                int select1 = back.nextInt();
                if (select1 == 0) {
                    ContextMenu2();
                }
                break;
            case 0:
                ContextMenu();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + select);
        }


    }


}
