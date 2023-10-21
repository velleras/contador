package contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Entre com o parametroUM: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Entre com o parametroDois: ");
		int parametroDois = terminal.nextInt();
		
		System.out.println("Parametros coletados: " + parametroUm + " e " + parametroDois);
		
		
		contar(parametroUm, parametroDois);
			
		

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		System.out.println("Impressao dos numeros com base na variavel contagem");
		for (int indice=1;indice <=contagem;indice++) {
			System.out.println(indice);
		}
	}
}
