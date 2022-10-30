import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Main {

    private final static int MUL = 2 ;
    private static int Conf1, Conf2;

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
        System.out.println("Ahora un ejemplo, pero con un numero que puede ser: [mayor o menor que] para cumplir la condicion");
        System.out.println("Digite un numero, este sera multiplicado por dos, si es mayor que 10 cumplira la condicion, sino ira a la siguiente ");
        Conf2 = input.nextInt();

        if (Conf2 * MUL >= 10) {
            System.out.println("Su resultado es mayor que 10 con un numero: "+(Conf2 * MUL)+" Por lo tanto, si cumple la condicion");
        }else {
            System.out.println("Su resultado es menor que 10 con un numero: "+(Conf2 * MUL)+" Por lo tanto, no cumple la condicion");
        }
    }
}