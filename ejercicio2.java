public class ejercicio2 {

    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz 10x10 con las tablas de multiplicar del 1 al 10:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

