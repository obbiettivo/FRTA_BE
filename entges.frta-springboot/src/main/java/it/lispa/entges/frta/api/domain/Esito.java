package it.lispa.entges.frta.api.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Date;

/**
 * 
 * classe FlussoEsito
 *
 *
 * <id column="ID_FLUSSO"						property="idFlussoEsito" />
 * 		<result column="NOME_FILE_RICEVUTO"			property="nomeFileRicevuto" />
 * 		<result column="TIPO"                       property="tipo" />
 * 		<result column="SEPA_MSG_ID"                property="sepaMsgId" />
 * 		<result column="SEPA_CRE_DT_TM"             property="sepaCreDtTm" />
 * 		<result column="SEPA_ORGNL_MSG_ID"          property="sepaOrgnlMsgId" />
 * 		<result column="SEPA_DTLD_NB_OF_TXS"        property="sepaDtldNbOfTxs" />
 * 		<result column="SEPA_DTLD_CTRL_SUM"         property="sepaDtldCrtlSum" />
 * 		<result column="SEPA_GRP_STS"               property="sepaGrpSts" />
 * 		<result column="SEPA_RNS_ORGTR_NM"          property="sepaRsnOrgtrNm"/>
 * 		<result column="SEPA_RSN_ORGTR_BIC_EI"      property="sepaRsnOrgtrBicBei" />
 * 		<result column="SEPA_RSN_CD"                property="sepaRsnCd" />
 * 		<result column="SEPA_RSN_PRTRY"             property="sepaRsnPrtry" />
 * 		<result column="SEPA_RSN_ADDTLINF"          property="sepaRsnAddtlinf" />
 * 		<result column="TS_CREAZIONE"               property="tsCreazione" />
 * 		<result column="TS_FINE_ELABORAZIONE"       property="tsFineElaborazione" />
 * 		<result column="DATI_FLUSSO"                property="datiFlussoEsito" />
 * 		<result column="STATO_FLUSSO"               property="statoFlussoEsito" />
 * 		<result column="CD_ERRORE"                  property="cdErrore" />
 * 		<result column="DS_ERRORE"                  property="dsErrore" />
 * 		<result column="NR_ELABORATE"               property="nrElaborate" />
 * 		<result column="NR_FALLITE"                 property="nrFallite" />
 * 		<result column="TIPO_RIMBORSO"              property="tipoRimborso" />
 *
 */
@Entity
@Table(name = "TGA7AT_FRTA_FLUSSO_ESITO")
public class Esito {

	@Id
	@Column(name = "ID_FLUSSO")
	private Long idFlussoEsito;

	@Column(name = "NOME_FILE_RICEVUTO")
	private String nomeFileRicevuto;

	@Column(name = "TIPO")
	private String tipo;

	@Column(name = "SEPA_MSG_ID")
	private String sepaMsgId;

	@Column(name = "SEPA_CRE_DT_TM")
	private Date sepaCreDtTm;

	@Column(name = "SEPA_ORGNL_MSG_ID")
	private String sepaOrgnlMsgId;

	@Column(name = "SEPA_DTLD_NB_OF_TXS")
	private Integer sepaDtldNbOfTxs;

	@Column(name = "SEPA_DTLD_CTRL_SUM")
	private Double sepaDtldCrtlSum;

	@Column(name = "SEPA_GRP_STS")
	private String sepaGrpSts;

	@Column(name = "SEPA_RNS_ORGTR_NM")
	private String sepaRsnOrgtrNm;

	@Column(name = "SEPA_RSN_ORGTR_BIC_BEI")
	private String sepaRsnOrgtrBicBei;

	@Column(name = "SEPA_RSN_CD")
	private String sepaRsnCd;

	@Column(name = "SEPA_RSN_PRTRY")
	private String sepaRsnPrtry;

	@Column(name = "SEPA_RSN_ADDTLINF")
	private String sepaRsnAddtlinf;

	@Column(name = "TS_CREAZIONE")
	private Date tsCreazione;

	@Column(name = "TS_FINE_ELABORAZIONE")
	private Date tsFineElaborazione;

	@Column(name = "DATI_FLUSSO")
	private byte[] datiFlussoEsito;

	@Column(name = "STATO_FLUSSO")
	private String statoFlussoEsito;

	@Column(name = "CD_ERRORE")
	private String cdErrore;

	@Column(name = "DS_ERRORE")
	private String dsErrore;

	@Column(name = "NR_ELABORATE")
	private Integer nrElaborate;

	@Column(name = "NR_FALLITE")
	private Integer nrFallite;

	@Column(name = "TIPO_RIMBORSO")
	private String tipoRimborso;

	public Long getIdFlussoEsito() {
		return idFlussoEsito;
	}

	public void setIdFlussoEsito(Long idFlussoEsito) {
		this.idFlussoEsito = idFlussoEsito;
	}

	public String getNomeFileRicevuto() {
		return nomeFileRicevuto;
	}

	public void setNomeFileRicevuto(String nomeFileRicevuto) {
		this.nomeFileRicevuto = nomeFileRicevuto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSepaMsgId() {
		return sepaMsgId;
	}

	public void setSepaMsgId(String sepaMsgId) {
		this.sepaMsgId = sepaMsgId;
	}

	public Date getSepaCreDtTm() {
		return sepaCreDtTm;
	}

	public void setSepaCreDtTm(Date sepaCreDtTm) {
		this.sepaCreDtTm = sepaCreDtTm;
	}

	public String getSepaOrgnlMsgId() {
		return sepaOrgnlMsgId;
	}

	public void setSepaOrgnlMsgId(String sepaOrgnlMsgId) {
		this.sepaOrgnlMsgId = sepaOrgnlMsgId;
	}

	public Integer getSepaDtldNbOfTxs() {
		return sepaDtldNbOfTxs;
	}

	public void setSepaDtldNbOfTxs(Integer sepaDtldNbOfTxs) {
		this.sepaDtldNbOfTxs = sepaDtldNbOfTxs;
	}

	public Double getSepaDtldCrtlSum() {
		return sepaDtldCrtlSum;
	}

	public void setSepaDtldCrtlSum(Double sepaDtldCrtlSum) {
		this.sepaDtldCrtlSum = sepaDtldCrtlSum;
	}

	public String getSepaGrpSts() {
		return sepaGrpSts;
	}

	public void setSepaGrpSts(String sepaGrpSts) {
		this.sepaGrpSts = sepaGrpSts;
	}

	public String getSepaRsnOrgtrNm() {
		return sepaRsnOrgtrNm;
	}

	public void setSepaRsnOrgtrNm(String sepaRsnOrgtrNm) {
		this.sepaRsnOrgtrNm = sepaRsnOrgtrNm;
	}

	public String getSepaRsnOrgtrBicBei() {
		return sepaRsnOrgtrBicBei;
	}

	public void setSepaRsnOrgtrBicBei(String sepaRsnOrgtrBicBei) {
		this.sepaRsnOrgtrBicBei = sepaRsnOrgtrBicBei;
	}

	public String getSepaRsnCd() {
		return sepaRsnCd;
	}

	public void setSepaRsnCd(String sepaRsnCd) {
		this.sepaRsnCd = sepaRsnCd;
	}

	public String getSepaRsnPrtry() {
		return sepaRsnPrtry;
	}

	public void setSepaRsnPrtry(String sepaRsnPrtry) {
		this.sepaRsnPrtry = sepaRsnPrtry;
	}

	public String getSepaRsnAddtlinf() {
		return sepaRsnAddtlinf;
	}

	public void setSepaRsnAddtlinf(String sepaRsnAddtlinf) {
		this.sepaRsnAddtlinf = sepaRsnAddtlinf;
	}

	public Date getTsCreazione() {
		return tsCreazione;
	}

	public void setTsCreazione(Date tsCreazione) {
		this.tsCreazione = tsCreazione;
	}

	public Date getTsFineElaborazione() {
		return tsFineElaborazione;
	}

	public void setTsFineElaborazione(Date tsFineElaborazione) {
		this.tsFineElaborazione = tsFineElaborazione;
	}

	public byte[] getDatiFlussoEsito() {
		return datiFlussoEsito;
	}

	public void setDatiFlussoEsito(byte[] datiFlussoEsito) {
		this.datiFlussoEsito = datiFlussoEsito;
	}

	public String getStatoFlussoEsito() {
		return statoFlussoEsito;
	}

	public void setStatoFlussoEsito(String statoFlussoEsito) {
		this.statoFlussoEsito = statoFlussoEsito;
	}

	public String getCdErrore() {
		return cdErrore;
	}

	public void setCdErrore(String cdErrore) {
		this.cdErrore = cdErrore;
	}

	public String getDsErrore() {
		return dsErrore;
	}

	public void setDsErrore(String dsErrore) {
		this.dsErrore = dsErrore;
	}

	public Integer getNrElaborate() {
		return nrElaborate;
	}

	public void setNrElaborate(Integer nrElaborate) {
		this.nrElaborate = nrElaborate;
	}

	public Integer getNrFallite() {
		return nrFallite;
	}

	public void setNrFallite(Integer nrFallite) {
		this.nrFallite = nrFallite;
	}

	public String getTipoRimborso() {
		return tipoRimborso;
	}

	public void setTipoRimborso(String tipoRimborso) {
		this.tipoRimborso = tipoRimborso;
	}

	@Override
	public String toString() {
		return "Esito{" +
				"idFlussoEsito=" + idFlussoEsito +
				", nomeFileRicevuto='" + nomeFileRicevuto + '\'' +
				", tipo='" + tipo + '\'' +
				", sepaMsgId='" + sepaMsgId + '\'' +
				", sepaCreDtTm=" + sepaCreDtTm +
				", sepaOrgnlMsgId='" + sepaOrgnlMsgId + '\'' +
				", sepaDtldNbOfTxs=" + sepaDtldNbOfTxs +
				", sepaDtldCrtlSum=" + sepaDtldCrtlSum +
				", sepaGrpSts='" + sepaGrpSts + '\'' +
				", sepaRsnOrgtrNm='" + sepaRsnOrgtrNm + '\'' +
				", sepaRsnOrgtrBicBei='" + sepaRsnOrgtrBicBei + '\'' +
				", sepaRsnCd='" + sepaRsnCd + '\'' +
				", sepaRsnPrtry='" + sepaRsnPrtry + '\'' +
				", sepaRsnAddtlinf='" + sepaRsnAddtlinf + '\'' +
				", tsCreazione=" + tsCreazione +
				", tsFineElaborazione=" + tsFineElaborazione +
				", datiFlussoEsito=" + Arrays.toString(datiFlussoEsito) +
				", statoFlussoEsito='" + statoFlussoEsito + '\'' +
				", cdErrore='" + cdErrore + '\'' +
				", dsErrore='" + dsErrore + '\'' +
				", nrElaborate=" + nrElaborate +
				", nrFallite=" + nrFallite +
				", tipoRimborso='" + tipoRimborso + '\'' +
				'}';
	}
}
