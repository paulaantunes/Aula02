import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		
		/*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
		 *Por se tratar de um assunto sensivel, ficou decidido que a idade minima para jogar eh de 12 anos.
		 *Sua funcao eh criar um programa que receba a idade do usuario e exiba a mensagem "Voce pode jogar" caso ele tenha 12 anos ou mais. */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		
		/*Aqui devemos criar uma solucao para verificar a idade do usuario*/
		
		if (idade>=12) {
			System.out.println("Você pode jogar");		}
			
		leitor.close();

	}

}
