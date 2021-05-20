import java.util.ArrayList;

public class Start {

    static ArrayList<Doctors> listOfDoctors = new ArrayList<>();

    public static void main(String[] args){


        Doctors doctor1 = new Doctors("Евгений Шнюк", "Терапевт");
        Doctors doctor2 = new Doctors("Михаил Бородин", "Кардиолог");
        Doctors doctor3 = new Doctors("Елена Исаева", "Терапевт");
        Doctors doctor4 = new Doctors("Роман Наговицын", "Дерматолог");
        Doctors doctor5 = new Doctors("Сергей Игнашевич", "Хирург");


        listOfDoctors.add(0,doctor1);
        listOfDoctors.add(0,doctor2);
        listOfDoctors.add(0,doctor3);
        listOfDoctors.add(0,doctor4);
        listOfDoctors.add(0,doctor5);


        ShowMenu menu = new ShowMenu();
        menu.printMenu();
    }


    // Вывод списка врачей

    public static void printDoctors(){
        for (int x = 0; x < listOfDoctors.size(); x++) {
            System.out.println("Имя специалиста: " + listOfDoctors.get(x).name +". Должность: " + listOfDoctors.get(x).position);
        }
    }
}
