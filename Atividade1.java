
public class Atividade1{
    public static void main(String[] args){
        String Product1 = "Computer";
        String Product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'f';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;  

        System.out.println(" ");
        System.out.println("Products:");
        System.out.println(Product1 + "which price is $"+ price1);
        System.out.println(Product2 + "which price is $"+ price2);
        System.out.println(" ");
        System.out.println("Record:"+ age + "years old, code"+ code +"and gender:"+gender);
        System.out.println(" ");
        System.out.println("Measue with eight decimal places:"+ measure);
        System.out.printf("Rouded(three decimal places):%.3f%n",measure);
        System.out.printf("US decimal point %.2f%n", measure);
    }
}