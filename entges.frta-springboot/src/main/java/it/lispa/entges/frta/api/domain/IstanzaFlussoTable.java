package it.lispa.entges.frta.api.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/***********
 *
 *TGA7AT_FRTA_FLUSSO_ISTANZA
 *
 *ID_FLUSSO	NUMBER
 * ID_ISTANZA	NUMBER
 * FL_ERRORE	CHAR(1 BYTE)
 * CD_ERRORE	VARCHAR2(10 BYTE)
 * DS_ERRORE	VARCHAR2(2000 BYTE)
 * CODICEFISCALE	VARCHAR2(16 BYTE)
 * RAGIONE_SOCIALE	VARCHAR2(500 BYTE)
 * NUMERO_PRATICA	VARCHAR2(17 BYTE)
 * PGMEN_MOD_RIMB	VARCHAR2(3 BYTE)
 * PGMEN_C_IBAN	VARCHAR2(100 BYTE)
 * PGMEN_INDIRIZZO	VARCHAR2(2000 BYTE)
 * ILEG_IMPORTO_PAGAMENTO	NUMBER(13,2)
 *
 * TARGA	VARCHAR2(10 BYTE)
 * ANNO_PRATICA	NUMBER(4,0)
 * B_NUMERO_RICEVUTA	VARCHAR2(24 BYTE)
 * B_DATA_VERSAMENTO	VARCHAR2(10 BYTE)
 * IMPORTO_AMMESSO	NUMBER(13,2)
 * PGMEN_INDIRIZZO2	VARCHAR2(2000 BYTE)
 * DISP_ONERI_ACCESSORI	NUMBER(13,2)
 * ILEG_IMPORTO	NUMBER(13,2)
 * DISP_DATA_ESECUZIONE	DATE
 * DISP_DATA_SCADENZA	DATE
 *
 * PGMEN_BIC	VARCHAR2(11 BYTE)
 *
 * ***********/
@Entity
@Table(name = "TGA7AT_FRTA_FLUSSO_ISTANZA")
public class IstanzaFlussoTable {

	@Id
	@Column(name = "ID_FLUSSO")
	private Long idFlusso;

	@Column(name = "ID_ISTANZA")
	private Long idIstanza;

	@Column(name = "FL_ERRORE")
	private String flErrore;

	@Column(name = "CD_ERRORE")
	private String codiceErrore;

	@Column(name = "DS_ERRORE")
	private String descrizioneErrore;

	@Column(name = "CODICEFISCALE")
	private String codiceFiscale;

	@Column(name = "RAGIONE_SOCIALE")
	private String ragioneSociale;

	@Column(name = "NUMERO_PRATICA")
	private String numeroPratica;

	@Column(name = "PGMEN_MOD_RIMB")
	private String modalitaRimborso;

	@Column(name = "PGMEN_C_IBAN")
	private String codiceIban;

	@Column(name = "PGMEN_INDIRIZZO")
	private String indirizzo;

	@Column(name = "ILEG_IMPORTO_PAGAMENTO")
	private Double importoPagamentoIleg;

	@Column(name = "PGMEN_BIC")
	private String pgmenBic;

	@Column(name = "TARGA")
	private String targa;

	@Column(name = "ANNO_PRATICA")
	private String annoPratica;

	@Column(name = "B_NUMERO_RICEVUTA")
	private String bNumeroRicevuta;

	@Column(name = "B_DATA_VERSAMENTO")
	private String bDataVersamento;

	@Column(name = "IMPORTO_AMMESSO")
	private Double importoMassimo;

	@Column(name = "PGMEN_INDIRIZZO2")
	private String pgmenIndirizzo2;

	@Column(name = "DISP_ONERI_ACCESSORI")
	private Double dispOneriAccessori;

	@Column(name = "ILEG_IMPORTO")
	private Double ilegImporto ;

	@Column(name = "DISP_DATA_ESECUZIONE")
	private Date dispDataEsecuzione;

	@Column(name = "DISP_DATA_SCADENZA")
	private Date dispDataScadenza;

	public Long getIdFlusso() {
		return idFlusso;
	}

	public void setIdFlusso(Long idFlusso) {
		this.idFlusso = idFlusso;
	}

	public Long getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(Long idIstanza) {
		this.idIstanza = idIstanza;
	}

	public String getFlErrore() {
		return flErrore;
	}

	public void setFlErrore(String flErrore) {
		this.flErrore = flErrore;
	}

	public String getCodiceErrore() {
		return codiceErrore;
	}

	public void setCodiceErrore(String codiceErrore) {
		this.codiceErrore = codiceErrore;
	}

	public String getDescrizioneErrore() {
		return descrizioneErrore;
	}

	public void setDescrizioneErrore(String descrizioneErrore) {
		this.descrizioneErrore = descrizioneErrore;
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

	public String getNumeroPratica() {
		return numeroPratica;
	}

	public void setNumeroPratica(String numeroPratica) {
		this.numeroPratica = numeroPratica;
	}

	public String getModalitaRimborso() {
		return modalitaRimborso;
	}

	public void setModalitaRimborso(String modalitaRimborso) {
		this.modalitaRimborso = modalitaRimborso;
	}

	public String getCodiceIban() {
		return codiceIban;
	}

	public void setCodiceIban(String codiceIban) {
		this.codiceIban = codiceIban;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Double getImportoPagamentoIleg() {
		return importoPagamentoIleg;
	}

	public void setImportoPagamentoIleg(Double importoPagamentoIleg) {
		this.importoPagamentoIleg = importoPagamentoIleg;
	}

	public String getPgmenBic() {
		return pgmenBic;
	}

	public void setPgmenBic(String pgmenBic) {
		this.pgmenBic = pgmenBic;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getAnnoPratica() {
		return annoPratica;
	}

	public void setAnnoPratica(String annoPratica) {
		this.annoPratica = annoPratica;
	}

	public String getbNumeroRicevuta() {
		return bNumeroRicevuta;
	}

	public void setbNumeroRicevuta(String bNumeroRicevuta) {
		this.bNumeroRicevuta = bNumeroRicevuta;
	}

	public String getbDataVersamento() {
		return bDataVersamento;
	}

	public void setbDataVersamento(String bDataVersamento) {
		this.bDataVersamento = bDataVersamento;
	}

	public Double getImportoMassimo() {
		return importoMassimo;
	}

	public void setImportoMassimo(Double importoMassimo) {
		this.importoMassimo = importoMassimo;
	}

	public String getPgmenIndirizzo2() {
		return pgmenIndirizzo2;
	}

	public void setPgmenIndirizzo2(String pgmenIndirizzo2) {
		this.pgmenIndirizzo2 = pgmenIndirizzo2;
	}

	public Double getDispOneriAccessori() {
		return dispOneriAccessori;
	}

	public void setDispOneriAccessori(Double dispOneriAccessori) {
		this.dispOneriAccessori = dispOneriAccessori;
	}

	public Double getIlegImporto() {
		return ilegImporto;
	}

	public void setIlegImporto(Double ilegImporto) {
		this.ilegImporto = ilegImporto;
	}

	public Date getDispDataEsecuzione() {
		return dispDataEsecuzione;
	}

	public void setDispDataEsecuzione(Date dispDataEsecuzione) {
		this.dispDataEsecuzione = dispDataEsecuzione;
	}

	public Date getDispDataScadenza() {
		return dispDataScadenza;
	}

	public void setDispDataScadenza(Date dispDataScadenza) {
		this.dispDataScadenza = dispDataScadenza;
	}

	@Override
	public String toString() {
		return "IstanzaFlussoTable{" +
				"idFlusso=" + idFlusso +
				", idIstanza=" + idIstanza +
				", flErrore='" + flErrore + '\'' +
				", codiceErrore='" + codiceErrore + '\'' +
				", descrizioneErrore='" + descrizioneErrore + '\'' +
				", codiceFiscale='" + codiceFiscale + '\'' +
				", ragioneSociale='" + ragioneSociale + '\'' +
				", numeroPratica='" + numeroPratica + '\'' +
				", modalitaRimborso='" + modalitaRimborso + '\'' +
				", codiceIban='" + codiceIban + '\'' +
				", indirizzo='" + indirizzo + '\'' +
				", importoPagamentoIleg=" + importoPagamentoIleg +
				", pgmenBic='" + pgmenBic + '\'' +
				", targa='" + targa + '\'' +
				", annoPratica='" + annoPratica + '\'' +
				", bNumeroRicevuta='" + bNumeroRicevuta + '\'' +
				", bDataVersamento='" + bDataVersamento + '\'' +
				", importoMassimo=" + importoMassimo +
				", pgmenIndirizzo2='" + pgmenIndirizzo2 + '\'' +
				", dispOneriAccessori=" + dispOneriAccessori +
				", ilegImporto=" + ilegImporto +
				", dispDataEsecuzione=" + dispDataEsecuzione +
				", dispDataScadenza=" + dispDataScadenza +
				'}';
	}
}