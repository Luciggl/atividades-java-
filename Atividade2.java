import java.util.Scanner;
public class Atividade2{
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("digite o 1ª numero:");
    int X = leitor.nextInt();
    System.out.println("digite o 2ª numero:");
    int Y = leitor.nextInt();
    int soma = X + Y;
    System.out.println("SOMA = "+soma);
    leitor.close();
}
}