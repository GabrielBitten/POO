package org.example;

public interface TransacoesBancarias {
    void depositar(double valor);
    void sacar(double valor);
    void pagar(double valor);
    void EfetuarAplicacao(double valor);
    void financiar(double valorTotal, int quantidadeMeses, double taxaJuros);
}