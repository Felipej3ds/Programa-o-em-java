import java.util.Locale;

public class Exercicio1{
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        Locale.setDefault(Locale.US); 

        System.out.println("Products:\n ");
        System.out.printf("%s, which price is $%.2f\n", product1, price1);
        System.out.printf("%s, which price is $%.2f\n", product2, price2); // Corrigido para %s e %.2f
        System.out.println("Record");
        System.out.printf("%d years old, code %d and gender: %c\n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f\n", measure); // Corrigido a palavra para "Measure"
        System.out.printf("Rounded (three decimal places): %.3f\n", measure); // Corrigido a palavra para "Rounded"
        System.out.printf("US decimal point: %.3f%n\n", measure);
    } 
}
