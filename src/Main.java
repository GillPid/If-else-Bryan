import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Main {

    private final static String Default = null ;
    private static int Conf1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Esta lloviendo?");
        System.out.println("Escriba 1 si es verdad, o escriba 0 si es mentira");
        Conf1 = input.nextInt();

        if (Conf1 == 1){
            System.out.println("Efectivamente, esta lloviendo, no salga");
        }else{
            System.out.println("Efectivamente, no esta lloviendo, salga");
        }

    }
}