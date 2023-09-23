package org.example;
import org.example.enums.EstadoCivil;
import org.example.enums.TipoDocumento;
import org.example.enums.TipoPessoa;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class ContaCorrenteTest {

    @Test
    public void DepositarComValorPositivo() {
        Pessoa pessoa = new Pessoa("João", EstadoCivil.CASADO, TipoPessoa.FISICA, TipoDocumento.CPF);
        ContaCorrente contaCorrente = new ContaCorrente(30.0,pessoa);
        contaCorrente.depositar(10.0);
        assertEquals( contaCorrente.getSaldo(),40);


    }
    @Test
    public void testSacarComSaldoInsuficiente() {
        Pessoa pessoa = new Pessoa("Maria", EstadoCivil.SOLTEIRO, TipoPessoa.FISICA, TipoDocumento.CPF);
        ContaCorrente contaCorrente = new ContaCorrente(20.0, pessoa);
        contaCorrente.sacar(30.0);
        assertEquals(contaCorrente.getSaldo(), "Não é possível sacar este valor!");
    }

    @Test
    public void testPagarComSaldoSuficiente() {
        Pessoa pessoa = new Pessoa("José", EstadoCivil.CASADO, TipoPessoa.FISICA, TipoDocumento.CPF);
        ContaCorrente contaCorrente = new ContaCorrente(100.0, pessoa);
        contaCorrente.pagar(50.0);
        assertEquals(contaCorrente.getSaldo(), "Não é possível pagar este valor!");
    }



    @Test
    public void testFinanciarComValoresInvalidos() {
        Pessoa pessoa = new Pessoa("Mariana", EstadoCivil.SOLTEIRO, TipoPessoa.FISICA, TipoDocumento.CPF);
        ContaCorrente contaCorrente = new ContaCorrente(100.0, pessoa);
        contaCorrente.financiar(-1000.0, -12, -0.1); // Valores inválidos
        assertEquals(contaCorrente.getSaldo(), "Financiamento inválida.");
    }

    @Test
    public void testEfetuarAplicacaoComValorPositivo() {
        Pessoa pessoa = new Pessoa("Pedro", EstadoCivil.CASADO, TipoPessoa.FISICA, TipoDocumento.CPF);
        ContaCorrente contaCorrente = new ContaCorrente(1000.0, pessoa);
        contaCorrente.EfetuarAplicacao(500.0);
        assertEquals(contaCorrente.getSaldo(), 1500.0);
    }

    @Test
    public void testEfetuarAplicacaoComValorNegativo() {
        Pessoa pessoa = new Pessoa("Camila", EstadoCivil.SOLTEIRO, TipoPessoa.FISICA, TipoDocumento.CPF);
        ContaCorrente contaCorrente = new ContaCorrente(1000.0, pessoa);
        contaCorrente.EfetuarAplicacao(-500.0); // Valor negativo
        assertEquals(contaCorrente.getSaldo(), "Você precisa inserir um valor maior!");
    }
}


