import java.util.Arrays;

public class HospitalWards {

    static  int[] surgery = new int[]{100,101,102,103,104,105,106,107,108,109,110};
    static int[] therapy = new int[]{200,201,202,203,204,205,206,207,208,209,210};
    static int[] cardiology = new int[]{300,301,302,303,304,305,306,307,308,309,310};
    static int[] infectious = new int[]{400,401,402,403,404,405,406,407,408,409,410};


    protected static void PrintWards(){

        System.out.println("Палаты хирургического отделения: " + Arrays.toString(surgery));
        System.out.println("Палаты терапевтического отделения: " + Arrays.toString(therapy));
        System.out.println("Палаты кардиологического отделения: " + Arrays.toString(cardiology));
        System.out.println("Палаты инфекционного отделения: " + Arrays.toString(infectious));

    }

}
