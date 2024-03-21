
/*Algoritmo da questão 2) do teste prático =)
>>> Código 100% feito por Jorge Dantas <<<
OBJETIVO: Fazer um programa que consegue receber um número,
calcular a série de FIBONACCI e verificar se o número está ou não dentro
dela, avisando com uma mensagem..
 * A série de FIBONACCI é formada pela sequência:
 *0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
*/
import java.util.Scanner; //-> Importando a classe "Scanner" da biblioteca do Java..

public class EstagioRP2 {

    static int verifica; // "variavelzinha" importante para verificar se o número que o user digitou faz
                         // parte ou não da série..

    static long funcao_Fibonacci(int n) {
        int num_atual = 0; // será sempre o número atual no loop
        int num_anterior = 0; // será sempre o número anterior ao atual que será incrementado (+1)

        /*
         * Enquanto o contador for menor ou igual a 'n', incremente 1 nele e rode
         * esta estrutura, sendo que parte do contador = 1
         */
        for (int contador = 1; contador <= n; contador++) {
            if (contador == 1) { // Se o contador for 1, faça código abaixo.

                num_atual = 1; // 'Sete' valor 1 na variável num_atual
                num_anterior = 0; // 'Sete' valor 0 na num_anterior

            }
            /*
             * Com o if acima consigo garantir que quando o contador for 1, começarei a
             * fazer a lógica da série de Fibonacci aparecer..
             */

            else { /*
                    * "se não", i.e., se o if acima não for verdade, significa que
                    * contador não é igual a 1, logo, ele deve ser maior..
                    */

                /* Define que o valor atual como a soma dele mesmo com o valor anterior */
                num_atual += num_anterior;

                /*
                 * Após a operação acima, o valor de num_anterior vai ser o valor atual
                 * menos o seu próprio valor, obedecendo a lógica da Série..
                 */
                num_anterior = num_atual - num_anterior;
            }
        }
        return num_atual; // faz a função retornar o valor atual desta variável
    }

    public static void main(String args[]) {
        String fecha_programa = null;
        while (!"N".equals(fecha_programa)) {

            /*
             * declarando variável do tipo Scanner, que serve para muitas coisas,
             * dentre elas, receber valores do tipo int ou float do teclado..
             * A ideia aqui é que o usuário possa digitar o range (até onde vai a contagem
             * da série que nosso programa calcula =)
             */
            Scanner tecla = new Scanner(System.in);

            // Pedindo o valor a ser processado
            System.out.println("Quantas ciclos da Série de Fibonacci devo calcular? ");

            // criando variável int num guardando nela o valor digitado no keyboard..
            int limite = tecla.nextInt();

            // Aqui o sistema irá falar o número digitado, que será o número de vezes
            // que a série será calculada (ciclos)
            System.out.println("Opa, seguem " + limite + " Séries:");

            /*
             * Neste for uso o número que o usuário der como limite para os ciclos
             * da série
             */
            for (int i = 0; i < limite; i++) {

                /*
                 * Aqui tem um pulo do gato, pois eu tenho um if que vai servir como
                 * o verificador. A cada ciclo ele vai "ver" se o limite que o user digitou
                 * tem o exato valor da série naquele momento atual do ciclo. Assim que esta
                 * condição for VERDADEIRA, ele irá guardar o valor que o usuário digitou
                 * na variável "verifica", que foi criada só para pegar este valor e me
                 * permitir usá-lo fora da estrutura for.. Basicamente, a solução do
                 * programa está resolvida neste simples if, que não mostra nada para o
                 * user, mas guarda o número que ele digitou e verifica se ele aparece
                 * na série, ou não!
                 */
                if (limite == funcao_Fibonacci(i)) {
                    verifica = limite;
                }

                System.out.print("(" + i + "º):" + EstagioRP2.funcao_Fibonacci(i) + "\t");
            }

            if (limite == verifica) {

                System.out.print("\n\nHey! Parabéns, o número " + verifica + " faz parte da Série!\n\n");
            } else {
                System.out.print("\n\nObrigado por utilizar nosso sistema, o número " + limite
                        + " não fez parte desta Série.\n\n");
            }

            System.out.print("Vamos de novo!? (Digite S ou N)\n");
            fecha_programa = tecla.next();
        }
        System.out.println("\nHey, foi bem divertido, obrigado!!\n\n");
    }
}