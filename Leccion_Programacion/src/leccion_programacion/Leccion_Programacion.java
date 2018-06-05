/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion_programacion;

/**
 *
 * @author Israel
 */
public class Leccion_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definición de arreglos tipo entero con sus respectivos valores
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        int[] arreglo3 = new int[6];
        //Definición de variables tipo double
        double suma = 0;
        double promedio;
        //Primer ciclo for que recorre una dimension de 6
        for (int i = 0; i < arreglo3.length; i++) {
            //Acumulación del valor al arreglo 3 en la posicion [i]
            arreglo3[i] = (arreglo1[i] + arreglo2[i]) / 2;
            //Acumulacion de la suma del promedio 
            suma = suma + arreglo3[i];
        }
        //Presentación
        System.out.println("Reporte: ");
        //Presentación de los titulos del registro
        System.out.printf("%s\t%s\t%s\n", "Arreglo1", "Arreglo2", "Arreglo3");
        //Segundo ciclo for para la presentación del registro con los valores de los 3 arreglos
        for (int i = 0; i < arreglo3.length; i++) {
            //Presentación de los arreglos
            System.out.printf("%d\t\t%d\t\t%d\t\n", arreglo1[i], arreglo2[i], arreglo3[i]);
        }
        //Variable que saca el promedio total
        promedio = suma / 6;
        System.out.println();
        //Presentación del promedio total
        System.out.printf("El promedio del Arreglo3 es: %.2f\n", promedio);
    }
}
