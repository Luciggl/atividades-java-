import java.util.Scanner;
public class Atividade5{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o 1ª numero:");
        int Num1 = leitor.nextInt();
        System.out.println("digite o 2ª numero:");
        int Num2 = leitor.nextInt();
        if(Num1 % Num2 ==0 || Num2 % Num1 == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Não São Multiplos");
        }
        leitor.close();
}
}
 