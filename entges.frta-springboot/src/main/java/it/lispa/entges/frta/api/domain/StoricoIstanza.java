package it.lispa.entges.frta.api.domain;

/**
 * classe StoricoIstanza estende StoricoIstanzaTable (TGA7AT_FRTA_STORICO_ISTANZA)
 */

public class StoricoIstanza extends StoricoIstanzaTable{

	private Istanza istanza;
	private Stato stato;

	public Istanza getIstanza() {
		return istanza;
	}

	public void setIstanza(Istanza istanza) {
		this.istanza = istanza;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "StoricoIstanza{" +
				"istanza=" + istanza +
				", stato=" + stato +
				'}';
	}
}