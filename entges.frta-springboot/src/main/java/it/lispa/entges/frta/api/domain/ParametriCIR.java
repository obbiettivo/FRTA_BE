package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * table TGA7AT_FRTA_PARAMETRI_CIR
 *
 * IDPARAM	NUMBER
 * IMPORTO	NUMBER
 * GIORNI	NUMBER
 * DATAINIZIO	DATE
 * DATAFINE	DATE
 * IDUTENTECREAZIONE	NUMBER
 * DATACREAZIONE	DATE
 * IDUTENTEMODIFICA	NUMBER
 * DATAMODIFICA	DATE
 * IDUTENTEELIMINAZIONE	NUMBER
 * DATAELIMINAZIONE	DATE
 * FLAGSTATO	NUMBER(1,0)
 * **/
@Entity
@Table(name = "TGA7AT_FRTA_PARAMETRI_CIR")
public class ParametriCIR {

	@Id
	@Column(name = "IDPARAM")
	private Long idParam;

	@Column(name = "IMPORTO")
	private Double importo;

	@Column(name = "GIORNI")
	private Integer giorni;

	@Column(name = "DATAINIZIO")
	private Date dataInizio;

	@Column(name = "DATAFINE")
	private Date dataFine;

	@Column(name = "IDUTENTECREAZIONE")
	private Long idUtenteCreazione;

	@Column(name = "DATACREAZIONE")
	private Date dataCreazione;

	@Column(name = "IDUTENTEMODIFICA")
	private Long idUtenteModifica;

	@Column(name = "DATAMODIFICA")
	private Date dataModifica;

	@Column(name = "IDUTENTEELIMINAZIONE")
	private Long idUtenteEliminazione;

	@Column(name = "DATAELIMINAZIONE")
	private Date dataEliminazione;

	@Column(name = "FLAGSTATO")
	private Long flagStato;

	public Long getIdParam() {
		return idParam;
	}

	public void setIdParam(Long idParam) {
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

	public Long getIdUtenteCreazione() {
		return idUtenteCreazione;
	}

	public void setIdUtenteCreazione(Long idUtenteCreazione) {
		this.idUtenteCreazione = idUtenteCreazione;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Long getIdUtenteModifica() {
		return idUtenteModifica;
	}

	public void setIdUtenteModifica(Long idUtenteModifica) {
		this.idUtenteModifica = idUtenteModifica;
	}

	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	public Long getIdUtenteEliminazione() {
		return idUtenteEliminazione;
	}

	public void setIdUtenteEliminazione(Long idUtenteEliminazione) {
		this.idUtenteEliminazione = idUtenteEliminazione;
	}

	public Date getDataEliminazione() {
		return dataEliminazione;
	}

	public void setDataEliminazione(Date dataEliminazione) {
		this.dataEliminazione = dataEliminazione;
	}

	public Long getFlagStato() {
		return flagStato;
	}

	public void setFlagStato(Long flagStato) {
		this.flagStato = flagStato;
	}

	@Override
	public String toString() {
		return "ParametriCIR{" +
				"idParam=" + idParam +
				", importo=" + importo +
				", giorni=" + giorni +
				", dataInizio=" + dataInizio +
				", dataFine=" + dataFine +
				", idUtenteCreazione=" + idUtenteCreazione +
				", dataCreazione=" + dataCreazione +
				", idUtenteModifica=" + idUtenteModifica +
				", dataModifica=" + dataModifica +
				", idUtenteEliminazione=" + idUtenteEliminazione +
				", dataEliminazione=" + dataEliminazione +
				", flagStato=" + flagStato +
				'}';
	}
}
