package Controller;

public class Controller {

	public Controller() {
       super ();
	}
 public int numero (int n1, int n2) {
 int contador = 0;
	 if (n1 == 0) { 
		 // condição de para vai ser quando n1 for igual a 0
		 return 0;
	 }
	 else {
		 // chamada do proximo passo vai ser quando realizar o resto( n1 % 10),e atualizar o valor de n1(n1 / 10), e caso n2 for igual ao resto, somar 1  no contador 
	 int resto = n1 % 10;
	 n1 = n1 / 10;
	 if (n2 == resto) {
		 contador ++;
	 }
	 return contador + numero(n1,n2);}
 }
 
}
