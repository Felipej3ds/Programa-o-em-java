import java.io.Console;
import java.util.Scanner;
/*Iremos aprender entrada de dados utilizando a classe Scanner para dados em garal e o objeto console do java.io utilizado expessialmente para dados do tipo texto */
// a classe Scanner é utilizada para pegar imput e é encontrada no pakege java.util

public class Entrada {

    public static void main(String[] args) {
        // a classe sccaner
        Scanner Sc = new Scanner(System.in); /* instanciamos um objeto da classe escanner para entrada de dados */

        // A classe scaner possuir metodos diferentes para o armazenamento de dados
        // distintos;
        System.out.println("digite algum texto:");
        String Something = Sc.nextLine(); // o next line serve para a entrada de dados do tipo texto, esse metodo lê o dado até a primeira quebra de linha
        System.out.println("texto digitado: " + Something);

        System.out.println("digite algum numero:");
        int numero = Sc.nextInt();// no geral para ler um tipo de dado basta apenas colocar  scanner.next(Dataype);
        System.out.println("numero digitado: " + numero);

        System.out.println("digite algum texto:");
        char caractere = Sc.next().charAt(0); // para ler um caractere específico temos uma ecessão
        System.out.println("o primeiro caractere de texto foi: "+caractere);

        System.out.println("digite algum texto:"); 
        Console console = System.console();
        String x = console.readLine();
        System.out.println("texto digitado: " + x);

        Sc.close();
    }
}
