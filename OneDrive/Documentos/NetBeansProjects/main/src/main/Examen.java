package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Examen {
    private ArrayList<Estudiantes> estudiantes;
    private HashMap<Integer, Integer> conteoModelos;

    public Examen() {
        this.estudiantes = new ArrayList<>();
        this.conteoModelos = new HashMap<>();
    }

    public void agregarEstudiante(String documentoIdentidad) {
        if (documentoIdentidad == null || documentoIdentidad.isEmpty()) {
            System.out.println("Documento de identidad no válido.");
            return;
        }
        
        Estudiantes estudiante = new Estudiantes(documentoIdentidad);
        estudiantes.add(estudiante);
        int modelo = estudiante.getModeloParcial();
        conteoModelos.put(modelo, conteoModelos.getOrDefault(modelo, 0) + 1);
    }

    public void mostrarConteoModelos() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Modelo " + i + ": " + conteoModelos.getOrDefault(i, 0) + " estudiantes");
        }
    }

    public void mostrarEstudiantes() {
        for (Estudiantes estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
