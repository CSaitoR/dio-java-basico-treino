import java.util.Scanner; // importa a classe Scanner
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        System.out.println("Digite o numero de sua agencia: ");
        String Agencia = scanner.nextLine();
        
        System.out.println("Insira o seu nome: ");
        String NomeCliente = scanner.nextLine();
        
        System.out.println("DIgite o numero da sua conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o saldo desejado para saque: ");
        double Saldo = scanner.nextDouble();



        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de " + Saldo + " já está disponível para saque");
        
        scanner.close();
    }
}

