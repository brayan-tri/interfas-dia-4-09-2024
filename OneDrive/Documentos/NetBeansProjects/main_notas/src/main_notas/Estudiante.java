package main_notas;

import java.util.ArrayList;

public class Estudiante {
    private ArrayList<Double> notas = new ArrayList<>();  // Asegúrate de que sea ArrayList<Double>
    
    public void agregarNota(double nota) {
        notas.add(nota);
    }
    
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }   
        return suma / notas.size();
        
    }
    
    
    public int contarNotasPorEncimaDelPromedio(double promedio) {
        int contador = 0;
        for (double nota : notas) {
            if (nota > promedio) {  // Asegúrate de que la comparación sea correcta
                contador++;
            }
            
        }
        return contador;
    }
    
    public int contarNotasPorDebajoDelPromedio(double promedio) {
        int contador = 0;
        for (double nota : notas) {
            if (nota < promedio) {  // Asegúrate de que la comparación sea correcta
                contador++;
            }
        }
        return contador;
    }
    
}
    
