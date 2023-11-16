import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int numero, numero2;
		System.out.println("Digite um numero ");
		numero = leitura.nextInt();
		System.out.println("Digite o segundo numero ");
		numero = leitura.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("o primeiro numero é maior que o segundo ");
		}else {
			System.out.println("o segundo numero digitado e maior que o primeiro");
		}
		
		int idade = 0;
		System.out.println("Digite sua idade que vou dizer se voce e maior ou menos de idade ");
		
		if(idade >= 18) {
			System.out.println("voce é maior de idade");
		}else {
		System.out.println("voce é maior de idade");
		}
		
	char letra;
	System.out.println("digite uma letra");
	letra = leitura.next().charAt(0);
	
	if(letra == 'a' || letra == 'e' || letra == 'i') {
		System.out.println("a letra digitada é uma vogal");
	}else {
		System.out.println("A letra digitada NAO é uma vogal");
	}
		
		
		}
		
		
	}