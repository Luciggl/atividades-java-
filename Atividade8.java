import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        for(int K=0; K<x; K++){
                if(K%2 != 0){
                System.out.println(K);
            }
        }

        leitor.close();
    }
    
}
