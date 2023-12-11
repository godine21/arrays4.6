public class ejercicio3 {

    public static void main(String[] args) {
        int filas = Integer.parseInt(System.console().readLine("Ingrese el número de filas: "));
        int columnas = Integer.parseInt(System.console().readLine("Ingrese el número de columnas: "));
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(System.console().readLine("Ingrese el valor para la posición [" + i + "][" + j + "]: "));
            }
        }

        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > 0) {
                    mayoresCero++;
                } else if (matriz[i][j] < 0) {
                    menoresCero++;
                } else {
                    igualesCero++;
                }
            }
        }

        System.out.println("Cantidad de valores mayores que cero: " + mayoresCero);
        System.out.println("Cantidad de valores menores que cero: " + menoresCero);
        System.out.println("Cantidad de valores iguales a cero: " + igualesCero);
    }
}

