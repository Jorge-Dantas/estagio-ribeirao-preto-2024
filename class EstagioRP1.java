public class EstagioRP1 {
    public static int INDICE = 13, SOMA = 0, K = 0;

    public static void main(String args[]) {
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("Soma igual a: " + SOMA);
    }
}