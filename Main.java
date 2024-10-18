import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0;
        double promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0;
        int contadorPersonas = 0, acumuladorEdad = 0, acumuladorEstatura = 0;
        int cantidadPersonas = 2;

        for (int numeropersona = 1; numeropersona <= cantidadPersonas; numeropersona++) {
            System.out.print("Ingrese la edad de la persona " + numeropersona + ": ");
            edad = scanner.nextInt();

            System.out.print("Ingrese el estado civil de la persona " + numeropersona + " (1. Soltero  2. Casado): ");
            estadoCivil = scanner.nextInt();

            System.out.print("Ingrese la estatura de la persona " + numeropersona + " en cms: ");
            estatura = scanner.nextInt();

            System.out.print("Ingrese el sexo de la persona " + numeropersona + " (1. Hombre   2. Mujer): ");
            sexo = scanner.nextInt();

            if ((edad >= 18) && (estadoCivil == 1) && (estatura > 170) && (sexo == 1)) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }

        if (contadorPersonas > 0) {
            promedioEdad = (double) acumuladorEdad / contadorPersonas;
            promedioEstatura = (double) acumuladorEstatura / contadorPersonas;
            porcentajePersonas = (double) contadorPersonas / cantidadPersonas * 100;

            System.out.println("El promedio de edad de las personas que cumplen es " + promedioEdad + " años");
            System.out.println("El promedio de estatura de las personas que cumplen es " + promedioEstatura + " centímetros");
            System.out.println("El porcentaje de las personas que cumplen con la condición es del " + porcentajePersonas + " %");
        } else {
            System.out.println("Ninguna persona cumple con las condiciones.");
        }

        scanner.close();
    }
}