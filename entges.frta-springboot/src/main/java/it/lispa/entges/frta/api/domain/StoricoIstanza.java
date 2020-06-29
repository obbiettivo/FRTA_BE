package it.lispa.entges.frta.api.domain;

import java.util.Date;

/**
 * @author Francesco Mancini
 * 
 * classe StoricoIstanza
 * 
 *
 */
public class StoricoIstanza {

	private Integer idStoricoIstanza;
	private Istanza istanza;
	private Stato stato;
	private Date dtCambioStato;
	private String pgmenModRimb;
	private String pgmenCIban;
	private String pgmenIndirizzo;
	private String pgmenTelefono;
	private String pgmenEmail;
	private Boolean pgmenIbanEstero;
	private String pgmenBic;

	private String email;
	private String ilegProspettoTassi;
	private Date ilegDtInizio;
	private Date ilegClcolDtFine;
	private Double ilegImporto;
	private Double ilegImportoPagamento;
	private boolean ilegFlConsolidato;
	private String pgmenCap;
	private String pgmenDenomComune;
	private String pgmenSiglaProvincia;
	private Date dtEsecuzioneFlusso;
	private Date esitoCreDtTm;
	private Date esitoOrdValDt;
	private Date esitoBenValDt;
	private String esitoMsgId;
	private String esitoTxSts;
	private String esitoAccntSvcrRef;
	private String esitoRsnOrgtrNm;
	private String esitoRsnOrgtrBicBei;
	private String esitoRsnCd;
	private String esitoRsnPrtry;
	private String esitoRsnAddtlinf;
	private Double dispoOneriAccessori;
	private Date dispDataScadenza;

	public StoricoIstanza() {
	};

	public Integer getIdStoricoIstanza() {
		return idStoricoIstanza;
	}

	public void setIdStoricoIstanza(Integer idStoricoIstanza) {
		this.idStoricoIstanza = idStoricoIstanza;
	}

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

	public boolean getIlegFlConsolidato() {
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
}