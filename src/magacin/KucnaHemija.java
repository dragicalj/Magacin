package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal {
	
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja == null) {
			throw new IllegalArgumentException("Morate uneti rok trajanja!");
		}
		this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		return "Kucna hemija [naziv=" + naziv + "]";
	}

}
