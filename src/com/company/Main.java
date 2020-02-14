package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] tablica = new int[] {20, 10, 13, 30, 100, 20, 102, 4, 10, 17};

	int maxValue = Integer.MAX_VALUE;
	int minValue = Integer.MIN_VALUE;
	float suma = 0;

	for (int i = 0; i<tablica.length; i++){

	    if (tablica[i] < maxValue){
	        maxValue = tablica[i];
        }
        if (tablica[i] > minValue) {
            minValue = tablica[i];
        }

        suma = suma + tablica[i];

	}

	float średnia =  suma / tablica.length;

	System.out.println("średnia = "+ Arrays.toString(tablica));
	System.out.println("max Value = " + maxValue + ", min Value = " + minValue + ", średnia = " + średnia);

    }
}
