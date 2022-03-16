package interfejs;

import java.util.LinkedList;

import magacin.Artikal;

public class Magacin implements MagacinInterfejs{
	
	private LinkedList<Artikal> artikli=new LinkedList<>();

	@Override
	public void dodajUMagacin(Artikal artikal) {
		if(artikal==null) {
			throw new NullPointerException("Artikal ne sme biti null!");
		}
		for (Artikal artikalIzMagacina : artikli) {
			if(artikalIzMagacina.equals(artikal)) {
				artikalIzMagacina.setKolicina(artikalIzMagacina.getKolicina()+artikal.getKolicina());
				return;
			}
		}
		artikli.add(artikal);
		
	}

	@Override
	public void izbaciIzMagacina(Artikal artikal) {
		if(artikal==null) {
			throw new NullPointerException("Artikal ne sme biti null!");
		}
		for (Artikal artikalIzMagacina : artikli) {
			if(artikalIzMagacina.equals(artikal)) {
				if(artikalIzMagacina.getKolicina()<artikal.getKolicina()) {
					throw new RuntimeException("Nema dovoljno trazenog artikla na zalihama");
				}
				artikalIzMagacina.setKolicina(artikalIzMagacina.getKolicina()-artikal.getKolicina());
			}
		}
		throw new RuntimeException("Ne postoji ovaj artikal");
	}

	@Override
	public Artikal pretraziArtikal(int sifra) {
		if(sifra<=0) {
			throw new RuntimeException("Sifra mora biti veca od 0!");
		}
		for (Artikal pronadjeniArtikal : artikli) {
			if(pronadjeniArtikal.getSifra()==sifra) {
				return pronadjeniArtikal;
			}
		}
		return null;
	}

}
