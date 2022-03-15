package magacin;

import java.util.Objects;

public class Artikal {
	
	protected int sifra;
	protected String naziv;
	protected String opis;
	protected int kolicina;
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra < 0) {
			throw new IllegalArgumentException("Sifra mora biti veca od 0!");
		}
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.isEmpty()) {
			throw new IllegalArgumentException("Morate uneti naziv artikla!");
		}
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(naziv == null || naziv.isEmpty()) {
			throw new IllegalArgumentException("Morate uneti opis artikla!");
		}
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina < 0) {
			throw new IllegalArgumentException("Kolicina mora biti veca od 0!");
		}
		this.kolicina = kolicina;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(naziv, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return Objects.equals(naziv, other.naziv) && sifra == other.sifra;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + "]";
	}
	
	
	
}
