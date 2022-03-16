package interfejs;

import java.util.LinkedList;

import magacin.Artikal;

public class Magacin implements MagacinInterfejs{
	
	private LinkedList<Artikal> artikli=new LinkedList<>();

	@Override
	public void dodajUMagacin(Artikal artikal) {
		artikli.add(artikal);
	}

	@Override
	public void izbaciIzMagacina(Artikal artikal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artikal pretraziArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
