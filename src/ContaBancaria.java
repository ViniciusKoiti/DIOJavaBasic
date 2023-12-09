public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTextoApresentacao(){
        return String.format("Olá %s," +
                " obrigado por criar uma conta nosso banco, sua agência é %s, conta %o," +
                " e seu saldo %.2f já está disponível para saque",
                this.nomeCliente,
                this.agencia,
                this.numero,
                this.saldo);
    }
}
