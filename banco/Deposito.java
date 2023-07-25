package banco;

import java.math.BigDecimal;

public class Deposito extends TransacaoBancaria{
	
	
	public Deposito(Conta origem, BigDecimal valor) {
		super(origem, valor);
		
	}
	
	@Override
	public void executar() {
		getOrigem().creditar(getValor());
		
	}

}
