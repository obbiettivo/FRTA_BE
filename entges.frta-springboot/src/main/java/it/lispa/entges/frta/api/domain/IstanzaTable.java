package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 *
 * classe Istanza
 *
 *
 * TGA7AT_FRTA_ISTANZA
 *
 *
 * ID_ISTANZA	NUMBER
 * ID_STATO	NUMBER
 * ID_GTA	NUMBER
 * FL_PF_PG	VARCHAR2(2 BYTE)
 * CODICEFISCALE	VARCHAR2(16 BYTE)
 * RAGIONE_SOCIALE	VARCHAR2(500 BYTE)
 * COGNOME	VARCHAR2(500 BYTE)
 * NOME	VARCHAR2(500 BYTE)
 * SESSO	VARCHAR2(1 BYTE)
 * DATANASCITA	DATE
 * LUOGONASCITA	VARCHAR2(4 BYTE)
 * DENOM_FISC	VARCHAR2(30 BYTE)
 * CAP	VARCHAR2(5 BYTE)
 * ISTAT_COMUNE	VARCHAR2(3 BYTE)
 * ISTAT_PROVINCIA	VARCHAR2(3 BYTE)
 * SIGLA_PROVINCIA	VARCHAR2(2 BYTE)
 * DENOM_COMUNE	VARCHAR2(255 BYTE)
 * INDIRIZZO	VARCHAR2(500 BYTE)
 * TELEFONO_FAX	VARCHAR2(20 BYTE)
 * EMAIL	VARCHAR2(500 BYTE)
 * NUMERO_PRATICA	VARCHAR2(17 BYTE)
 * ANNO_PRATICA	NUMBER(4,0)
 * DATA_PRESENTAZIONE_DOMANDA	DATE
 * TARGA	VARCHAR2(10 BYTE)
 * TIPO_VEICOLO	VARCHAR2(2 BYTE)
 * CAUSALE_RIMBORSO	VARCHAR2(3 BYTE)
 * IMPORTO_RICHIESTO	NUMBER(13,2)
 * IMPORTO_AMMESSO	NUMBER(13,2)
 * VALUTA	VARCHAR2(1 BYTE)
 * NOTE_ISTRUTTORIA	VARCHAR2(250 BYTE)
 * A_DATA_SCAD_VERS	DATE
 * A_DATA_VERSAMENTO	DATE
 * A_IMPORTO_VERSAMENTO	NUMBER(13,2)
 * A_NUMERO_RICEVUTA	VARCHAR2(24 BYTE)
 * A_TARGA_VEICOLO	VARCHAR2(10 BYTE)
 * A_TIPO_VEICOLO	VARCHAR2(2 BYTE)
 * A_TIPO_VERSAMENTO	VARCHAR2(2 BYTE)
 * B_DATA_SCAD_VERS	DATE
 * B_DATA_VERSAMENTO	DATE
 * B_IMPORTO_VERSAMENTO	NUMBER(13,2)
 * B_NUMERO_RICEVUTA	VARCHAR2(24 BYTE)
 * B_TARGA_VEICOLO	VARCHAR2(10 BYTE)
 * B_TIPO_VEICOLO	VARCHAR2(2 BYTE)
 * B_TIPO_VERSAMENTO	VARCHAR2(2 BYTE)
 * PGMEN_MOD_RIMB	VARCHAR2(3 BYTE)
 * PGMEN_C_IBAN	VARCHAR2(100 BYTE)
 * PGMEN_INDIRIZZO	VARCHAR2(500 BYTE)
 * PGMEN_TELEFONO	VARCHAR2(20 BYTE)
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
 * NOTE	VARCHAR2(4000 BYTE)
 * DISP_ONERI_ACCESSORI	NUMBER(13,2)
 * DISP_DATA_SCADENZA	DATE
 * PGMEN_EMAIL	VARCHAR2(500 BYTE)
 * PGMEN_FL_IBAN_ESTERO	CHAR(1 BYTE)
 * PGMEN_BIC	VARCHAR2(11 BYTE)
 * TIPO_RIMBORSO	VARCHAR2(3 BYTE)
 * ID_ZEROBOLLO	NUMBER
 * CODICEFISCALE_CONTATTO	VARCHAR2(16 BYTE)
 * ISTAT_COMUNE_CONTATTO	VARCHAR2(3 BYTE)
 * ISTAT_PROVINCIA_CONTATTO	VARCHAR2(3 BYTE)
 * SIGLA_PROVINCIA_CONTATTO	VARCHAR2(2 BYTE)
 * DENOM_COMUNE_CONTATTO	VARCHAR2(255 BYTE)
 * CAP_CONTATTO	VARCHAR2(5 BYTE)
 * INDIRIZZO_CONTATTO	VARCHAR2(120 BYTE)
 * EMAIL_CONTATTO	VARCHAR2(200 BYTE)
 * TELEFONO_FAX_CONTATTO	VARCHAR2(20 BYTE)
 * ID_SISB	NUMBER
 * TIPO_WARNING	NUMBER
 * DESC_WARNING	VARCHAR2(200 BYTE)
 * ID_ECO	NUMBER
 *
 */
@Entity
@Table(name = "TGA7AT_FRTA_ISTANZA")
public class IstanzaTable {

	@Id
	@Column(name = "ID_ISTANZA")
	private Long idIstanza;

	@Column(name = "ID_GTA")
	private Long idGTA;

	@Column(name = "FL_PF_PG")
	private String flpfpg;

	@Column(name = "CODICEFISCALE")
	private String codiceFiscale;

	@Column(name = "RAGIONE_SOCIALE")
	private String ragioneSociale;

	@Column(name = "COGNOME")
	private String cognome;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "SESSO")
	private String sesso;

	@Column(name = "DATANASCITA")
	private Date dataNascita;

	@Column(name = "LUOGONASCITA")
	private String luogoNascita;

	@Column(name = "DENOM_FISC")
	private String denomFisc;

	@Column(name = "CAP")
	private String cap;

	@Column(name = "ISTAT_COMUNE")
	private String istatComune;

	@Column(name = "ISTAT_PROVINCIA")
	private String istatProvincia;

	@Column(name = "SIGLA_PROVINCIA")
	private String siglaProvincia;

	@Column(name = "DENOM_COMUNE")
	private String denomComune;

	@Column(name = "INDIRIZZO")
	private String indirizzo;

	@Column(name = "TELEFONO_FAX")
	private String telefonoFax;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "NUMERO_PRATICA")
	private String numeroPratica;

	@Column(name = "ANNO_PRATICA")
	private Integer annoPratica;

	@Column(name = "DATA_PRESENTAZIONE_DOMANDA")
	private Date dataPresentazioneDomanda;

	@Column(name = "TARGA")
	private String targa;

	@Column(name = "TIPO_VEICOLO")
	private String tipoVeicolo;

	@Column(name = "CAUSALE_RIMBORSO")
	private String causaleRimborso;

	@Column(name = "IMPORTO_RICHIESTO")
	private Double importoRichiesto;

	@Column(name = "IMPORTO_AMMESSO")
	private Double importoAmmesso;

	@Column(name = "VALUTA")
	private String valuta;

	@Column(name = "NOTE_ISTRUTTORIA")
	private String noteIstruttoria;

 	@Column(name = "A_DATA_SCAD_VERS")
	private Date aDataScadVers;

	@Column(name = "A_DATA_VERSAMENTO")
	private Date aDataVersamento;

	@Column(name = "A_IMPORTO_VERSAMENTO")
	private Double aImportoVersamento;

	@Column(name = "A_NUMERO_RICEVUTA")
	private String aNumeroRicevuta;

	@Column(name = "A_TARGA_VEICOLO")
	private String aTargaVeicolo;

	@Column(name = "A_TIPO_VEICOLO")
	private String aTipoVeicolo;

	@Column(name = "A_TIPO_VERSAMENTO")
	private String aTipoVersamento;

	@Column(name = "B_DATA_SCAD_VERS")
	private Date bDataScadVers;

	@Column(name = "B_DATA_VERSAMENTO")
	private Date bDataVersamento;

	@Column(name = "B_IMPORTO_VERSAMENTO")
	private Double bImportoVersamento;

	@Column(name = "B_NUMERO_RICEVUTA")
	private String bNumeroRicevuta;

	@Column(name = "B_TARGA_VEICOLO")
	private String bTargaVeicolo;

	@Column(name = "B_TIPO_VEICOLO")
	private String bTipoVeicolo;

	@Column(name = "B_TIPO_VERSAMENTO")
	private String bTipoVersamento;

	@Column(name = "PGMEN_MOD_RIMB")
	private String pgmenModRimb;

	@Column(name = "PGMEN_C_IBAN")
	private String pgmenCIban;

 	@Column(name = "PGMEN_INDIRIZZO")
	private String pgmenIndirizzo;

	@Column(name = "PGMEN_TELEFONO")
	private String pgmenTelefono;

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

	@Column(name = "ESITO_MSG_ID")
	private String esitoMsgId;

	@Column(name = "PGMEN_EMAIL")
	private String pgmenEmail;

	@Column(name = "PGMEN_FL_IBAN_ESTERO")
	private boolean pgmenIbanEstero;

	@Column(name = "PGMEN_BIC")
	private String pgmenBic;

	@Column(name = "ESITO_CRE_DT_TM")
	private Date esitoCreDtTm;

	@Column(name = "ESITO_ORD_VAL_DT")
	private Date esitoOrdValDt;

	@Column(name = "ESITO_BEN_VAL_DT")
	private Date esitoBenValDt;

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

	@Column(name = "NOTE")
	private String note;

	@Column(name = "DISP_ONERI_ACCESSORI")
	private Double dispoOneriAccessori;

	@Column(name = "DISP_DATA_SCADENZA")
	private Date dispDataScadenza;

	@Column(name = "ID_FLUSSO")
	private Long idFlusso;

	@Column(name = "TIPO_RIMBORSO")
	private String tipoRimborso;

	/*Campi aggiunti per gestione istanze SISB*/

	@Column(name = "ID_SISB")
	private Long idSisb;

	@Column(name = "ID_ECO")
	private Long idEco;
	/*
	 * ACCETTATE CON WARNING
	 */
	@Column(name = "DESC_WARNING")
	private String descWarning;

	@Column(name = "TIPO_WARNING")
	private Long tipoWarning;
	
	/**CAMPI AGGIUNTI perhcè presenti in tabella e non nel bean*/

	@Column(name = "ID_STATO")
	private Long idStato;

	@Column(name = "ID_ZEROBOLLO")
	private Long idZeroBollo;

	@Column(name = "CODICEFISCALE_CONTATTO")
	private String codiceFiscaleContatto;

	@Column(name = "ISTAT_COMUNE_CONTATTO")
	private String istatComuneContatto;

	@Column(name = "ISTAT_PROVINCIA_CONTATTO")
	private String istatProvinciaContatto;

	@Column(name = "SIGLA_PROVINCIA_CONTATTO")
	private String siglaProvinciaContatto;

	@Column(name = "DENOM_COMUNE_CONTATTO")
	private String denominazioneComuneContatto;

	@Column(name = "CAP_CONTATTO")
	private String capContatto;

	@Column(name = "INDIRIZZO_CONTATTO")
	private String indirizzoContatto;

	@Column(name = "EMAIL_CONTATTO")
	private String emailContatto;

	@Column(name = "TELEFONO_FAX_CONTATTO")
	private String telefonoFaxContatto;

	public Long getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(Long idIstanza) {
		this.idIstanza = idIstanza;
	}

	public Long getIdGTA() {
		return idGTA;
	}

	public void setIdGTA(Long idGTA) {
		this.idGTA = idGTA;
	}

	public String getFlpfpg() {
		return flpfpg;
	}

	public void setFlpfpg(String flpfpg) {
		this.flpfpg = flpfpg;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getDenomFisc() {
		return denomFisc;
	}

	public void setDenomFisc(String denomFisc) {
		this.denomFisc = denomFisc;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getIstatComune() {
		return istatComune;
	}

	public void setIstatComune(String istatComune) {
		this.istatComune = istatComune;
	}

	public String getIstatProvincia() {
		return istatProvincia;
	}

	public void setIstatProvincia(String istatProvincia) {
		this.istatProvincia = istatProvincia;
	}

	public String getSiglaProvincia() {
		return siglaProvincia;
	}

	public void setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
	}

	public String getDenomComune() {
		return denomComune;
	}

	public void setDenomComune(String denomComune) {
		this.denomComune = denomComune;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefonoFax() {
		return telefonoFax;
	}

	public void setTelefonoFax(String telefonoFax) {
		this.telefonoFax = telefonoFax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroPratica() {
		return numeroPratica;
	}

	public void setNumeroPratica(String numeroPratica) {
		this.numeroPratica = numeroPratica;
	}

	public Integer getAnnoPratica() {
		return annoPratica;
	}

	public void setAnnoPratica(Integer annoPratica) {
		this.annoPratica = annoPratica;
	}

	public Date getDataPresentazioneDomanda() {
		return dataPresentazioneDomanda;
	}

	public void setDataPresentazioneDomanda(Date dataPresentazioneDomanda) {
		this.dataPresentazioneDomanda = dataPresentazioneDomanda;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getTipoVeicolo() {
		return tipoVeicolo;
	}

	public void setTipoVeicolo(String tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}

	public String getCausaleRimborso() {
		return causaleRimborso;
	}

	public void setCausaleRimborso(String causaleRimborso) {
		this.causaleRimborso = causaleRimborso;
	}

	public Double getImportoRichiesto() {
		return importoRichiesto;
	}

	public void setImportoRichiesto(Double importoRichiesto) {
		this.importoRichiesto = importoRichiesto;
	}

	public Double getImportoAmmesso() {
		return importoAmmesso;
	}

	public void setImportoAmmesso(Double importoAmmesso) {
		this.importoAmmesso = importoAmmesso;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public String getNoteIstruttoria() {
		return noteIstruttoria;
	}

	public void setNoteIstruttoria(String noteIstruttoria) {
		this.noteIstruttoria = noteIstruttoria;
	}

	public Date getaDataScadVers() {
		return aDataScadVers;
	}

	public void setaDataScadVers(Date aDataScadVers) {
		this.aDataScadVers = aDataScadVers;
	}

	public Date getaDataVersamento() {
		return aDataVersamento;
	}

	public void setaDataVersamento(Date aDataVersamento) {
		this.aDataVersamento = aDataVersamento;
	}

	public Double getaImportoVersamento() {
		return aImportoVersamento;
	}

	public void setaImportoVersamento(Double aImportoVersamento) {
		this.aImportoVersamento = aImportoVersamento;
	}

	public String getaNumeroRicevuta() {
		return aNumeroRicevuta;
	}

	public void setaNumeroRicevuta(String aNumeroRicevuta) {
		this.aNumeroRicevuta = aNumeroRicevuta;
	}

	public String getaTargaVeicolo() {
		return aTargaVeicolo;
	}

	public void setaTargaVeicolo(String aTargaVeicolo) {
		this.aTargaVeicolo = aTargaVeicolo;
	}

	public String getaTipoVeicolo() {
		return aTipoVeicolo;
	}

	public void setaTipoVeicolo(String aTipoVeicolo) {
		this.aTipoVeicolo = aTipoVeicolo;
	}

	public String getaTipoVersamento() {
		return aTipoVersamento;
	}

	public void setaTipoVersamento(String aTipoVersamento) {
		this.aTipoVersamento = aTipoVersamento;
	}

	public Date getbDataScadVers() {
		return bDataScadVers;
	}

	public void setbDataScadVers(Date bDataScadVers) {
		this.bDataScadVers = bDataScadVers;
	}

	public Date getbDataVersamento() {
		return bDataVersamento;
	}

	public void setbDataVersamento(Date bDataVersamento) {
		this.bDataVersamento = bDataVersamento;
	}

	public Double getbImportoVersamento() {
		return bImportoVersamento;
	}

	public void setbImportoVersamento(Double bImportoVersamento) {
		this.bImportoVersamento = bImportoVersamento;
	}

	public String getbNumeroRicevuta() {
		return bNumeroRicevuta;
	}

	public void setbNumeroRicevuta(String bNumeroRicevuta) {
		this.bNumeroRicevuta = bNumeroRicevuta;
	}

	public String getbTargaVeicolo() {
		return bTargaVeicolo;
	}

	public void setbTargaVeicolo(String bTargaVeicolo) {
		this.bTargaVeicolo = bTargaVeicolo;
	}

	public String getbTipoVeicolo() {
		return bTipoVeicolo;
	}

	public void setbTipoVeicolo(String bTipoVeicolo) {
		this.bTipoVeicolo = bTipoVeicolo;
	}

	public String getbTipoVersamento() {
		return bTipoVersamento;
	}

	public void setbTipoVersamento(String bTipoVersamento) {
		this.bTipoVersamento = bTipoVersamento;
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

	public String getEsitoMsgId() {
		return esitoMsgId;
	}

	public void setEsitoMsgId(String esitoMsgId) {
		this.esitoMsgId = esitoMsgId;
	}

	public String getPgmenEmail() {
		return pgmenEmail;
	}

	public void setPgmenEmail(String pgmenEmail) {
		this.pgmenEmail = pgmenEmail;
	}

	public boolean isPgmenIbanEstero() {
		return pgmenIbanEstero;
	}

	public void setPgmenIbanEstero(boolean pgmenIbanEstero) {
		this.pgmenIbanEstero = pgmenIbanEstero;
	}

	public String getPgmenBic() {
		return pgmenBic;
	}

	public void setPgmenBic(String pgmenBic) {
		this.pgmenBic = pgmenBic;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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

	public Long getIdFlusso() {
		return idFlusso;
	}

	public void setIdFlusso(Long idFlusso) {
		this.idFlusso = idFlusso;
	}

	public String getTipoRimborso() {
		return tipoRimborso;
	}

	public void setTipoRimborso(String tipoRimborso) {
		this.tipoRimborso = tipoRimborso;
	}

	public Long getIdSisb() {
		return idSisb;
	}

	public void setIdSisb(Long idSisb) {
		this.idSisb = idSisb;
	}

	public Long getIdEco() {
		return idEco;
	}

	public void setIdEco(Long idEco) {
		this.idEco = idEco;
	}

	public String getDescWarning() {
		return descWarning;
	}

	public void setDescWarning(String descWarning) {
		this.descWarning = descWarning;
	}

	public Long getTipoWarning() {
		return tipoWarning;
	}

	public void setTipoWarning(Long tipoWarning) {
		this.tipoWarning = tipoWarning;
	}

	public Long getIdStato() {
		return idStato;
	}

	public void setIdStato(Long idStato) {
		this.idStato = idStato;
	}

	public Long getIdZeroBollo() {
		return idZeroBollo;
	}

	public void setIdZeroBollo(Long idZeroBollo) {
		this.idZeroBollo = idZeroBollo;
	}

	public String getCodiceFiscaleContatto() {
		return codiceFiscaleContatto;
	}

	public void setCodiceFiscaleContatto(String codiceFiscaleContatto) {
		this.codiceFiscaleContatto = codiceFiscaleContatto;
	}

	public String getIstatComuneContatto() {
		return istatComuneContatto;
	}

	public void setIstatComuneContatto(String istatComuneContatto) {
		this.istatComuneContatto = istatComuneContatto;
	}

	public String getIstatProvinciaContatto() {
		return istatProvinciaContatto;
	}

	public void setIstatProvinciaContatto(String istatProvinciaContatto) {
		this.istatProvinciaContatto = istatProvinciaContatto;
	}

	public String getSiglaProvinciaContatto() {
		return siglaProvinciaContatto;
	}

	public void setSiglaProvinciaContatto(String siglaProvinciaContatto) {
		this.siglaProvinciaContatto = siglaProvinciaContatto;
	}

	public String getDenominazioneComuneContatto() {
		return denominazioneComuneContatto;
	}

	public void setDenominazioneComuneContatto(String denominazioneComuneContatto) {
		this.denominazioneComuneContatto = denominazioneComuneContatto;
	}

	public String getCapContatto() {
		return capContatto;
	}

	public void setCapContatto(String capContatto) {
		this.capContatto = capContatto;
	}

	public String getIndirizzoContatto() {
		return indirizzoContatto;
	}

	public void setIndirizzoContatto(String indirizzoContatto) {
		this.indirizzoContatto = indirizzoContatto;
	}

	public String getEmailContatto() {
		return emailContatto;
	}

	public void setEmailContatto(String emailContatto) {
		this.emailContatto = emailContatto;
	}

	public String getTelefonoFaxContatto() {
		return telefonoFaxContatto;
	}

	public void setTelefonoFaxContatto(String telefonoFaxContatto) {
		this.telefonoFaxContatto = telefonoFaxContatto;
	}

	@Override
	public String toString() {
		return "IstanzaTable{" +
				"idIstanza=" + idIstanza +
				", idGTA=" + idGTA +
				", flpfpg='" + flpfpg + '\'' +
				", codiceFiscale='" + codiceFiscale + '\'' +
				", ragioneSociale='" + ragioneSociale + '\'' +
				", cognome='" + cognome + '\'' +
				", nome='" + nome + '\'' +
				", sesso='" + sesso + '\'' +
				", dataNascita=" + dataNascita +
				", luogoNascita='" + luogoNascita + '\'' +
				", denomFisc='" + denomFisc + '\'' +
				", cap='" + cap + '\'' +
				", istatComune='" + istatComune + '\'' +
				", istatProvincia='" + istatProvincia + '\'' +
				", siglaProvincia='" + siglaProvincia + '\'' +
				", denomComune='" + denomComune + '\'' +
				", indirizzo='" + indirizzo + '\'' +
				", telefonoFax='" + telefonoFax + '\'' +
				", email='" + email + '\'' +
				", numeroPratica='" + numeroPratica + '\'' +
				", annoPratica=" + annoPratica +
				", dataPresentazioneDomanda=" + dataPresentazioneDomanda +
				", targa='" + targa + '\'' +
				", tipoVeicolo='" + tipoVeicolo + '\'' +
				", causaleRimborso='" + causaleRimborso + '\'' +
				", importoRichiesto=" + importoRichiesto +
				", importoAmmesso=" + importoAmmesso +
				", valuta='" + valuta + '\'' +
				", noteIstruttoria='" + noteIstruttoria + '\'' +
				", aDataScadVers=" + aDataScadVers +
				", aDataVersamento=" + aDataVersamento +
				", aImportoVersamento=" + aImportoVersamento +
				", aNumeroRicevuta='" + aNumeroRicevuta + '\'' +
				", aTargaVeicolo='" + aTargaVeicolo + '\'' +
				", aTipoVeicolo='" + aTipoVeicolo + '\'' +
				", aTipoVersamento='" + aTipoVersamento + '\'' +
				", bDataScadVers=" + bDataScadVers +
				", bDataVersamento=" + bDataVersamento +
				", bImportoVersamento=" + bImportoVersamento +
				", bNumeroRicevuta='" + bNumeroRicevuta + '\'' +
				", bTargaVeicolo='" + bTargaVeicolo + '\'' +
				", bTipoVeicolo='" + bTipoVeicolo + '\'' +
				", bTipoVersamento='" + bTipoVersamento + '\'' +
				", pgmenModRimb='" + pgmenModRimb + '\'' +
				", pgmenCIban='" + pgmenCIban + '\'' +
				", pgmenIndirizzo='" + pgmenIndirizzo + '\'' +
				", pgmenTelefono='" + pgmenTelefono + '\'' +
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
				", esitoMsgId='" + esitoMsgId + '\'' +
				", pgmenEmail='" + pgmenEmail + '\'' +
				", pgmenIbanEstero=" + pgmenIbanEstero +
				", pgmenBic='" + pgmenBic + '\'' +
				", esitoCreDtTm=" + esitoCreDtTm +
				", esitoOrdValDt=" + esitoOrdValDt +
				", esitoBenValDt=" + esitoBenValDt +
				", esitoTxSts='" + esitoTxSts + '\'' +
				", esitoAccntSvcrRef='" + esitoAccntSvcrRef + '\'' +
				", esitoRsnOrgtrNm='" + esitoRsnOrgtrNm + '\'' +
				", esitoRsnOrgtrBicBei='" + esitoRsnOrgtrBicBei + '\'' +
				", esitoRsnCd='" + esitoRsnCd + '\'' +
				", esitoRsnPrtry='" + esitoRsnPrtry + '\'' +
				", esitoRsnAddtlinf='" + esitoRsnAddtlinf + '\'' +
				", note='" + note + '\'' +
				", dispoOneriAccessori=" + dispoOneriAccessori +
				", dispDataScadenza=" + dispDataScadenza +
				", idFlusso=" + idFlusso +
				", tipoRimborso='" + tipoRimborso + '\'' +
				", idSisb=" + idSisb +
				", idEco=" + idEco +
				", descWarning='" + descWarning + '\'' +
				", tipoWarning=" + tipoWarning +
				", idStato=" + idStato +
				", idZeroBollo=" + idZeroBollo +
				", codiceFiscaleContatto='" + codiceFiscaleContatto + '\'' +
				", istatComuneContatto='" + istatComuneContatto + '\'' +
				", istatProvinciaContatto='" + istatProvinciaContatto + '\'' +
				", siglaProvinciaContatto='" + siglaProvinciaContatto + '\'' +
				", denominazioneComuneContatto='" + denominazioneComuneContatto + '\'' +
				", capContatto='" + capContatto + '\'' +
				", indirizzoContatto='" + indirizzoContatto + '\'' +
				", emailContatto='" + emailContatto + '\'' +
				", telefonoFaxContatto='" + telefonoFaxContatto + '\'' +
				'}';
	}
}