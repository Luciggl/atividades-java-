import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 1 numero:");
        int num = leitor.nextInt();
        if(num %2==0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        leitor.close();
    }
}
