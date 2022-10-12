import java.util.Scanner;
public class Atividade3{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 1 numero:");
        int num = leitor.nextInt();
        if(num < 0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NÃo NEGATIVO");
        }
        leitor.close();
    }
}