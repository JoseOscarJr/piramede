package oob;

public class Piramede {
	
	private double h;
	private double ab;
	private int tipo;
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		this.ab = ab;
	}
	
	public double hipo() {
		double a1 = Math.pow(h,2) + Math.pow(ab, 2);
		a1 = Math.sqrt(a1);
		return a1;
	}
	public double areaTriangulo() {
		double area= (ab * 2) * hipo();
		return area/2;
	}
	public double areaBase () {
		return ((ab *2 )* (ab * 2));
	}
	public double areaTotal () {
		double areaTotal  = (areaTriangulo()*4) + areaBase();
		return areaTotal;
	}
	public double latasTinta() {
		double litros = (areaTotal()/4.76)/18;
		return Math.ceil(litros);
	}
	public double litrosTinta() {
		double litros = (areaTotal()/4.76);
		return litros;
	}
	public double volumeTriangulo() {
		double volume = (areaBase() * h)/3;
		return volume;
	}
	public double preco() {
		double preco =0;
		if(tipo == 1) {
			preco = 127.90 *latasTinta();
		}else if(tipo == 2) {
			preco = 258.98 *latasTinta();
		}else if(tipo == 3) {
			preco = 344.34 *latasTinta();
		}
		return preco;
	}
}
