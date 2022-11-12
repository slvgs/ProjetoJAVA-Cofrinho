package Uninter;

public class Euro extends Moeda{
	
	public Euro(double valorInicial) {
		this.valor = valorInicial; 
		
	}

	@Override
	public void info() {
		System.out.println("Euros €" + valor );
		
	}

	@Override
	public double convert() {
		
		return valor * 5.5;
	}

	
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
			
			
		}
		//conversao entre variaveis com classes em comuns
		Euro objetoDeEuro = (Euro) objeto;
		
		if (this.valor != objetoDeEuro.valor) {
			return false;
			
		}
		
		
		
		return true;
		
	}
	
}
