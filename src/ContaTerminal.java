import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, insira o número da conta !");
		int numero = sc.nextInt();
		
		System.out.println("Por favor, insira o número da agência !");
		String agencia = sc.next();
		
		System.out.println("Por favor, insira o seu nome !");
		String nomeCliente = sc.next();
		
		System.out.println("Por favor, insira o valor do saldo !");
		double saldo = sc.nextDouble();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,"
				+ " sua agência é "+ agencia +","
				+ " conta " + numero +""
				+ " e seu saldo (R$"+ saldo +") já está disponível para saque");
		
		sc.close();
	}
	
}
