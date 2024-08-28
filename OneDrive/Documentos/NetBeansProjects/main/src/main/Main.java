package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Examen examen = new Examen();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": Ingre14se su documento de identidad:");
            String documentoIdentidad = scanner.nextLine();
            examen.agregarEstudiante(documentoIdentidad);
        }

        System.out.println("\nConteo de estudiantes por modelo de parcial:");
        examen.mostrarConteoModelos();

        System.out.println("\nLista de estudiantes y sus modelos asignados:");
        examen.mostrarEstudiantes();

        scanner.close();
    }

    }