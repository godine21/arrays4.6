public class ejercicio1 {

    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int contador = 1;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz 5x5 con números del 1 al 25:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
