package it.lispa.entges.frta.api.domain;

import java.util.Date;

public class ParametriCIR {

	private Integer idParam;
	private Double importo;
	private Integer giorni;
	private Date dataInizio;
	private Date dataFine;

	public Integer getIdParam() {
		return idParam;
	}
	public void setIdParam(Integer idParam) {
		this.idParam = idParam;
	}
	public Double getImporto() {
		return importo;
	}
	public void setImporto(Double importo) {
		this.importo = importo;
	}
	public Integer getGiorni() {
		return giorni;
	}
	public void setGiorni(Integer giorni) {
		this.giorni = giorni;
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

}
