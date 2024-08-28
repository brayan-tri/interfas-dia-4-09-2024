package main;

public class Estudiantes {
    private String documentoIdentidad;
    private int modeloParcial;

    public Estudiantes(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
        this.modeloParcial = asignarModeloParcial();
    }

    private int asignarModeloParcial() {
        int ultimoDigito = Integer.parseInt(documentoIdentidad.substring(documentoIdentidad.length() - 1));
        
        switch (ultimoDigito) {
            case 1: case 6:
                return 1;
            case 2: case 7:
                return 2;
            case 3: case 8:
                return 3;
            case 4: case 9:
                return 4;
            case 5: case 0:
                return 5;
            default:
                throw new AssertionError("Dígito no válido");
        }
    }

    public int getModeloParcial() {
        return modeloParcial;
    }

    @Override
    public String toString() {
        return "Estudiante: " + documentoIdentidad + ", Modelo: " + modeloParcial;
    }
}