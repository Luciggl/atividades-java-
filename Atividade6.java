import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite sua senha:");
        int senha = leitor.nextInt();
        while (senha != 2002){
            System.out.println("Senha Invalida");
            System.out.println("digite sua senha:");
            senha = leitor.nextInt();
        }
        System.out.println("Acesso permitido");
        leitor.close();
    }

}
