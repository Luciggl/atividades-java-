import java.util.Scanner;
public class programa{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quer armazenar a temperatura de quantos dias?");
        int Dias = Integer.parseInt(leitor.nextLine());
        double[] temp = new double[Dias];
        for (int k=0; k<Dias; k++){
            System.out.println("Qual a temperatura do "+ (k+1) +"º dia?");
            temp[k] = Double.parseDouble(leitor.nextLine());
        }
        for (int k=0; k<Dias; k++){
        System.out.println("A temperatura do "+ (k+1) +"ª dia foi de "+temp[(k)]+"°C");
        System.out.println(" ");
    }
        System.out.println("Fim do programa!");
        leitor.close();
    }
}