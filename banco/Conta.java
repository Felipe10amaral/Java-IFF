package banco;

import java.math.BigDecimal;

public class Conta {
	private BigDecimal saldo = new BigDecimal("0.0");
	
	public Conta() {
		
	}

	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void debitar(BigDecimal valor) {
		this.saldo = saldo.subtract(valor);
	}
	
	public void creditar(BigDecimal valor) {
		this.saldo = saldo.add(valor);
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
	

}
