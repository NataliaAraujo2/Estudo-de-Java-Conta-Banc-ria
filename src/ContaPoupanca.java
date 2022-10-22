public class ContaPoupanca implements Conta {
    private int numeroContaPoupanca;
    private String nomeClientePoupanca;
    private Double saldoPoupanca;

    public ContaPoupanca() {
        this.numeroContaPoupanca = numeroContaPoupanca;
        this.nomeClientePoupanca = nomeClientePoupanca;
        this.saldoPoupanca = saldoPoupanca;
    }

    public void setNumeroContaPoupanca(int numeroContaPoupanca) {
        this.numeroContaPoupanca = numeroContaPoupanca;
    }


    public void setNomeClientePoupanca(String nomeClientePoupanca) {
        this.nomeClientePoupanca = nomeClientePoupanca;
    }

    public Double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(Double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public void sacar(Double valor) {
        if (valor < 0) {
            System.out.println("Não é possível efetuar o saque. Valor indevido!");
        } else {
            if (this.saldoPoupanca >= valor) {
                this.saldoPoupanca = saldoPoupanca - valor;
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
            this.saldoPoupanca += valor;
            {
                System.out.println("Depósito efetuado com sucesso!");
            }
        }
    }
}