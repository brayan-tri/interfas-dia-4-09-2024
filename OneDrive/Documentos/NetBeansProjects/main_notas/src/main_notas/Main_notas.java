package main_notas;

import java.util.Scanner;


public class Main_notas {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        int cantidadNotas;
        double nota = 0;
        
        
        System.out.println("Ingrese la cantidad de notas:");
        cantidadNotas = scanner.nextInt();

        for (int i = 1; i <= cantidadNotas; i++) { // Asegurarse de que sea <= para incluir todas las notas
            System.out.println("Ingresar la nota " + i + ":");
            nota = scanner.nextDouble();
            estudiante.agregarNota(nota);  // Asegúrate de que el método se llame agregarNota
        }

        System.out.println("Promedio: " + estudiante.calcularPromedio());
        System.out.println("Notas por encima del promedio: " + estudiante.contarNotasPorEncimaDelPromedio(nota));
        System.out.println("Notas por debajo del promedio: " + estudiante.contarNotasPorDebajoDelPromedio(nota));
    }
}
    