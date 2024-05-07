/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class StringSorter {
    private List<String> stringList;

    public StringSorter() {
        // Se inicializa el ArrayList
        stringList = new ArrayList<>();

        // Se agrega el texto al ArrayList
        stringList.add("Monster");
        stringList.add("Godzilla");
        stringList.add("Amor");
        stringList.add("Psnda");
        stringList.add("Disparo");
        stringList.add("Ajedrez");
        stringList.add("Fantasia");
        stringList.add("Destino");
        stringList.add("Alegria");
        stringList.add("Dragon");
    }

    public void Ordenar_Longitud_Anonima() {
        // Ordenar por longitud usando clase anónima
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
    }

    public void Ordenar_Longitud_Lambda() {
        // Ordenar por longitud usando expresión lambda
        stringList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public void Ord_Longitud_Referencia() {
        // Ordenar por longitud usando el método de referencia
        stringList.sort(Comparator.comparingInt(String::length));
    }

    public void Ord_Alfabetic_Anonima() {
        // Ordenar alfabéticamente usando clases anónimas
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    public void Ord_Alfabet_Lambda() {
        // Ordenar alfabéticamente usando la expresión lambda
        stringList.sort((s1, s2) -> s1.compareTo(s2));
    }

    public void Ord_Alfabet_Referencia() {
        // Ordenar alfabéticamente usando el método de referencia
        stringList.sort(String::compareTo);
    }

    public void printList() {
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StringSorter sorter = new StringSorter();
        
        System.out.println("Listas de palabras ordenadas;:");
        System.out.println("");
        System.out.println("");

        System.out.println("Ordenada por longitud usando clase anónima:");
        sorter.Ordenar_Longitud_Anonima();
        sorter.printList();

        System.out.println("\nOrdenada por longitud usando expresión lambda:");
        sorter.Ordenar_Longitud_Lambda();
        sorter.printList();

        System.out.println("\nOrdenado por longitud usando el método de referencia:");
        sorter.Ord_Longitud_Referencia();
        sorter.printList();

        System.out.println("\nOrdenado alfabéticamente usando clases anónimas:");
        sorter.Ord_Alfabetic_Anonima();
        sorter.printList();

        System.out.println("\nOrdenado alfabéticamente usando expresión lambda:");
        sorter.Ord_Alfabet_Lambda();
        sorter.printList();

        System.out.println("\nOrdenado alfabéticamente usando el método de referencia.:");
        sorter.Ord_Alfabet_Referencia();
        sorter.printList();
    }
}