package lista_de_numeros;
//importar clases//

import java.util.Scanner;

public class Lista_de_numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("ingrese 10 datos");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero" + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorCero = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
            if (numeros[i] * 1 == 0) {
                contadorCero++;

            }

        }
        System.out.println("los numeros pares son:" + contadorPares);
        System.out.println("los numeros impares son:" + contadorImpares);
        System.out.println("los numeros ceros son:" + contadorCero);

    }

}
