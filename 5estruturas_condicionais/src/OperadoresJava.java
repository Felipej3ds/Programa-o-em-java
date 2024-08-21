public class OperadoresJava{ /*Operadores em java são simbulos utilizados para performar operações específicas */

    public static void main(String[] args) {
        // Demonstração dos operadores
        System.out.println("Demonstrando Operadores Aritméticos:");
        OperadoresAritmeticos.demo();
        
        System.out.println("\nDemonstrando Operadores Unários:");
        OperadoresUnarios.demo();
        
        System.out.println("\nDemonstrando Operador de Atribuição:");
        OperadorAtribuicao.demo();
        
        System.out.println("\nDemonstrando Operadores Relacionais:");
        OperadoresRelacionais.demo();
        
        System.out.println("\nDemonstrando Operadores Lógicos:");
        OperadoresLogicos.demo();
        
        System.out.println("\nDemonstrando Operador Ternário:");
        OperadorTernario.demo();
        
        System.out.println("\nDemonstrando Operadores Bitwise:");
        OperadoresBitwise.demo();
        
        System.out.println("\nDemonstrando Operadores de Deslocamento (Shift):");
        OperadoresShift.demo();
        
        System.out.println("\nDemonstrando Operador instanceof:");
        OperadorInstanceof.demo();
    }

    static class OperadoresAritmeticos { //Operadores aritiméticos são utilizados para performar operações simples nos tipos de dados primitivos
        static void demo() {
            int a = 10;
            int b = 5;

            System.out.println("a + b = " + (a + b)); // Adição
            System.out.println("a - b = " + (a - b)); // Subtração
            System.out.println("a * b = " + (a * b)); // Multiplicação
            System.out.println("a / b = " + (a / b)); // Divisão
            System.out.println("a % b = " + (a % b)); // Módulo
        }
    }

    static class OperadoresUnarios { // Operadores Unarios são utilizados para incrementar ou decrementar ou negar um valor
        static void demo() {
            int a = 10;

            System.out.println("++a = " + (++a)); // Pré-incremento
            System.out.println("a-- = " + (a--)); // Pós-decremento
            System.out.println("a = " + a); // Mostra o valor após o pós-decremento
            System.out.println("!true = " + !true); // Negação lógica
        }
    }

    static class OperadorAtribuicao {
        static void demo() {
            int c = 7;
            c += 3; // c = c + 3
            System.out.println("c += 3; c = " + c);
        }
    }

    static class OperadoresRelacionais { //Esses operadores são utilizados para checkar por relações como (maior que, menor que, igual a ) e retornar valores booleanos
        static void demo() {
            int a = 10;
            int b = 5;

            System.out.println("a == b = " + (a == b)); // Igualdade
            System.out.println("a != b = " + (a != b)); // Diferente
            System.out.println("a > b = " + (a > b));   // Maior que
            System.out.println("a < b = " + (a < b));   // Menor que
            System.out.println("a >= b = " + (a >= b)); // Maior ou igual
            System.out.println("a <= b = " + (a <= b)); // Menor ou igual
        }
    }

    static class OperadoresLogicos { // é utilizao para performar um e logico ou um or logico e um not logico que inverte o valor logico
        static void demo() {
            boolean x = true;
            boolean y = false;

            System.out.println("x && y = " + (x && y)); // E lógico
            System.out.println("x || y = " + (x || y)); // OU lógico
            System.out.println("!x = " + !x);            // NÃO lógico
        }
    }

    static class OperadorTernario { // é uma versão "encurtada" do if-else que possui tres operandos(dai o nome ternario) 
        static void demo() {
            int a = 10;
            int b = 5;

            String resultado = (a > b) ? "a é maior que b" : "a não é maior que b"; /*formato geral*/ //(condição ? if true : if false)
            System.out.println(resultado);
        }
    }

    static class OperadoresBitwise {
        static void demo() {
            int a = 5; // 0101 em binário
            int b = 3; // 0011 em binário

            System.out.println("a & b = " + (a & b)); // E bitwise
            System.out.println("a | b = " + (a | b)); // OU bitwise
            System.out.println("a ^ b = " + (a ^ b)); // XOR bitwise
            System.out.println("~a = " + (~a));       // NÃO bitwise
        }
    }

    static class OperadoresShift {
        static void demo() {
            int a = 8; // 00001000 em binário

            System.out.println("a << 2 = " + (a << 2)); // Deslocamento para a esquerda
            System.out.println("a >> 2 = " + (a >> 2)); // Deslocamento para a direita
            System.out.println("a >>> 2 = " + (a >>> 2)); // Deslocamento para a direita sem sinal
        }
    }

    static class OperadorInstanceof {
        static void demo() {
            String texto = "Olá, Mundo!";

            System.out.println("texto instanceof String = " + (texto instanceof String)); // Verifica se texto é uma instância de String
            System.out.println("texto instanceof Object = " + (texto instanceof Object)); // Verifica se texto é uma instância de Object
        }
    }
}

