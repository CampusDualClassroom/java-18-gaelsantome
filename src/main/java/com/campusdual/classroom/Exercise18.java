package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {



	public static int [] createAndInitializeArray (int elements){
		int[] intArray = new int[elements];
		for (int i=0; i<elements; i++){
			intArray[i] = i+1;
		}
		return intArray;
	}

	public static void showInlineArray(int[] num ){


		for (int i=0; i< num.length; i++){
			System.out.println(num[i]);
			if (i <num.length - 1){
				System.out.println(" ");
			}
		}

		System.out.println();
	}


	public static void main(String[] args) {


		int tamaño = Utils.Util.requestInt("Ingresa el tamaño del indice: ");
		int[] initializeArray = createAndInitializeArray(tamaño);
		System.out.println("Array inicializado: \n ");
		showInlineArray(initializeArray);
		}


	}




