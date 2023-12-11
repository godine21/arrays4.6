public class ejercicio4 {

    public static void main(String[] args) {
        int numAlumnos = 4;
        int numAsignaturas = 5;
        double[][] notas = new double[numAlumnos][numAsignaturas];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese las notas del Alumno " + (i + 1) + ":");
            for (int j = 0; j < numAsignaturas; j++) {
                notas[i][j] = Double.parseDouble(System.console().readLine("Nota " + (j + 1) + ": "));
            }
        }

        for (int i = 0; i < numAlumnos; i++) {
            double notaMinima = notas[i][0];
            double notaMaxima = notas[i][0];
            double sumaNotas = 0;

            for (int j = 0; j < numAsignaturas; j++) {
                double notaActual = notas[i][j];

                sumaNotas += notaActual;

                if (notaActual < notaMinima) {
                    notaMinima = notaActual;
                }

                if (notaActual > notaMaxima) {
                    notaMaxima = notaActual;
                }
            }

            double notaMedia = sumaNotas / numAsignaturas;

            System.out.println("\nAlumno " + (i + 1) + ":");
            System.out.println("Nota Mínima: " + notaMinima);
            System.out.println("Nota Máxima: " + notaMaxima);
            System.out.println("Nota Media: " + notaMedia);
        }
    }
}
