import java.util.Scanner;
public class testando123 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o preço do produto>:");
        Double preco = leitor.nextDouble();
        double desconto = ( preco <50 ) ? preco * 0.5: preco *0.10;  
        System.out.println("valor a pagar com deconto " +(preco - desconto));
        leitor.close();
    }
}
