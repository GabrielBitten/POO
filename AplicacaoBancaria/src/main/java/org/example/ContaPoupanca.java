package org.example;

public class ContaPoupanca implements TransacoesBancarias {
    public boolean contaConjunta;

    public Pessoa pessoa;
    private double saldo;

    public ContaPoupanca() {
        saldo = 0.0;
    }


    public ContaPoupanca(double saldoInicial) {
        if (saldoInicial >= 50.0) {
            saldo = saldoInicial;
            System.out.println("Conta criada");
        } else {
            System.out.println("Você só podera criar a conta poupaça com no minimo 50 reais");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado .");
        } else {
            System.out.println("Você precisa inserir um valor maior!");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Não é possível sacar este valor!");
        }
    }

    @Override
    public void pagar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento realizado.");
        } else {
            System.out.println("Não é possível pagar este valor!");
        }
    }
    @Override
    public void financiar(double valorTotal, int quantidadeMeses, double taxaJuros){

        if (valorTotal > 0 && quantidadeMeses > 0 && taxaJuros >= 0) {
            double valorParcela = (valorTotal + (valorTotal * taxaJuros)) / quantidadeMeses;
            saldo += valorTotal;
            System.out.println("Financiamento concluido");
            System.out.println("Valor da parcela mensal:" + valorParcela);
        } else {
            System.out.println("Financiamento inválida.");
        }
    }
    @Override
    public void EfetuarAplicação(double valor) {
        if (valor > 0) {
            double taxaDeRendimento = 0.03; // Taxa previamente definida
            double rendimento = valor * taxaDeRendimento;
            saldo += valor + rendimento;
            System.out.println("Aplicação realizada.");
            System.out.println("Rendimento de " + rendimento );
        } else {
            System.out.println("Você precisa inserir um valor maior!");
        }
    }

}
