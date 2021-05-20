import java.util.Scanner;

public class Patients {

    String name;
    String position;
    String disease;
    String dateOfReception;
    int age;


    // Конструктор для Patient

    public void PatientInfo() {

        System.out.print("Введите Имя пациента, диагноз, дату поступления (дд.мм.гггг) и возраст пациента через пробел: " + "\n");

        // Ниже вводим с клавиаутры значения параметров для объекта Patient

        Scanner patientName = new Scanner(System.in);
        this.name = patientName.nextLine();

        Scanner patientDisease = new Scanner(System.in);
        this.disease = patientDisease.nextLine();

        Scanner patientDate = new Scanner(System.in);
        this.dateOfReception = patientDate.next();

        Scanner patientAge = new Scanner(System.in);
        this.age = Integer.parseInt(patientAge.next());

        this.position = "Пациент";

        var newPatient = new Patients();

        // Добавляем созданный объект в список пациентов

        Operation.addPatient(newPatient);

    }
}
