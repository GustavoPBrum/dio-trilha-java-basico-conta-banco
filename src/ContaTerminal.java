import java.util.Scanner;
import java.util.Locale;
import static java.util.Locale.US;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(US);

        System.out.print(("Informe seu nome completo: "));
        String nomeCompleto = scanner.nextLine();

        System.out.print(("Informe sua agência: "));
        String agencia = scanner.nextLine();

        System.out.print(("Informe o número da sua conta: "));
        int numeroConta = scanner.nextInt();

        System.out.print(("Informe seu saldo: "));
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCompleto + " obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " +
                saldo + " já está disponível para saque\".");
    }
}