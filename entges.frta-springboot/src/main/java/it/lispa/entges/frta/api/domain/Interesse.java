package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/***
 * table: TGA7_TRI_INTERESSI
 *
 * IDINTERESSI	NUMBER
 * TASSO	NUMBER
 * DATAINIZIO	DATE
 * DATAFINE	DATE
 * IDUTENTECREAZIONE	NUMBER
 * DATACREAZIONE	DATE
 * IDUTENTEMODIFICA	NUMBER
 * DATAMODIFICA	DATE
 * IDUTENTEELIMINAZIONE	NUMBER
 * DATAELIMINAZIONE	DATE
 * FLAGSTATO	NUMBER(1,0)
 * ***/
@Entity
@Table(name = "TGA7_TRI_INTERESSI")
public class Interesse {

	@Id
	@Column(name = "IDINTERESSI")
	private Long idInteressi;

	@Column(name = "TASSO")
	private Double tasso;

	@Column(name = "DATAINIZIO")
	private Date dataInizio;

	@Column(name = "DATAFINE")
	private Date dataFine;

	@Column(name = "IDUTENTECREAZIONE")
	private Integer idUtenteCreazione;

	@Column(name = "DATACREAZIONE")
	private Date dataCreazione;

	@Column(name = "IDUTENTEMODIFICA")
	private Integer idUtenteModifica;

	@Column(name = "DATAMODIFICA")
	private Date dataModifica;

	@Column(name = "IDUTENTEELIMINAZIONE")
	private Integer idUtenteEliminazione;

	@Column(name = "DATAELIMINAZIONE")
	private Date dataEliminazione;

	@Column(name = "FLAGSTATO")
	private Integer flagStato;

	public Long getIdInteressi() {
		return idInteressi;
	}

	public void setIdInteressi(Long idInteressi) {
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

	@Override
	public String toString() {
		return "Interesse{" +
				"idInteressi=" + idInteressi +
				", tasso=" + tasso +
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