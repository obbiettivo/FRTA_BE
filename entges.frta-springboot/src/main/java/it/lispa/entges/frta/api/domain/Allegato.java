package it.lispa.entges.frta.api.domain;

/**
 * 
 * classe Allegato estende AllegatoTable (TGA7AT_PDT_ALLEGATO)
 */
public class Allegato extends AllegatoTable{


	private Istanza istanza;

	public Istanza getIstanza() {
		return istanza;
	}

	public void setIstanza(Istanza istanza) {
		this.istanza = istanza;
	}

	@Override
	public String toString() {
		return "Allegato{" +
				"istanza=" + istanza +
				'}';
	}
}