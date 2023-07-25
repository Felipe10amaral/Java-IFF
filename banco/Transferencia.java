package banco;

import java.math.BigDecimal;

public class Transferencia extends TransacaoBancaria{
	BigDecimal saldo = new BigDecimal("0.0");

	public Transferencia(Conta origem, Conta destino, BigDecimal valor) {
		super(origem, destino, valor);
	}
	
	@Override
	public void executar() {
		getOrigem().debitar(getValor());
		getDestino().creditar(getValor());
	}
	

}
