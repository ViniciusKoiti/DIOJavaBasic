import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Banco {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        String nomeCliente, agencia;
        int numero;
        double saldo;
        System.out.println("Digite o seu nome:");
        nomeCliente = sc.next();
        contaBancaria.setNomeCliente(nomeCliente);
        System.out.println("Digite o sua Agencia:");
        agencia = sc.next();
        contaBancaria.setAgencia(agencia);
        System.out.println("Digite o seu numero:");
        numero = sc.nextInt();
        contaBancaria.setNumero(numero);
        System.out.println("Digite o seu saldo:");
        saldo = sc.nextDouble();
        contaBancaria.setSaldo(saldo);
        System.out.println(contaBancaria.getTextoApresentacao());
    }
}