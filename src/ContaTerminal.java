import java.util.Scanner;


public class ContaTerminal {

@SuppressWarnings("resource")
public static void main(String[] args) {


Scanner scanner  = new Scanner(System.in);


System.out.println("Por favor digite seu nome");

String nomeCliente = scanner.nextLine();


System.out.println("Por favor digite o nome da Agência");

String agencia = scanner.nextLine();


System.out.println("Por favor digite o número da Conta");

int numero = Integer.parseInt(scanner.nextLine());


System.out.println("Por favor digite o saldo");

double saldo = Double.parseDouble(scanner.nextLine());


String mensagem = "Olá ".concat(nomeCliente)

.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")

.concat(agencia)

.concat(", conta ")

.concat(String.valueOf(numero))

.concat(" e seu saldo ")

.concat(String.valueOf(saldo))

.concat(" já está disponível para saque.");

System.out.println(mensagem);

}

}
