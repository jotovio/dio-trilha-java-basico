public class operadores {

    public static void main(String[] args) throws Exception {

        String nome1 = "João"; // criando uma String literal, que é armazenada no pool de strings (uma área especial da memória para otimizar o uso de strings)
        String nome2 = new String("João"); // criando um novo objeto String com o mesmo conteúdo de nome1, mas em um local diferente na memória

        System.out.println(nome1 == nome2); // comparação de referência / == pergunta: é a mesma caixa?
        System.out.println(nome1.equals(nome2)); // comparação de conteúdo / .equals() pergunta: o que está dentro da caixa é igual?
        //Dois objetos podem ter o mesmo valor, mas não serem o mesmo objeto.
        System.out.println(nome1.equals(nome2) ? "Nomes iguais" : "Nomes diferentes"); // operador ternário: condição ? valor se verdadeiro : valor se falso

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) { // operador lógico AND: retorna true se ambas as condições forem verdadeiras
            System.out.println("As duas condições são verdadeiras");
        } else if (condicao1 || condicao2) { // operador lógico OR: retorna true se pelo menos uma das condições for verdadeira
            System.out.println("Pelo menos uma das condições é verdadeira");
        } else {
            System.out.println("Nenhuma das condições é verdadeira");
        }

        if (condicao1 && !condicao2) { // operador lógico NOT: inverte o valor de uma condição
            System.out.println("A primeira condição é verdadeira e a segunda é falsa");
        }

        // Redunância: o operador ternário é usado para atribuir um valor booleano com base em uma condição, 
        // mas isso pode ser simplificado diretamente usando a expressão lógica sem a necessidade do operador ternário.
        boolean resultado = (condicao1 && condicao2) ? true : false; // operador ternário para atribuir um valor booleano com base em uma condição
        System.out.println("Resultado da operação AND: " + resultado);
        boolean resultado2 = (condicao1 || condicao2) ? true : false; // operador ternário para atribuir um valor booleano com base em uma condição
        System.out.println("Resultado da operação OR: " + resultado2);

    }
}
