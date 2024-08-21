public class escrita {
    public static void main(String[] args) throws Exception {

        System.out.print("escrita de dados sem qubra de linhas no final"); 
        System.out.println("\nescrita de dados com quebra de linhas no final");
   

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda); //concatenação de varias variaveis
    } //pare se fazer a concatenação utilizasse o pintf
}
