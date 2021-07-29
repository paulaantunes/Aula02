import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		/*O estatuto de uma ONG determina que todas as doacoes recebidas devem gerar um valor para investimento, para cobrir momentos de necessidade. 
		 * O valor do investimento deve ser de 5% da doacao. Porem, em casos em que as doacoes ultrapassem R$1000,00 o investimento deve ser de 15% da doacao.
		 * Sua missao eh criar um programa capaz de fazer os calculos necessarios e indicar quanto deve ser investido.*/
		
		Scanner leitor = new Scanner(System.in);
		double doacao, investimento, usoImediato;
		System.out.println("Por favor, digite o valor da doacao recebida!");
		doacao = leitor.nextDouble();
	
		/*Aqui devemos criar uma solucaoo para realizar os calculos adequados baseando-nos no valor da doacao*/
		
		if (doacao<1000) {
			investimento = doacao * 0.05;
			usoImediato = doacao - investimento;
			
		}else {
			investimento = doacao * 0.15;
			usoImediato = doacao - investimento;	
		}
		
		System.out.println("A doacao de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato + " para uso imediato");
		leitor.close();

	}

}
