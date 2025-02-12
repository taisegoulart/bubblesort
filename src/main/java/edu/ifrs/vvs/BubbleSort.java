/**
 * @License
 * Copyright 2020 Bubble Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

import java.util.Scanner;

//notas sobre o bubblesort: "consiste em percorrer os N elementos de um vetor, para cada vez percorrida, todos os elementos são comparados com o seu próximo"

/**
 * Bubble Sort.
 */
public class BubbleSort {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Método que ordena um vetor de inteiros utilizando o algoritmo de Bubble Sort.
     *
     * http://www.universidadejava.com.br/pesquisa_ordenacao/bubble-sort/
     *
     * @param v - Vetor que será ordenado.
     */
    public void sort(int... v) {
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
        for (int i = 0; i < v.length - 1; i++) {
            // for utilizado para ordenar o vetor.
            for (int j = 0; j < v.length - 1 - i; j++) {
                /*
                 * Se o valor da posição atual do vetor for maior que o próximo valor, então
                 * troca os valores de lugar no vetor.
                 */
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    } // exemplo de teste: verificar se o sort está sendo feito de forma correta

    /**
     * Reads the values.
     *
     * @return array of int
     */
    public int[] read() {
        int size = this.size();
        int[] values = new int[size];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Value " + i + ": ");
            values[i] = Integer.valueOf(this.scanner.next());
        }
        return values;
    } //exemplo de teste: confirmar se o valor que é lido é igual ao de entrada

    /**
     * Reads the size of the array.
     *
     * @return the size of the array
     */
    private int size() {
        System.out.print("Size of array: ");
        int size = Integer.valueOf(this.scanner.next());
        return size;
    } // exemplo de teste: confirmar se o tamanho do array é o mesmo que o verdadeiro, 

    /**
     * Shows the array.
     *
     * @param values the array
     */
    public void show(int... values) {
        for (int num : values) {
            System.out.print(num + " ");
        }
    }
} //exemplo de teste: mostrar se o array está retornando corretamente o seu conteúdo
