package it.lispa.entges.frta.api.domain;

import java.util.Date;
import java.util.List;

/**
 * 
 * classe Flusso
 * 
 *
 */
public class Flusso {
	private Integer idFlusso;
	private String tipo;
	private String statoFlusso;
	private Date dtGenerazioneFlusso;
	private Date dtFineGenerazioneFlusso;
	private Integer numIstanzeElaborate;
	private Integer numIstanzeFallite;
	private String msgSepa;
	private byte[] xmlFlusso;
	private Date dataInvio;
	private String fileName;
	private String esitoInvio;
	private String codErrore;
	private String desErrore;
	private Integer elaborateConSuccesso;
	private List<Istanza> istanze; //l'ho lasciata com'era, non so se serve
	private List<IstanzaFlusso> listaIstanzeErrore;
	private Integer numeroIstanze;
	private String tipoRimborso;
//	carica flusso frta
	private String x_err_buff,
	               p_user;
	private Integer x_ret_code;
	

	public List<IstanzaFlusso> getListaIstanzeErrore() {
		return listaIstanzeErrore;
	}

	public void setListaIstanzeErrore(List<IstanzaFlusso> listaIstanzeErrore) {
		this.listaIstanzeErrore = listaIstanzeErrore;
	}

	public Flusso() {
	}

	public Integer getIdFlusso() {
		return idFlusso;
	}

	public void setIdFlusso(Integer idFlusso) {
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

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
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

	public byte[] getXmlFlusso() {
		return xmlFlusso;
	}

	public void setXmlFlusso(byte[] xmlFlusso) {
		this.xmlFlusso = xmlFlusso;
	}

	public Date getDtGenerazioneFlusso() {
		return dtGenerazioneFlusso;
	}

	public void setDtGenerazioneFlusso(Date dtGenerazioneFlusso) {
		this.dtGenerazioneFlusso = dtGenerazioneFlusso;
	}

	/**
	 * @return lista di istanze
	 */
	public List<Istanza> getIstanze() {
		return istanze;
	}

	/**
	 * @param lista di istanze da settare
	 */
	public void setIstanze(List<Istanza> istanze) {
		this.istanze = istanze;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getElaborateConSuccesso() {
		return elaborateConSuccesso;
	}

	public void setElaborateConSuccesso(Integer elaborateConSuccesso) {
		this.elaborateConSuccesso = elaborateConSuccesso;
	}

	public Integer getNumeroIstanze() {
		return numeroIstanze;
	}

	public void setNumeroIstanze(Integer numeroIstanze) {
		this.numeroIstanze = numeroIstanze;
	}

	public String getTipoRimborso() {
		return tipoRimborso;
	}

	public void setTipoRimborso(String tipoRimborso) {
		this.tipoRimborso = tipoRimborso;
	}

	public String getX_err_buf() {
		return x_err_buff;
	}

	public void setX_err_buf(String x_err_buf) {
		this.x_err_buff = x_err_buf;
	}

	public String getP_user() {
		return p_user;
	}

	public void setP_user(String p_user) {
		this.p_user = p_user;
	}

	public Integer getX_ret_code() {
		return x_ret_code;
	}

	public void setX_ret_code(Integer x_ret_code) {
		this.x_ret_code = x_ret_code;
	}

	
}
