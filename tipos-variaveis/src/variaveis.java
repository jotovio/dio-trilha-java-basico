public class variaveis {

    // Variável de classe (atributo estático)
    static int variavelEstatica = 100; 
    // variável pertence à classe, não ao objeto

    public static void main(String[] args) {

        /*
         * ===============================
         * TIPOS PRIMITIVOS
         * ===============================
         * São armazenados diretamente na memória stack.
         * Guardam o valor em si, não uma referência.
         */

        byte numeroByte = 127; // 8 bits (-128 a 127)
        short numeroShort = 32000; // 16 bits
        int numeroInt = 2147483647; // 32 bits (mais usado)
        long numeroLong = 9223372036854775807L; // 64 bits (precisa do L no final)

        float numeroFloat = 10.5f; // 32 bits (precisa do f no final)
        double numeroDouble = 20.99; // 64 bits (mais preciso que float)

        char letra = 'J'; // armazena um único caractere (usa tabela Unicode)
        boolean verdadeiro = true; // armazena apenas true ou false

        System.out.println("Int: " + numeroInt);
        System.out.println("Double: " + numeroDouble);
        System.out.println("Char: " + letra);
        System.out.println("Boolean: " + verdadeiro);

        /*
         * ===============================
         * TIPOS NÃO PRIMITIVOS (OBJETOS)
         * ===============================
         * Armazenam referência para um objeto na memória heap.
         */

        String nome = "João"; 
        // String é uma classe, não é primitivo

        Integer idade = 18; 
        // Wrapper class → versão objeto do tipo int

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        /*
         * ===============================
         * CONSTANTES
         * ===============================
         * Usamos a palavra-chave final.
         * O valor não pode ser alterado depois de atribuído.
         */

        final double PI = 3.14159;
        System.out.println("Valor de PI: " + PI);

        /*
         * ===============================
         * CASTING (CONVERSÃO DE TIPOS)
         * ===============================
         */

        int numero = 10;
        double convertidoAutomatico = numero; 
        // casting implícito (int → double)
        // tipo menor para maior é automático

        double valorDecimal = 9.78;
        int convertidoManual = (int) valorDecimal; 
        // casting explícito
        // perde a parte decimal

        System.out.println("Casting automático: " + convertidoAutomatico);
        System.out.println("Casting manual: " + convertidoManual);

        /*
         * ===============================
         * INFERÊNCIA DE TIPO (Java 10+)
         * ===============================
         * O compilador descobre o tipo automaticamente.
         */

        var sobrenome = "Vieira"; // vira String
        var altura = 1.70; // vira double

        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Altura: " + altura);

        /*
         * ===============================
         * ESCOPO DE VARIÁVEL
         * ===============================
         */

        int variavelLocal = 50;
        // só existe dentro do método main

        if (variavelLocal > 10) {
            int variavelBloco = 5;
            // só existe dentro do bloco if
            System.out.println("Variável do bloco: " + variavelBloco);
        }

        // System.out.println(variavelBloco); 
        // ERRO! variavelBloco não existe fora do bloco

        System.out.println("Variável estática: " + variavelEstatica);

        /*
         * ===============================
         * DIFERENÇA IMPORTANTE
         * ===============================
         * Primitivo guarda valor.
         * Objeto guarda referência.
         */

        int a = 10;
        int b = a; 
        b = 20;

        // a continua 10, pois cada variável tem seu próprio valor
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}