package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 *
 * Istanza extends IstanzaTable TGA7AT_FRTA_ISTANZA
 *
 */
public class Istanza extends IstanzaTable{


	private Stato stato;
	private List<StoricoIstanza> listaStorico;
	private String sepaRsnCd;
	private Integer numeroIstanze;

	/*campi aggiunti per il rappresentante legale*/
	private String cfRapprLeg;
	private String cognRapprLeg;
	private String nomRapprLeg;
	private String sessRapprLeg;
	private Date dataNascitaRapprLeg;
	private String luogoNascitaRapprLeg;
	private String indirizzoRapprLeg;
	private String telefonoFaxRapprLeg;
	private String emailRapprLeg;
	private String capRapprLeg;
	private String siglaProvinciaRapprLeg;
	private String denomComuneRapprLeg;

	/*Campi aggiunti per gestione istanze SISB*/
	private Date dtConsumiDal;
	private Date dtConsumiAl;
	private Integer idBenzinaio;

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public List<StoricoIstanza> getListaStorico() {
		return listaStorico;
	}

	public void setListaStorico(List<StoricoIstanza> listaStorico) {
		this.listaStorico = listaStorico;
	}

	public String getSepaRsnCd() {
		return sepaRsnCd;
	}

	public void setSepaRsnCd(String sepaRsnCd) {
		this.sepaRsnCd = sepaRsnCd;
	}

	public Integer getNumeroIstanze() {
		return numeroIstanze;
	}

	public void setNumeroIstanze(Integer numeroIstanze) {
		this.numeroIstanze = numeroIstanze;
	}

	public String getCfRapprLeg() {
		return cfRapprLeg;
	}

	public void setCfRapprLeg(String cfRapprLeg) {
		this.cfRapprLeg = cfRapprLeg;
	}

	public String getCognRapprLeg() {
		return cognRapprLeg;
	}

	public void setCognRapprLeg(String cognRapprLeg) {
		this.cognRapprLeg = cognRapprLeg;
	}

	public String getNomRapprLeg() {
		return nomRapprLeg;
	}

	public void setNomRapprLeg(String nomRapprLeg) {
		this.nomRapprLeg = nomRapprLeg;
	}

	public String getSessRapprLeg() {
		return sessRapprLeg;
	}

	public void setSessRapprLeg(String sessRapprLeg) {
		this.sessRapprLeg = sessRapprLeg;
	}

	public Date getDataNascitaRapprLeg() {
		return dataNascitaRapprLeg;
	}

	public void setDataNascitaRapprLeg(Date dataNascitaRapprLeg) {
		this.dataNascitaRapprLeg = dataNascitaRapprLeg;
	}

	public String getLuogoNascitaRapprLeg() {
		return luogoNascitaRapprLeg;
	}

	public void setLuogoNascitaRapprLeg(String luogoNascitaRapprLeg) {
		this.luogoNascitaRapprLeg = luogoNascitaRapprLeg;
	}

	public String getIndirizzoRapprLeg() {
		return indirizzoRapprLeg;
	}

	public void setIndirizzoRapprLeg(String indirizzoRapprLeg) {
		this.indirizzoRapprLeg = indirizzoRapprLeg;
	}

	public String getTelefonoFaxRapprLeg() {
		return telefonoFaxRapprLeg;
	}

	public void setTelefonoFaxRapprLeg(String telefonoFaxRapprLeg) {
		this.telefonoFaxRapprLeg = telefonoFaxRapprLeg;
	}

	public String getEmailRapprLeg() {
		return emailRapprLeg;
	}

	public void setEmailRapprLeg(String emailRapprLeg) {
		this.emailRapprLeg = emailRapprLeg;
	}

	public String getCapRapprLeg() {
		return capRapprLeg;
	}

	public void setCapRapprLeg(String capRapprLeg) {
		this.capRapprLeg = capRapprLeg;
	}

	public String getSiglaProvinciaRapprLeg() {
		return siglaProvinciaRapprLeg;
	}

	public void setSiglaProvinciaRapprLeg(String siglaProvinciaRapprLeg) {
		this.siglaProvinciaRapprLeg = siglaProvinciaRapprLeg;
	}

	public String getDenomComuneRapprLeg() {
		return denomComuneRapprLeg;
	}

	public void setDenomComuneRapprLeg(String denomComuneRapprLeg) {
		this.denomComuneRapprLeg = denomComuneRapprLeg;
	}

	public Date getDtConsumiDal() {
		return dtConsumiDal;
	}

	public void setDtConsumiDal(Date dtConsumiDal) {
		this.dtConsumiDal = dtConsumiDal;
	}

	public Date getDtConsumiAl() {
		return dtConsumiAl;
	}

	public void setDtConsumiAl(Date dtConsumiAl) {
		this.dtConsumiAl = dtConsumiAl;
	}

	public Integer getIdBenzinaio() {
		return idBenzinaio;
	}

	public void setIdBenzinaio(Integer idBenzinaio) {
		this.idBenzinaio = idBenzinaio;
	}

	@Override
	public String toString() {
		return "Istanza{" +
				"stato=" + stato +
				", listaStorico=" + listaStorico +
				", sepaRsnCd='" + sepaRsnCd + '\'' +
				", numeroIstanze=" + numeroIstanze +
				", cfRapprLeg='" + cfRapprLeg + '\'' +
				", cognRapprLeg='" + cognRapprLeg + '\'' +
				", nomRapprLeg='" + nomRapprLeg + '\'' +
				", sessRapprLeg='" + sessRapprLeg + '\'' +
				", dataNascitaRapprLeg=" + dataNascitaRapprLeg +
				", luogoNascitaRapprLeg='" + luogoNascitaRapprLeg + '\'' +
				", indirizzoRapprLeg='" + indirizzoRapprLeg + '\'' +
				", telefonoFaxRapprLeg='" + telefonoFaxRapprLeg + '\'' +
				", emailRapprLeg='" + emailRapprLeg + '\'' +
				", capRapprLeg='" + capRapprLeg + '\'' +
				", siglaProvinciaRapprLeg='" + siglaProvinciaRapprLeg + '\'' +
				", denomComuneRapprLeg='" + denomComuneRapprLeg + '\'' +
				", dtConsumiDal=" + dtConsumiDal +
				", dtConsumiAl=" + dtConsumiAl +
				", idBenzinaio=" + idBenzinaio +
				'}';
	}
}