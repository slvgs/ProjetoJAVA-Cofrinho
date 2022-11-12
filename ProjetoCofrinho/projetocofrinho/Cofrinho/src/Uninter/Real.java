package Uninter;

public class Real extends Moeda {
	
	public Real (double valorInicial) {
		this.valor = valorInicial; 
		
		
	}

	
	public void info() {
		
		System.out.println("Real - R$" + valor);
		
	}

	
	public double convert() {
		return this.valor;
		
		
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
			
			
		}
		//conversao entre variaveis com classes em comuns
		Real objetoDeReal = (Real) objeto;
		
		if (this.valor != objetoDeReal.valor) {
			return false;
			
		}
		
		
		
		return true;
		
	}
	
	
	
	

}
