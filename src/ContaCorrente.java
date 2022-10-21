public class ContaCorrente implements Conta {

    private int numeroConta;
    private String nomeCliente;
    private Double saldo;
    private Double chequeEspecial;

    public ContaCorrente() {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(Double valor) {
        if (valor <= 0) {
            System.out.println("Não é possível efetuar o saque. Valor indevido!");
        } else {
            if (this.saldo + this.getChequeEspecial() > valor) {
                this.saldo = saldo - valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Não foi possível realizar o saque!");
            }
        }
    }

    @Override
    public void depositar(Double valor) {
        if (valor <= 0) {
            System.out.println("Não é possível depositar. Valor indevido!");
        } else {
            this.saldo += valor;
            {
                System.out.println("Depósito efetuado com sucesso!");
            }
        }
    }
}