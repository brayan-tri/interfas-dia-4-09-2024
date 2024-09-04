package logica;

import igu.pantalla;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfas_ {

    public static void main(String[] args) {
        // Crear una instancia de la pantalla y mostrarla
        pantalla panta = new pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);

        // Crear una instancia de la clase Lista y ejecutar el método contarNumeros
       
        
    }

   public static class Lista {
    private final float[] numeros;
    private int lblCero = 0;
    private int lblPar = 0;
    private int lblImpar = 0;

    // Constructor que inicializa el arreglo con los valores pasados como argumentos
    public Lista(float numeros[]) {
        this.numeros = numeros;
    }

    // Método para contar pares, impares y ceros
    public void contarNumeros() {
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i=0; i<numeros.length;i++) {
            if (numeros[i] == 0) {
                lblCero++;
            }  else if (numeros[i] % 2 == 0) {
                    lblPar++;
                } else {
                    lblImpar++;
                }
        }

          /*  // Actualizar los JTextField con los resultados
        lblCero.setText("Ceros: " + contadorCero);
        lblPar.setText("Pares: " + contadorPares);
        lblImpar.setText("Impares: " + contadorImpares);*/
        }
     public String cero() {
            return String.valueOf(lblCero);
        }

        public String par() {
            return String.valueOf(lblPar);
        }

        public String impar() {
            return String.valueOf(lblImpar);
        }
    }
  
   
}
  
  
 