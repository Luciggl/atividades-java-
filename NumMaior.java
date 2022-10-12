import java.util.Scanner;
public class NumMaior {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Deseja armazenar quantos Numeros?");
        int Numeros = Integer.parseInt(leitor.nextLine());
        double Maior = 0;
        double[] ListaNum = new double[Numeros];
        for (int k=0; k<Numeros; k++){
            System.out.println("Digite o "+ (k+1) + "ª numero:");
            ListaNum[k]=Double.parseDouble(leitor.nextLine());
        }
        for (int i=0; i<Numeros; i++){
            if(ListaNum[i] > Maior){
                Maior = ListaNum[i];
            }
        System.out.println("o maior numero foi "+ Maior);
        System.out.println("Fim do programa!");
        }
        leitor.close();
    }
    
}
