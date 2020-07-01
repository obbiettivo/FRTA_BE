package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 
 * classe Flusso
 * 
 *TGA7AT_FRTA_FLUSSO
 *
 * ID_FLUSSO	NUMBER
 * TIPO	VARCHAR2(3 BYTE)
 * STATO_FLUSSO	VARCHAR2(50 BYTE)
 * TS_CREAZIONE	DATE
 * TS_FINE_GENERAZIONE	DATE
 * NR_ELABORATE	NUMBER
 * NR_FALLITE	NUMBER
 * ID_MSG_SEPA	VARCHAR2(30 BYTE)
 * DATI_FLUSSO	BLOB
 * TS_INVIO	DATE
 * NOME_FILE_INVIATO	VARCHAR2(200 BYTE)
 * ESITO_INVIO	VARCHAR2(200 BYTE)
 * CD_ERRORE_INVIO	VARCHAR2(200 BYTE)
 * DS_ERRORE_INVIO	VARCHAR2(200 BYTE)
 * TIPO_RIMBORSO	VARCHAR2(3 BYTE)
 * ID_FLUSSO_ZEROBOLLO	NUMBER
 */
@Entity
@Table(name = "TGA7AT_FRTA_FLUSSO")
public class FlussoTable {

	@Id
	@Column(name = "ID_FLUSSO")
	private Long idFlusso;

	@Column(name = "TIPO")
	private String tipo;

	@Column(name = "STATO_FLUSSO")
	private String statoFlusso;

	@Column(name = "TS_CREAZIONE")
	private Date dtGenerazioneFlusso;

	@Column(name = "TS_FINE_GENERAZIONE")
	private Date dtFineGenerazioneFlusso;

	@Column(name = "NR_ELABORATE")
	private Integer numIstanzeElaborate;

	@Column(name = "NR_FALLITE")
	private Integer numIstanzeFallite;

	@Column(name = "ID_MSG_SEPA")
	private String msgSepa;

	@Column(name = "DATI_FLUSSO")
	private byte[] xmlFlusso;

	@Column(name = "TS_INVIO")
	private Date dataInvio;

	@Column(name = "NOME_FILE_INVIATO")
	private String fileName;

	@Column(name = "ESITO_INVIO")
	private String esitoInvio;

	@Column(name = "CD_ERRORE_INVIO")
	private String codErrore;

	@Column(name = "DS_ERRORE_INVIO")
	private String desErrore;

	@Column(name = "TIPO_RIMBORSO")
	private String tipoRimborso;

	@Column(name = "ID_FLUSSO_ZEROBOLLO")
	private String idFlussoZeroBollo;

	public Long getIdFlusso() {
		return idFlusso;
	}

	public void setIdFlusso(Long idFlusso) {
		this.idFlusso = idFlusso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatoFlusso() {
		return statoFlusso;
	}

	public void setStatoFlusso(String statoFlusso) {
		this.statoFlusso = statoFlusso;
	}

	public Date getDtGenerazioneFlusso() {
		return dtGenerazioneFlusso;
	}

	public void setDtGenerazioneFlusso(Date dtGenerazioneFlusso) {
		this.dtGenerazioneFlusso = dtGenerazioneFlusso;
	}

	public Date getDtFineGenerazioneFlusso() {
		return dtFineGenerazioneFlusso;
	}

	public void setDtFineGenerazioneFlusso(Date dtFineGenerazioneFlusso) {
		this.dtFineGenerazioneFlusso = dtFineGenerazioneFlusso;
	}

	public Integer getNumIstanzeElaborate() {
		return numIstanzeElaborate;
	}

	public void setNumIstanzeElaborate(Integer numIstanzeElaborate) {
		this.numIstanzeElaborate = numIstanzeElaborate;
	}

	public Integer getNumIstanzeFallite() {
		return numIstanzeFallite;
	}

	public void setNumIstanzeFallite(Integer numIstanzeFallite) {
		this.numIstanzeFallite = numIstanzeFallite;
	}

	public String getMsgSepa() {
		return msgSepa;
	}

	public void setMsgSepa(String msgSepa) {
		this.msgSepa = msgSepa;
	}

	public byte[] getXmlFlusso() {
		return xmlFlusso;
	}

	public void setXmlFlusso(byte[] xmlFlusso) {
		this.xmlFlusso = xmlFlusso;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getEsitoInvio() {
		return esitoInvio;
	}

	public void setEsitoInvio(String esitoInvio) {
		this.esitoInvio = esitoInvio;
	}

	public String getCodErrore() {
		return codErrore;
	}

	public void setCodErrore(String codErrore) {
		this.codErrore = codErrore;
	}

	public String getDesErrore() {
		return desErrore;
	}

	public void setDesErrore(String desErrore) {
		this.desErrore = desErrore;
	}

	public String getTipoRimborso() {
		return tipoRimborso;
	}

	public void setTipoRimborso(String tipoRimborso) {
		this.tipoRimborso = tipoRimborso;
	}

	public String getIdFlussoZeroBollo() {
		return idFlussoZeroBollo;
	}

	public void setIdFlussoZeroBollo(String idFlussoZeroBollo) {
		this.idFlussoZeroBollo = idFlussoZeroBollo;
	}

	@Override
	public String toString() {
		return "FlussoTable{" +
				"idFlusso=" + idFlusso +
				", tipo='" + tipo + '\'' +
				", statoFlusso='" + statoFlusso + '\'' +
				", dtGenerazioneFlusso=" + dtGenerazioneFlusso +
				", dtFineGenerazioneFlusso=" + dtFineGenerazioneFlusso +
				", numIstanzeElaborate=" + numIstanzeElaborate +
				", numIstanzeFallite=" + numIstanzeFallite +
				", msgSepa='" + msgSepa + '\'' +
				", xmlFlusso=" + Arrays.toString(xmlFlusso) +
				", dataInvio=" + dataInvio +
				", fileName='" + fileName + '\'' +
				", esitoInvio='" + esitoInvio + '\'' +
				", codErrore='" + codErrore + '\'' +
				", desErrore='" + desErrore + '\'' +
				", tipoRimborso='" + tipoRimborso + '\'' +
				", idFlussoZeroBollo='" + idFlussoZeroBollo + '\'' +
				'}';
	}
}
