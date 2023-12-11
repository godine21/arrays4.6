public class ejercicio5 {

    public static void main(String[] args) {
        int numPersonas = Integer.parseInt(System.console().readLine("Ingrese la cantidad de personas a registrar: "));
        double[][] informacion = new double[numPersonas][2]; 

        for (int i = 0; i < numPersonas; i++) {
            informacion[i][0] = Integer.parseInt(System.console().readLine("Ingrese el género (0 para varón, 1 para mujer) de la persona " + (i + 1) + ": "));
            informacion[i][1] = Double.parseDouble(System.console().readLine("Ingrese el sueldo de la persona " + (i + 1) + ": "));
        }

        double sueldoHombres = 0;
        int cantidadHombres = 0;
        double sueldoMujeres = 0;
        int cantidadMujeres = 0;

        for (int i = 0; i < numPersonas; i++) {
            if (informacion[i][0] == 0) { 
                sueldoHombres += informacion[i][1];
                cantidadHombres++;
            } else if (informacion[i][0] == 1) { 
                sueldoMujeres += informacion[i][1];
                cantidadMujeres++;
            }
        }

        if (cantidadHombres > 0) {
            double sueldoMedioHombres = sueldoHombres / cantidadHombres;
            System.out.println("Sueldo medio de hombres: " + sueldoMedioHombres);
        } else {
            System.out.println("No se registraron sueldos de hombres.");
        }

        if (cantidadMujeres > 0) {
            double sueldoMedioMujeres = sueldoMujeres / cantidadMujeres;
            System.out.println("Sueldo medio de mujeres: " + sueldoMedioMujeres);
        } else {
            System.out.println("No se registraron sueldos de mujeres.");
        }

        if (cantidadHombres > 0 && cantidadMujeres > 0) {
            double brechaSalarial = Math.abs(sueldoHombres / cantidadHombres - sueldoMujeres / cantidadMujeres);
            System.out.println("Brecha salarial entre hombres y mujeres: " + brechaSalarial);
        } else {
            System.out.println("No hay suficientes datos para calcular la brecha salarial entre hombres y mujeres.");
        }
    }
}
