import java.util.Scanner;

public class SueldosOperadores {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
                horasTrabajadas=teclado.nextInt();
        System.out.print("Ingrese el valor de la hora:");
        costoHora=teclado.nextFloat();
        sueldo=(horasTrabajadas * costoHora) * 5 * 4 ;
        System.out.print("El empleado debe cobrar:");
        System.out.print(sueldo);
    }
}
