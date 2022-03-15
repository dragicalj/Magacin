package interfejs;

import magacin.Artikal;

public interface MagacinInterfejs {
	public void dodajUMagacin(Artikal artikal);
	public void izbaciIzMagacina(Artikal artikal);
	public Artikal pretraziArtikal(int sifra);
}
