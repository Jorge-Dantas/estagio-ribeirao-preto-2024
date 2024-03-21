/*Algoritmo da questão 1) do teste prático =)
>>> Código 100% feito por Jorge Dantas <<<
*/
class EstagioRP1 {
    // Declarando variáveis e adicionando valores, conforme algoritmo
    public static int INDICE = 13, SOMA = 0, K = 0;

    public static void main(String args[]) {
        // Enquanto esta condição não for atendida, o loop executará
        // (o código dentro do while)
        while (K < INDICE) { // Enquanto K não for igual ou maior que o valor de INDICE, faça..
            K = K + 1; // pegue o valor atual da variável K e some 1 ao seu próprio valor
            SOMA = SOMA + K; // pegue a variável SOMA e some o valor atual de K ao seu próprio valor, fazendo
                             // um montante..
        }
        // Mostre na tela o valor final da soma que está na variável SOMA
        System.out.println("Soma igual a: " + SOMA);
    }
}
