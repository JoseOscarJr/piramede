package oob;

public class MainProva {

	public static void main(String[] args) {
		Piramede p = new Piramede();
		
		p.setH(23.18);
		p.setAb(3.56);
		p.setTipo(1);
		System.out.println(p.hipo());
		System.out.println(p.areaTriangulo());
		System.out.println(p.areaBase());
		System.out.println(p.areaTotal());
		System.out.println(p.latasTinta());
		System.out.println(p.litrosTinta());
		System.out.println(p.volumeTriangulo());
		System.out.println(p.preco());
		System.out.println(p.getTipo());
	}

}
