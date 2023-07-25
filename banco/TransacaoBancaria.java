package banco;

import java.math.BigDecimal;

import transacao.Transacao;

public abstract class TransacaoBancaria implements Transacao{
	
	private BigDecimal valor = new BigDecimal("0.0");
	
	private Conta origem;
	private Conta destino;
	
	protected TransacaoBancaria(Conta origem, Conta destino, BigDecimal valor) {
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}
	
	protected TransacaoBancaria(Conta origem, BigDecimal valor) {
		this.origem = origem;
		this.destino = null;
		this.valor = valor;
	}
	
	
	public BigDecimal getValor() {
		return valor;
	}

	public Conta getOrigem() {
		return origem;
	}

	public Conta getDestino() {
		return destino;
	}
	
}
