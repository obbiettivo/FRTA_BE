package it.lispa.entges.frta.api.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/***********
 *
 *IstanzaFlusso estende IstanzaFlussoTable ovvero TGA7AT_FRTA_FLUSSO_ISTANZA
 *
 * ***********/
public class IstanzaFlusso extends IstanzaFlussoTable{

	private Flusso flusso;
	private Istanza istanza;
	//	private Integer annoPratica;


	public Flusso getFlusso() {
		return flusso;
	}

	public void setFlusso(Flusso flusso) {
		this.flusso = flusso;
	}

	public Istanza getIstanza() {
		return istanza;
	}

	public void setIstanza(Istanza istanza) {
		this.istanza = istanza;
	}

	@Override
	public String toString() {
		return "IstanzaFlusso{" +
				"flusso=" + flusso +
				", istanza=" + istanza +
				'}';
	}
}