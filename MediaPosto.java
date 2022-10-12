import java.util.Scanner;
public class MediaPosto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double somaValor = 0;
        double menorValor = 0;
        for(int k=0; k<5; k++){
            double[] ListaValor = new double[5];
            System.out.println("Quantos litros ?");
            double qtdeLitros = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro de gasolina?");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            ListaValor[k] = precoGasolina;
            double total = qtdeLitros*precoGasolina;
            somaValor+= total;
            if(menorValor > ListaValor[k] || menorValor == 0){
            menorValor = ListaValor[k];
            }
    }   
    leitor.close();  
    System.out.printf("Menor valor: %.2f\n", menorValor);
    System.out.printf("Média abastecimentos: %.2f\n", somaValor/5);
    }
}
