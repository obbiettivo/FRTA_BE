package it.lispa.entges.frta.api.domain;

import java.util.Date;

public class Interesse {
	private Integer idInteressi;
	private Double tasso;
	private Date dataInizio;
	private Date dataFine;
	private Integer idUtenteCreazione;
	private Date dataCreazione;
	private Integer idUtenteModifica;
	private Date dataModifica;
	private Integer idUtenteEliminazione;
	private Date dataEliminazione;
	private Integer flagStato;

	public Interesse() {
	}

	public Integer getIdInteressi() {
		return idInteressi;
	}

	public void setIdInteressi(Integer idInteressi) {
		this.idInteressi = idInteressi;
	}

	public Double getTasso() {
		return tasso;
	}

	public void setTasso(Double tasso) {
		this.tasso = tasso;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Integer getIdUtenteCreazione() {
		return idUtenteCreazione;
	}

	public void setIdUtenteCreazione(Integer idUtenteCreazione) {
		this.idUtenteCreazione = idUtenteCreazione;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Integer getIdUtenteModifica() {
		return idUtenteModifica;
	}

	public void setIdUtenteModifica(Integer idUtenteModifica) {
		this.idUtenteModifica = idUtenteModifica;
	}

	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	public Integer getIdUtenteEliminazione() {
		return idUtenteEliminazione;
	}

	public void setIdUtenteEliminazione(Integer idUtenteEliminazione) {
		this.idUtenteEliminazione = idUtenteEliminazione;
	}

	public Date getDataEliminazione() {
		return dataEliminazione;
	}

	public void setDataEliminazione(Date dataEliminazione) {
		this.dataEliminazione = dataEliminazione;
	}

	public Integer getFlagStato() {
		return flagStato;
	}

	public void setFlagStato(Integer flagStato) {
		this.flagStato = flagStato;
	}
}