package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/***
 * TGA7AT_FRTA_ECO_BENEFICIARIO
 *
 *ID_SOGG_BEN	NUMBER
 * NOME	VARCHAR2(255 CHAR)
 * COGNOME	VARCHAR2(255 CHAR)
 * DATA_NASCITA	DATE
 * NAZIONE_NASCITA	VARCHAR2(255 CHAR)
 * ISTAT_PROVINCIA	VARCHAR2(255 CHAR)
 * ISTAT_COMUNE	VARCHAR2(255 CHAR)
 * SESSO	VARCHAR2(4 CHAR)
 * CF	VARCHAR2(16 CHAR)
 * TELEFONO	CHAR(100 CHAR)
 * EMAIL	VARCHAR2(255 CHAR)
 * PROV_RESIDENZA	VARCHAR2(255 CHAR)
 * COMUNE_RESIDENZA	VARCHAR2(255 CHAR)
 * INDIRIZZO	VARCHAR2(255 CHAR)
 * CAP	NUMBER(38,0)
 * RESIDENZA_NORM	CHAR(1 BYTE)
 * IBAN	VARCHAR2(100 CHAR)
 * IBAN_ESTERO	CHAR(1 BYTE)
 * BIC	VARCHAR2(100 CHAR)
 * RAGIONE_SOCIALE	VARCHAR2(255 CHAR)
 * FL_TIPO_SOGG	VARCHAR2(3 BYTE)
 * ID_ISTANZA	NUMBER
 * ***/

@Entity
@Table(name = "TGA7AT_FRTA_ECO_BENEFICIARIO")
public class BeneficiarioRimborsoTable {

	@Id
	@Column(name = "ID_SOGG_BEN")
	private Long idUtente;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "COGNOME")
	private String cognome;

	@Column(name = "DATA_NASCITA")
	private Date dataNascita;

	@Column(name = "NAZIONE_NASCITA")
	private String nazioneNascita;

	@Column(name = "ISTAT_PROVINCIA")
	private String istatProvincia;

	@Column(name = "ISTAT_COMUNE")
	private String istatComune;

	@Column(name = "SESSO")
	private String sesso;

	@Column(name = "CF")
	private String cf;

	@Column(name = "TELEFONO")
	private String telefono;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PROV_RESIDENZA")
	private String provResidenza;

	@Column(name = "COMUNE_RESIDENZA")
	private String comuneResidenza;

	@Column(name = "INDIRIZZO")
	private String Indirizzo;

	@Column(name = "CAP")
	private String cap;

	@Column(name = "RESIDENZA_NORM")
	private String residenzaNorm;

	@Column(name = "IBAN")
	private String iban;

	@Column(name = "IBAN_ESTERO")
	private boolean ibanEstero;

	@Column(name = "BIC")
	private String bic;

	@Column(name = "RAGIONE_SOCIALE")
	private String ragioneSociale;

	@Column(name = "FL_TIPO_SOGG")
	private String flTipoSogg;

	@Column(name = "ID_ISTANZA")
	private String idIstanza;

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getNazioneNascita() {
		return nazioneNascita;
	}

	public void setNazioneNascita(String nazioneNascita) {
		this.nazioneNascita = nazioneNascita;
	}

	public String getIstatProvincia() {
		return istatProvincia;
	}

	public void setIstatProvincia(String istatProvincia) {
		this.istatProvincia = istatProvincia;
	}

	public String getIstatComune() {
		return istatComune;
	}

	public void setIstatComune(String istatComune) {
		this.istatComune = istatComune;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvResidenza() {
		return provResidenza;
	}

	public void setProvResidenza(String provResidenza) {
		this.provResidenza = provResidenza;
	}

	public String getComuneResidenza() {
		return comuneResidenza;
	}

	public void setComuneResidenza(String comuneResidenza) {
		this.comuneResidenza = comuneResidenza;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getResidenzaNorm() {
		return residenzaNorm;
	}

	public void setResidenzaNorm(String residenzaNorm) {
		this.residenzaNorm = residenzaNorm;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public boolean isIbanEstero() {
		return ibanEstero;
	}

	public void setIbanEstero(boolean ibanEstero) {
		this.ibanEstero = ibanEstero;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getFlTipoSogg() {
		return flTipoSogg;
	}

	public void setFlTipoSogg(String flTipoSogg) {
		this.flTipoSogg = flTipoSogg;
	}

	public String getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(String idIstanza) {
		this.idIstanza = idIstanza;
	}


	@Override
	public String toString() {
		return "BeneficiarioRimborsoTable{" +
				"idUtente=" + idUtente +
				", nome='" + nome + '\'' +
				", cognome='" + cognome + '\'' +
				", dataNascita=" + dataNascita +
				", nazioneNascita='" + nazioneNascita + '\'' +
				", istatProvincia='" + istatProvincia + '\'' +
				", istatComune='" + istatComune + '\'' +
				", sesso='" + sesso + '\'' +
				", cf='" + cf + '\'' +
				", telefono='" + telefono + '\'' +
				", email='" + email + '\'' +
				", provResidenza='" + provResidenza + '\'' +
				", comuneResidenza='" + comuneResidenza + '\'' +
				", Indirizzo='" + Indirizzo + '\'' +
				", cap='" + cap + '\'' +
				", residenzaNorm='" + residenzaNorm + '\'' +
				", iban='" + iban + '\'' +
				", ibanEstero=" + ibanEstero +
				", bic='" + bic + '\'' +
				", ragioneSociale='" + ragioneSociale + '\'' +
				", flTipoSogg='" + flTipoSogg + '\'' +
				", idIstanza='" + idIstanza + '\'' +
				'}';
	}
}
