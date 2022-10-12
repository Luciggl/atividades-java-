import java.util.Scanner;
public class Atividade7{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;
        System.out.println("digite um numero de 1 a 4");
        System.out.println("(1.Álcool 2.Gasolina 3.Diesel 4.Fim)");
        int numero = 0;
        while(numero != 4){
            numero = leitor.nextInt();
            if(numero == 1){
                Alcool += 1;
            }
            else if(numero == 2) {
                Gasolina += 1;
            }
            else if(numero == 3) {
                Diesel += 1;
            }
            numero = leitor.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.println("Álcool: "+ Alcool);
        System.out.println("Gasolina: "+ Gasolina);
        System.out.println("Diesel: " + Diesel);
        leitor.close();
    }
}