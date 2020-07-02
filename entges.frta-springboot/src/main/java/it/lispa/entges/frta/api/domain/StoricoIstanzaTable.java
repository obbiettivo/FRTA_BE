package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * classe StoricoIstanza
 *
 * TGA7AT_FRTA_STORICO_ISTANZA
 *
 * ID_STORICO_ISTANZA	NUMBER
 * ID_ISTANZA	NUMBER
 * NUMERO_PRATICA	VARCHAR2(17 BYTE)
 * ID_STATO	NUMBER
 * DT_CAMBIO_STATO	DATE
 * PGMEN_MOD_RIMB	VARCHAR2(3 BYTE)
 * PGMEN_C_IBAN	VARCHAR2(100 BYTE)
 * PGMEN_INDIRIZZO	VARCHAR2(500 BYTE)
 * PGMEN_TELEFONO	VARCHAR2(20 BYTE)
 * EMAIL	VARCHAR2(200 BYTE)
 * ILEG_PROSPETTO_TASSI	VARCHAR2(2000 BYTE)
 * ILEG_DT_INIZIO	DATE
 * ILEG_CLCOL_DT_FINE	DATE
 * ILEG_IMPORTO	NUMBER(13,2)
 * ILEG_IMPORTO_PAGAMENTO	NUMBER(13,2)
 * ILEG_FL_CONSOLIDATO	CHAR(1 BYTE)
 * PGMEN_CAP	VARCHAR2(5 BYTE)
 * PGMEN_DENOM_COMUNE	VARCHAR2(255 BYTE)
 * PGMEN_SIGLA_PROVINCIA	VARCHAR2(2 BYTE)
 * DT_ESECUZIONE_FLUSSO	DATE
 * ESITO_MSG_ID	VARCHAR2(35 BYTE)
 * ESITO_CRE_DT_TM	DATE
 * ESITO_TX_STS	VARCHAR2(4 BYTE)
 * ESITO_ACCNT_SVCR_REF	VARCHAR2(35 BYTE)
 * ESITO_ORD_VAL_DT	DATE
 * ESITO_BEN_VAL_DT	DATE
 * ESITO_RSN_ORGTR_NM	VARCHAR2(140 BYTE)
 * ESITO_RSN_ORGTR_BIC_BEI	VARCHAR2(100 BYTE)
 * ESITO_RSN_CD	VARCHAR2(4 BYTE)
 * ESITO_RSN_PRTRY	VARCHAR2(35 BYTE)
 * ESITO_RSN_ADDTLINF	VARCHAR2(4000 BYTE)
 * DISP_ONERI_ACCESSORI	NUMBER(13,2)
 * DISP_DATA_SCADENZA	DATE
 * PGMEN_EMAIL	VARCHAR2(500 BYTE)
 * PGMEN_FL_IBAN_ESTERO	CHAR(1 BYTE)
 * PGMEN_BIC	VARCHAR2(11 BYTE)
 */

@Entity
@Table(name = "TGA7AT_FRTA_STORICO_ISTANZA")
public class StoricoIstanzaTable {

	@Id
	@Column(name = "ID_STORICO_ISTANZA")
	private Long idStoricoIstanza;

	//da spostare
	@Column(name = "ID_ISTANZA")
	private Integer idIstanza;

	@Column(name = "ID_STATO")
	private Long idStato;

	@Column(name = "DT_CAMBIO_STATO")
	private Date dtCambioStato;

	@Column(name = "PGMEN_MOD_RIMB")
	private String pgmenModRimb;

	@Column(name = "PGMEN_C_IBAN")
	private String pgmenCIban;

	@Column(name = "PGMEN_INDIRIZZO")
	private String pgmenIndirizzo;

	@Column(name = "PGMEN_TELEFONO")
	private String pgmenTelefono;

	@Column(name = "PGMEN_EMAIL")
	private String pgmenEmail;

	@Column(name = "PGMEN_FL_IBAN_ESTERO")
	private Boolean pgmenIbanEstero;

	@Column(name = "PGMEN_BIC")
	private String pgmenBic;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "ILEG_PROSPETTO_TASSI")
	private String ilegProspettoTassi;

	@Column(name = "ILEG_DT_INIZIO")
	private Date ilegDtInizio;

	@Column(name = "ILEG_CLCOL_DT_FINE")
	private Date ilegClcolDtFine;

	@Column(name = "ILEG_IMPORTO")
	private Double ilegImporto;

	@Column(name = "ILEG_IMPORTO_PAGAMENTO")
	private Double ilegImportoPagamento;

	@Column(name = "ILEG_FL_CONSOLIDATO")
	private boolean ilegFlConsolidato;

	@Column(name = "PGMEN_CAP")
	private String pgmenCap;

	@Column(name = "PGMEN_DENOM_COMUNE")
	private String pgmenDenomComune;

	@Column(name = "PGMEN_SIGLA_PROVINCIA")
	private String pgmenSiglaProvincia;

	@Column(name = "DT_ESECUZIONE_FLUSSO")
	private Date dtEsecuzioneFlusso;


	@Column(name = "ESITO_CRE_DT_TM")
	private Date esitoCreDtTm;

	@Column(name = "ESITO_ORD_VAL_DT")
	private Date esitoOrdValDt;

	@Column(name = "ESITO_BEN_VAL_DT")
	private Date esitoBenValDt;

	@Column(name = "ESITO_MSG_ID")
	private String esitoMsgId;

	@Column(name = "ESITO_TX_STS")
	private String esitoTxSts;

	@Column(name = "ESITO_ACCNT_SVCR_REF")
	private String esitoAccntSvcrRef;

	@Column(name = "ESITO_RSN_ORGTR_NM")
	private String esitoRsnOrgtrNm;

	@Column(name = "ESITO_RSN_ORGTR_BIC_BEI")
	private String esitoRsnOrgtrBicBei;

	@Column(name = "ESITO_RSN_CD")
	private String esitoRsnCd;

	@Column(name = "ESITO_RSN_PRTRY")
	private String esitoRsnPrtry;

	@Column(name = "ESITO_RSN_ADDTLINF")
	private String esitoRsnAddtlinf;

	@Column(name = "DISP_ONERI_ACCESSORI")
	private Double dispoOneriAccessori;

	@Column(name = "DISP_DATA_SCADENZA")
	private Date dispDataScadenza;


	public Long getIdStoricoIstanza() {
		return idStoricoIstanza;
	}

	public void setIdStoricoIstanza(Long idStoricoIstanza) {
		this.idStoricoIstanza = idStoricoIstanza;
	}

	public Integer getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(Integer idIstanza) {
		this.idIstanza = idIstanza;
	}

	public Long getIdStato() {
		return idStato;
	}

	public void setIdStato(Long idStato) {
		this.idStato = idStato;
	}

	public Date getDtCambioStato() {
		return dtCambioStato;
	}

	public void setDtCambioStato(Date dtCambioStato) {
		this.dtCambioStato = dtCambioStato;
	}

	public String getPgmenModRimb() {
		return pgmenModRimb;
	}

	public void setPgmenModRimb(String pgmenModRimb) {
		this.pgmenModRimb = pgmenModRimb;
	}

	public String getPgmenCIban() {
		return pgmenCIban;
	}

	public void setPgmenCIban(String pgmenCIban) {
		this.pgmenCIban = pgmenCIban;
	}

	public String getPgmenIndirizzo() {
		return pgmenIndirizzo;
	}

	public void setPgmenIndirizzo(String pgmenIndirizzo) {
		this.pgmenIndirizzo = pgmenIndirizzo;
	}

	public String getPgmenTelefono() {
		return pgmenTelefono;
	}

	public void setPgmenTelefono(String pgmenTelefono) {
		this.pgmenTelefono = pgmenTelefono;
	}

	public String getPgmenEmail() {
		return pgmenEmail;
	}

	public void setPgmenEmail(String pgmenEmail) {
		this.pgmenEmail = pgmenEmail;
	}

	public Boolean getPgmenIbanEstero() {
		return pgmenIbanEstero;
	}

	public void setPgmenIbanEstero(Boolean pgmenIbanEstero) {
		this.pgmenIbanEstero = pgmenIbanEstero;
	}

	public String getPgmenBic() {
		return pgmenBic;
	}

	public void setPgmenBic(String pgmenBic) {
		this.pgmenBic = pgmenBic;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIlegProspettoTassi() {
		return ilegProspettoTassi;
	}

	public void setIlegProspettoTassi(String ilegProspettoTassi) {
		this.ilegProspettoTassi = ilegProspettoTassi;
	}

	public Date getIlegDtInizio() {
		return ilegDtInizio;
	}

	public void setIlegDtInizio(Date ilegDtInizio) {
		this.ilegDtInizio = ilegDtInizio;
	}

	public Date getIlegClcolDtFine() {
		return ilegClcolDtFine;
	}

	public void setIlegClcolDtFine(Date ilegClcolDtFine) {
		this.ilegClcolDtFine = ilegClcolDtFine;
	}

	public Double getIlegImporto() {
		return ilegImporto;
	}

	public void setIlegImporto(Double ilegImporto) {
		this.ilegImporto = ilegImporto;
	}

	public Double getIlegImportoPagamento() {
		return ilegImportoPagamento;
	}

	public void setIlegImportoPagamento(Double ilegImportoPagamento) {
		this.ilegImportoPagamento = ilegImportoPagamento;
	}

	public boolean isIlegFlConsolidato() {
		return ilegFlConsolidato;
	}

	public void setIlegFlConsolidato(boolean ilegFlConsolidato) {
		this.ilegFlConsolidato = ilegFlConsolidato;
	}

	public String getPgmenCap() {
		return pgmenCap;
	}

	public void setPgmenCap(String pgmenCap) {
		this.pgmenCap = pgmenCap;
	}

	public String getPgmenDenomComune() {
		return pgmenDenomComune;
	}

	public void setPgmenDenomComune(String pgmenDenomComune) {
		this.pgmenDenomComune = pgmenDenomComune;
	}

	public String getPgmenSiglaProvincia() {
		return pgmenSiglaProvincia;
	}

	public void setPgmenSiglaProvincia(String pgmenSiglaProvincia) {
		this.pgmenSiglaProvincia = pgmenSiglaProvincia;
	}

	public Date getDtEsecuzioneFlusso() {
		return dtEsecuzioneFlusso;
	}

	public void setDtEsecuzioneFlusso(Date dtEsecuzioneFlusso) {
		this.dtEsecuzioneFlusso = dtEsecuzioneFlusso;
	}

	public Date getEsitoCreDtTm() {
		return esitoCreDtTm;
	}

	public void setEsitoCreDtTm(Date esitoCreDtTm) {
		this.esitoCreDtTm = esitoCreDtTm;
	}

	public Date getEsitoOrdValDt() {
		return esitoOrdValDt;
	}

	public void setEsitoOrdValDt(Date esitoOrdValDt) {
		this.esitoOrdValDt = esitoOrdValDt;
	}

	public Date getEsitoBenValDt() {
		return esitoBenValDt;
	}

	public void setEsitoBenValDt(Date esitoBenValDt) {
		this.esitoBenValDt = esitoBenValDt;
	}

	public String getEsitoMsgId() {
		return esitoMsgId;
	}

	public void setEsitoMsgId(String esitoMsgId) {
		this.esitoMsgId = esitoMsgId;
	}

	public String getEsitoTxSts() {
		return esitoTxSts;
	}

	public void setEsitoTxSts(String esitoTxSts) {
		this.esitoTxSts = esitoTxSts;
	}

	public String getEsitoAccntSvcrRef() {
		return esitoAccntSvcrRef;
	}

	public void setEsitoAccntSvcrRef(String esitoAccntSvcrRef) {
		this.esitoAccntSvcrRef = esitoAccntSvcrRef;
	}

	public String getEsitoRsnOrgtrNm() {
		return esitoRsnOrgtrNm;
	}

	public void setEsitoRsnOrgtrNm(String esitoRsnOrgtrNm) {
		this.esitoRsnOrgtrNm = esitoRsnOrgtrNm;
	}

	public String getEsitoRsnOrgtrBicBei() {
		return esitoRsnOrgtrBicBei;
	}

	public void setEsitoRsnOrgtrBicBei(String esitoRsnOrgtrBicBei) {
		this.esitoRsnOrgtrBicBei = esitoRsnOrgtrBicBei;
	}

	public String getEsitoRsnCd() {
		return esitoRsnCd;
	}

	public void setEsitoRsnCd(String esitoRsnCd) {
		this.esitoRsnCd = esitoRsnCd;
	}

	public String getEsitoRsnPrtry() {
		return esitoRsnPrtry;
	}

	public void setEsitoRsnPrtry(String esitoRsnPrtry) {
		this.esitoRsnPrtry = esitoRsnPrtry;
	}

	public String getEsitoRsnAddtlinf() {
		return esitoRsnAddtlinf;
	}

	public void setEsitoRsnAddtlinf(String esitoRsnAddtlinf) {
		this.esitoRsnAddtlinf = esitoRsnAddtlinf;
	}

	public Double getDispoOneriAccessori() {
		return dispoOneriAccessori;
	}

	public void setDispoOneriAccessori(Double dispoOneriAccessori) {
		this.dispoOneriAccessori = dispoOneriAccessori;
	}

	public Date getDispDataScadenza() {
		return dispDataScadenza;
	}

	public void setDispDataScadenza(Date dispDataScadenza) {
		this.dispDataScadenza = dispDataScadenza;
	}

	@Override
	public String toString() {
		return "StoricoIstanzaTable{" +
				"idStoricoIstanza=" + idStoricoIstanza +
				", idIstanza=" + idIstanza +
				", idStato=" + idStato +
				", dtCambioStato=" + dtCambioStato +
				", pgmenModRimb='" + pgmenModRimb + '\'' +
				", pgmenCIban='" + pgmenCIban + '\'' +
				", pgmenIndirizzo='" + pgmenIndirizzo + '\'' +
				", pgmenTelefono='" + pgmenTelefono + '\'' +
				", pgmenEmail='" + pgmenEmail + '\'' +
				", pgmenIbanEstero=" + pgmenIbanEstero +
				", pgmenBic='" + pgmenBic + '\'' +
				", email='" + email + '\'' +
				", ilegProspettoTassi='" + ilegProspettoTassi + '\'' +
				", ilegDtInizio=" + ilegDtInizio +
				", ilegClcolDtFine=" + ilegClcolDtFine +
				", ilegImporto=" + ilegImporto +
				", ilegImportoPagamento=" + ilegImportoPagamento +
				", ilegFlConsolidato=" + ilegFlConsolidato +
				", pgmenCap='" + pgmenCap + '\'' +
				", pgmenDenomComune='" + pgmenDenomComune + '\'' +
				", pgmenSiglaProvincia='" + pgmenSiglaProvincia + '\'' +
				", dtEsecuzioneFlusso=" + dtEsecuzioneFlusso +
				", esitoCreDtTm=" + esitoCreDtTm +
				", esitoOrdValDt=" + esitoOrdValDt +
				", esitoBenValDt=" + esitoBenValDt +
				", esitoMsgId='" + esitoMsgId + '\'' +
				", esitoTxSts='" + esitoTxSts + '\'' +
				", esitoAccntSvcrRef='" + esitoAccntSvcrRef + '\'' +
				", esitoRsnOrgtrNm='" + esitoRsnOrgtrNm + '\'' +
				", esitoRsnOrgtrBicBei='" + esitoRsnOrgtrBicBei + '\'' +
				", esitoRsnCd='" + esitoRsnCd + '\'' +
				", esitoRsnPrtry='" + esitoRsnPrtry + '\'' +
				", esitoRsnAddtlinf='" + esitoRsnAddtlinf + '\'' +
				", dispoOneriAccessori=" + dispoOneriAccessori +
				", dispDataScadenza=" + dispDataScadenza +
				'}';
	}
}