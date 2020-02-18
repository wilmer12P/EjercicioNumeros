/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicoNumeros;

import java.text.Normalizer;

/**
 *
 * @author Wilmer
 */
public class ejercicioNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] NumerosArray = new Integer[]{3, 5, 7, 3, 6, 8, 9, 3, 4, 5,10};
        int pares = 0, impares = 0, Num=0;
        int Numeros = NumerosArray.length;
        int sumPar = 0, sumImpar = 0;
        int cont = 0;
        for (int i = 0; i < Numeros; i++) {
            //System.out.println(NumerosArray[i]);

            for (int j = 0; j < Numeros; j++) {
                if (NumerosArray[i] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

        }
        int par[] = new int[pares];
        int impar[] = new int[impares];

        pares = 0;
        impares = 0;

        for (int i = 0; i < Numeros; i++) {
            if (NumerosArray[i] % 2 == 0) {
                par[pares] = NumerosArray[i];
                pares++;
            } else {
                impar[impares] = NumerosArray[i];
                impares++;
            }
        }
        System.out.println("Numeros pares ");
        for (int i = 0; i < pares; i++) {
            
            System.out.println(par[i] + "-");
        }
        System.out.println("Numeros impares ");
        for (int i = 0; i < impares; i++) {
            System.out.println(impar[i] + "-");
        }
        for (int i = 0; i < Numeros; i++) {
            if (NumerosArray[i] % 2 == 0) {
                sumPar = sumPar + NumerosArray[i];
               
                System.out.println("suma de pares " + sumPar);
            } else {
                sumImpar = sumImpar + NumerosArray[i];
                System.out.println("suma de impares " + sumImpar);
            }

        }
        for (int i = 0; i < Numeros; i++) {
            int div = 0;
            for (int j = 1; j <= NumerosArray[i]; j++) {
                if (NumerosArray[i] % j == 0) {
                    div++;
                }

            }
            if (div == 2) {
                System.out.println("numeros primos" + NumerosArray[i]);
                cont++;
            }

        }
        System.out.println("cantidad de numeros primo " + cont);
        
        for (int i = 0; i < Numeros; i++) {
            if (NumerosArray[i] % 2 == 0 && NumerosArray[i] > Num) {
                Num=NumerosArray[i];
            }
        }
        System.out.println("el numero mayor de los pares es "+Num);
        for (int i = 0; i < Numeros; i++) {
             if (NumerosArray[i] % 2 == 1 && NumerosArray[i] < Num) {
                Num=NumerosArray[i];
            }
        }
        System.out.println("el numero menor de los impares es "+Num);
    }
    
}
