package it.lispa.entges.frta.api.domain;

public class IstanzaFlusso {

	private Flusso flusso;
	private Istanza istanza;
	private String flErrore;
	private String codiceErrore;
	private String descrizioneErrore;
	private String codiceFiscale;
	private String ragioneSociale;
	private String numeroPratica;
	private String modalitaRimborso;
	private String codiceIban;
	private String indirizzo;
	private Double importoPagamentoIleg;
	private Integer idIstanza;
	private String pgmenBic;

	//	private Integer annoPratica;

	public String getPgmenBic() {
		return pgmenBic;
	}

	public void setPgmenBic(String pgmenBic) {
		this.pgmenBic = pgmenBic;
	}

	public Integer getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(Integer idIstanza) {
		this.idIstanza = idIstanza;
	}

	public IstanzaFlusso() {
	}

	public Flusso getFlusso() {
		return flusso;
	}

	public void setFlusso(Flusso flusso) {
		this.flusso = flusso;
	}

	public Istanza getIstanza() {
		return istanza;
	}

	public void setIstanza(Istanza istanza) {
		this.istanza = istanza;
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

	//	public Integer getAnnoPratica() {
	//		return annoPratica;
	//	}
	//
	//	public void setAnnoPratica(Integer annoPratica) {
	//		this.annoPratica = annoPratica;
	//	}
}