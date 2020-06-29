package it.lispa.entges.frta.api.domain;

import java.util.Date;
import java.util.List;

/**
 * 
 * classe Istanza
 * 
 *
 */
public class Istanza {

	private Integer idIstanza;
	private Integer idGTA;
	private String flpfpg;
	private String codiceFiscale;
	private String ragioneSociale;
	private String cognome;
	private String nome;
	private String sesso;
	private Date dataNascita;
	private String luogoNascita;
	private String denomFisc;
	private String cap;
	private String istatComune;
	private String istatProvincia;
	private String siglaProvincia;
	private String denomComune;
	private String indirizzo;
	private String telefonoFax;
	private String email;
	private String numeroPratica;
	private Integer annoPratica;
	private Date dataPresentazioneDomanda;
	private String targa;
	private String tipoVeicolo;
	private String causaleRimborso;
	private Double importoRichiesto;
	private Double importoAmmesso;
	private String valuta;
	private String noteIstruttoria;
	private Date aDataScadVers;
	private Date aDataVersamento;
	private Double aImportoVersamento;
	private String aNumeroRicevuta;
	private String aTargaVeicolo;
	private String aTipoVeicolo;
	private String aTipoVersamento;
	private Date bDataScadVers;
	private Date bDataVersamento;
	private Double bImportoVersamento;
	private String bNumeroRicevuta;
	private String bTargaVeicolo;
	private String bTipoVeicolo;
	private String bTipoVersamento;
	private String pgmenModRimb;
	private String pgmenCIban;
	private String pgmenIndirizzo;
	private String pgmenTelefono;
	private String pgmenEmail;
	private boolean pgmenIbanEstero;
	private String pgmenBic;
	private String ilegProspettoTassi;
	private Date ilegDtInizio;
	private Date ilegClcolDtFine;
	private Double ilegImporto;
	private Double ilegImportoPagamento;
	private boolean ilegFlConsolidato;
	private Stato stato;
	private String pgmenCap;
	private String pgmenDenomComune;
	private String pgmenSiglaProvincia;
	private List<StoricoIstanza> listaStorico;
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
	private String note;
	private Double dispoOneriAccessori;
	private Date dispDataScadenza;
	private Integer idFlusso;
	private String sepaRsnCd;
	private Integer numeroIstanze;
	private String tipoRimborso;

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

	private Integer idSisb;
	private Date dtConsumiDal;
	private Date dtConsumiAl;
	private Integer idBenzinaio;
	
	private Integer idEco;

	/*
	 * ACCETTATE CON WARNING
	 */
	private String descWarning;
	private Integer tipoWarning;

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

	public Istanza() {
	}

	public Integer getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(Integer idIstanza) {
		this.idIstanza = idIstanza;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public Integer getIdGTA() {
		return idGTA;
	}

	public void setIdGTA(Integer idGTA) {
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

	public String getPgmenEmail() {
		return pgmenEmail;
	}

	public void setPgmenEmail(String pgmenEmail) {
		this.pgmenEmail = pgmenEmail;
	}

	public boolean getPgmenIbanEstero() {
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

	public List<StoricoIstanza> getListaStorico() {
		return listaStorico;
	}

	public void setListaStorico(List<StoricoIstanza> listaStorico) {
		this.listaStorico = listaStorico;
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

	public Integer getIdFlusso() {
		return idFlusso;
	}

	public void setIdFlusso(Integer idFlusso) {
		this.idFlusso = idFlusso;
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

	public String getTipoRimborso() {
		return tipoRimborso;
	}

	public void setTipoRimborso(String tipoRimborso) {
		this.tipoRimborso = tipoRimborso;
	}

	/**
	 * @return the idSisb
	 */
	public Integer getIdSisb() {
		return idSisb;
	}

	/**
	 * @param idSisb the idSisb to set
	 */
	public void setIdSisb(Integer idSisb) {
		this.idSisb = idSisb;
	}

	/**
	 * @return the dtConsumiDal
	 */
	public Date getDtConsumiDal() {
		return dtConsumiDal;
	}

	/**
	 * @param dtConsumiDal the dtConsumiDal to set
	 */
	public void setDtConsumiDal(Date dtConsumiDal) {
		this.dtConsumiDal = dtConsumiDal;
	}

	/**
	 * @return the dtConsumiAl
	 */
	public Date getDtConsumiAl() {
		return dtConsumiAl;
	}

	/**
	 * @param dtConsumiAl the dtConsumiAl to set
	 */
	public void setDtConsumiAl(Date dtConsumiAl) {
		this.dtConsumiAl = dtConsumiAl;
	}

	/**
	 * @return the idBenzinaio
	 */
	public Integer getIdBenzinaio() {
		return idBenzinaio;
	}

	/**
	 * @param idBenzinaio the idBenzinaio to set
	 */
	public void setIdBenzinaio(Integer idBenzinaio) {
		this.idBenzinaio = idBenzinaio;
	}

	/*
	 * ACCETTATE CON WARNING
	 */
	public String getDescWarning() {
		return descWarning;
	}

	public void setDescWarning(String descWarning) {
		this.descWarning = descWarning;
	}

	public Integer getTipoWarning() {
		return tipoWarning;
	}

	public void setTipoWarning(Integer tipoWarning) {
		this.tipoWarning = tipoWarning;
	}

	public Integer getIdEco() {
		return idEco;
	}

	public void setIdEco(Integer idEco) {
		this.idEco = idEco;
	}
	
	
}