import java.util.Arrays;

public class AcademiaCapgemini {

    // Questão 01 - DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI
    public static int EncontrarMediana(int[] array) {
        int primeiraPosicao = 0;
        int ultimaPosicao = array.length - 1;

        Arrays.sort(array);

        return array[((primeiraPosicao + ultimaPosicao) / 2)];
    }

    // Questão 02 - DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI
    public static int ContarDiferenca(int[] n, int x) {
        Arrays.sort(n);
        int tamVetor = n.length - 1;

        int contador = 0;

        for (int j = tamVetor; j >= 0; j--) {
            for (int i = tamVetor; i >= 0; i--) {
                if ((n[j] - n[i]) == x) {
                    contador++;
                }
            }
        }

        return contador;
    }

    // Questão 03 - DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI
    public static String EncriptandoTexto(String texto) {
        String result = texto.replaceAll("\\s+", "");
        double tamTexto = result.length();

        int T = (int) Math.ceil(Math.sqrt(tamTexto));

        char matriz[][] = new char[T][T];

        int indexCount = 0;
        StringBuilder txtEncriptando = new StringBuilder();

        for (var row = 0; row < T; row++) {
            for (var column = 0; column < T; column++) {

                if (indexCount > tamTexto - 1)
                    break;

                matriz[row][column] = result.charAt(indexCount);
                indexCount++;
            }
        }

        for (var column = 0; column < T; column++) {
            for (var row = 0; row < T; row++) {

                if(!(matriz[row][column] == 0)){
                    txtEncriptando.append(matriz[row][column]);
                }

                if (row == (T - 1)) {
                    txtEncriptando.append(" ");
                }

            }
        }

        return txtEncriptando.toString().trim();
    }

}