import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e validação da Agência
        String agencia;
        do {
            System.out.print("Por favor, digite o número da Agência (sem hífen): ");
            agencia = scanner.nextLine().replace("-", ""); // Remove hífens se digitados
            if (agencia.isEmpty()) {
                System.out.println("Erro: A agência não pode estar vazia!");
            }
        } while (agencia.isEmpty());

        // Solicitação e validação do Número da Conta
        int numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            try {
                System.out.print("Por favor, digite o número da Conta (sem hífen): ");
                String numeroStr = scanner.nextLine().replace("-", ""); // Remove hífens
                numero = Integer.parseInt(numeroStr);
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números para a conta!");
            }
        }

        // Solicitação do Nome do Cliente
        String nomeCliente;
        do {
            System.out.print("Por favor, digite o Nome do Cliente: ");
            nomeCliente = scanner.nextLine();
            if (nomeCliente.isEmpty()) {
                System.out.println("Erro: O nome não pode estar vazio!");
            }
        } while (nomeCliente.isEmpty());

        // Solicitação do Saldo
        double saldo = 0;
        boolean saldoValido = false;
        while (!saldoValido) {
            try {
                System.out.print("Por favor, digite o Saldo: ");
                saldo = Double.parseDouble(scanner.nextLine());
                saldoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um valor numérico válido para o saldo!");
            }
        }

        // Mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                         "sua agência é " + agencia + ", conta " + numero + 
                         " e seu saldo " + String.format("%.2f", saldo) + 
                         " já está disponível para saque.";

        System.out.println(mensagem);
        scanner.close();
    }
}

