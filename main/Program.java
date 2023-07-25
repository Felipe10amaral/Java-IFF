package main;

import java.math.BigDecimal;

import banco.Conta;
import banco.Deposito;
import banco.TransacaoBancaria;
import banco.Transferencia;
import transacao.GerenteTransacao;

public class Program {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		GerenteTransacao gerenteTransacao = new GerenteTransacao();
		
		BigDecimal deposito1 = new BigDecimal("100");
		BigDecimal deposito2 = new BigDecimal("80");
		BigDecimal transferencia1 = new BigDecimal("30");
		BigDecimal transferencia2 = new BigDecimal("20");
		
		// operacao da conta 1
		conta1.creditar(deposito1);
		conta1.creditar(deposito2);
		
		// operacao da conta 2
		conta1.debitar(transferencia1);
		conta2.creditar(transferencia1);
		
		conta1.debitar(transferencia2);
		conta2.creditar(transferencia2);
		
		
		TransacaoBancaria transacao1 = new Deposito(conta1, deposito1);
		TransacaoBancaria transacao3 = new Deposito(conta1, deposito2);
		TransacaoBancaria transacao2 = new Transferencia(conta1, conta2, transferencia1);
		TransacaoBancaria transacao4 = new Transferencia(conta1, conta2, transferencia2);
		
		
		gerenteTransacao.adicionarTransacao(transacao1);
		gerenteTransacao.adicionarTransacao(transacao2);
		gerenteTransacao.adicionarTransacao(transacao3);
		gerenteTransacao.adicionarTransacao(transacao4);

		
		System.out.println(conta1.toString());
		
		System.out.println(conta2.toString());
		
		gerenteTransacao.executar();
				

	}

}
