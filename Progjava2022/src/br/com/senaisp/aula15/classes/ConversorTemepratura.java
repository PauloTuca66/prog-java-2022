package br.com.senaisp.aula15.classes;

public class ConversorTemepratura {
	private int tipotempOri;
	private int tipotempDes;
	private double temperatura;
	public ConversorTemepratura() {
		// TODO Auto-generated constructor stub
		this.tipotempOri = 1; // Tipo temperatura Origem
		this.tipotempDes = 1; // Tipo temperatura Destino
		this.temperatura = 0; // Valor temperatura
	}
	public int getTipotempOri() {
		return tipotempOri;
	}
	public void setTipotempOri(int tipotempOri) {
		
		
		this.tipotempOri = tipotempOri;
	}
	public int getTipotempDes() {
		return tipotempDes;
	}
	public void setTipotempDes(int tipotempDes) {
		
		
		this.tipotempDes = tipotempDes;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temepratura) {
		
		
		this.temperatura = temepratura;
	}
	
	
	
}
