/*Criar uma aplicação em Java que tenha uma função recursiva que,
recebendo um numero inteiro de 10 a 999999 e recebendo um 2º
número inteiro (de 0 a 9), tenha uma função recursiva que apresente
quantas vezes o 2º número aparece no primeiro.*/
package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
   Controller aparece = new Controller();
   int n1 = 25555;
   int n2 = 2;
   int numero = aparece.numero(n1,n2);
   System.out.println(numero);


	}

}
