import java.util.Scanner;

public class DesvioEncadeadoElseIf {

	public static void main(String[] args) {
		/*Uma ONG resolveu prestar um servi�o bem diferente: ela oferece vans para buscar pessoas com qualquer tipo de dificuldade de locomocao para poderem votar.
		 * 
		 * Para evitar problemas no momento do embarque, porem, voce foi convidado a criar um programa que valide a idade dos passageiros: 
		 * 
		 * caso tenham menos de 16 anos, nao podem votar (e nem embarcar)
		 * caso tenham entre 16 anos e 18 incompletos, podem optar por votar ou nao
		 * caso tenham mais de 18 anos, devem votar obrigatoriamente
		 * 
		 * Crie um programa que receba a idade dos passageiros em potencial e indique se podem embarcar e votar.
		 * */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		
		System.out.println("Por favor, digite a idade do passageiro.");
		idade = leitor.nextInt();
	
		/*Aqui devemos criar uma solucao para realizar as verificacoes.*/
		
		if (idade<16) {
			System.out.println("O passageiro não pode votar e nem embarcar");
			
		}else if (idade>=18) {
			System.out.println("O passageiro é obrigado a votar e pode embarcar");
				
		}else {
			System.out.println("O passageiro pode votar e pode embarcar");
			}
		
		leitor.close();

	}

}
