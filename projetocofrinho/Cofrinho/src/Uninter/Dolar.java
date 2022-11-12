package Uninter;

public class Dolar extends Moeda {
	
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
		
	}

	@Override
	public void info() {
		System.out.println("Dolares - US$" + valor);
		
	}

	@Override
	public double convert() {
		
		return this.valor * 5.2;
	}
	
	
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
			
			
		}
		//conversao entre variaveis com classes em comuns
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
			
		}
		
		
		
		return true;
		
	}

}
