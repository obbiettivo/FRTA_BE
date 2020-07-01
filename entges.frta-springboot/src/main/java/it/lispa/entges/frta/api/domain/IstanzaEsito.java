package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 
 * classe IstanzaFlussoEsito
 *
 * TGA7AT_FRTA_FLUSSO_ESITO_IST
 *
 * 	<resultMap type="IstanzaEsito" id="istanzaEsito-map">
 * 		<id column="ID_FLUSSO"							property="idFlusso"/>
 * 		<id column="SEPA_ORNGL_MSG_ID"               	property="sepaOrnglMsgId"/>
 * 		<id column="SEPA_ORNGL_END_TO_END_ID"        	property="sepaOrgnlEndToEndId"/>
 * 		<result column="SEPA_TX_STS"                    property="sepaTxSts"/>
 * 		<result column="SEPA_ACCNT_SVCR_REF"            property="sepaAccntScrRef"/>
 * 		<result column="SEPA_ORD_VAL_DT"                property="sepaOrdValDt"/>
 * 		<result column="SEPA_BEN_VAL_DT"                property="sepaBenValDt"/>
 * 		<result column="SEPA_RSN_ORGTR_NM"              property="sepaRsnOrgtrNm"/>
 * 		<result column="SEPA_RSN_ORGTR_BIC_BEI"         property="sepaRsnOrgtrBicBei"/>
 * 		<result column="SEPA_RSN_CD"                    property="sepaRsnCd"/>
 * 		<result column="SEPA_RSN_PRTRY"                 property="sepaRsnPrtry"/>
 * 		<result column="SEPA_RSN_ADDTLINF"              property="sepaRsnAddtlinf"/>
 * 		<result column="FL_ERRORE"                      property="flErrore"/>
 * 		<result column="CD_ERRORE"                      property="cdErrore"/>
 * 		<result column="DS_ERRORE"                      property="dsErrore"/>
 * 		<result column="ID_ISTANZA"                     property="idIstanza"/>
 * 	</resultMap>
 *
 */
@Entity
@Table(name = "TGA7AT_FRTA_FLUSSO_ESITO_IST")
public class IstanzaEsito {

	@Id
	@Column(name = "ID_FLUSSO")
	private Long idFlusso;

	@Column(name = "SEPA_ORNGL_MSG_ID")
	private String sepaOrnglMsgId;
	@Column(name = "SEPA_ORNGL_END_TO_END_ID")
	private String sepaOrgnlEndToEndId;
	@Column(name = "SEPA_TX_STS")
	private String sepaTxSts;
	@Column(name = "SEPA_ACCNT_SVCR_REF")
	private String sepaAccntScrRef;
	@Column(name = "SEPA_ORD_VAL_DT")
	private Date sepaOrdValDt;
	@Column(name = "SEPA_BEN_VAL_DT")
	private Date sepaBenValDt;
	@Column(name = "SEPA_RSN_ORGTR_NM")
	private String sepaRsnOrgtrNm;
	@Column(name = "SEPA_RSN_ORGTR_BIC_BEI")
	private String sepaRsnOrgtrBicBei;
	@Column(name = "SEPA_RSN_CD")
	private String sepaRsnCd;
	@Column(name = "SEPA_RSN_PRTRY")
	private String sepaRsnPrtry;
	@Column(name = "SEPA_RSN_ADDTLINF")
	private String sepaRsnAddtlinf;
	@Column(name = "FL_ERRORE")
	private boolean flErrore;
	@Column(name = "CD_ERRORE")
	private String cdErrore;
	@Column(name = "DS_ERRORE")
	private String dsErrore;
	@Column(name = "ID_ISTANZA")
	private Integer idIstanza;

	public Long getIdFlusso() {
		return idFlusso;
	}

	public void setIdFlusso(Long idFlusso) {
		this.idFlusso = idFlusso;
	}

	public String getSepaOrnglMsgId() {
		return sepaOrnglMsgId;
	}

	public void setSepaOrnglMsgId(String sepaOrnglMsgId) {
		this.sepaOrnglMsgId = sepaOrnglMsgId;
	}

	public String getSepaOrgnlEndToEndId() {
		return sepaOrgnlEndToEndId;
	}

	public void setSepaOrgnlEndToEndId(String sepaOrgnlEndToEndId) {
		this.sepaOrgnlEndToEndId = sepaOrgnlEndToEndId;
	}

	public String getSepaTxSts() {
		return sepaTxSts;
	}

	public void setSepaTxSts(String sepaTxSts) {
		this.sepaTxSts = sepaTxSts;
	}

	public String getSepaAccntScrRef() {
		return sepaAccntScrRef;
	}

	public void setSepaAccntScrRef(String sepaAccntScrRef) {
		this.sepaAccntScrRef = sepaAccntScrRef;
	}

	public Date getSepaOrdValDt() {
		return sepaOrdValDt;
	}

	public void setSepaOrdValDt(Date sepaOrdValDt) {
		this.sepaOrdValDt = sepaOrdValDt;
	}

	public Date getSepaBenValDt() {
		return sepaBenValDt;
	}

	public void setSepaBenValDt(Date sepaBenValDt) {
		this.sepaBenValDt = sepaBenValDt;
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

	public boolean isFlErrore() {
		return flErrore;
	}

	public void setFlErrore(boolean flErrore) {
		this.flErrore = flErrore;
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

	public Integer getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(Integer idIstanza) {
		this.idIstanza = idIstanza;
	}

	@Override
	public String toString() {
		return "IstanzaEsito{" +
				"idFlusso=" + idFlusso +
				", sepaOrnglMsgId='" + sepaOrnglMsgId + '\'' +
				", sepaOrgnlEndToEndId='" + sepaOrgnlEndToEndId + '\'' +
				", sepaTxSts='" + sepaTxSts + '\'' +
				", sepaAccntScrRef='" + sepaAccntScrRef + '\'' +
				", sepaOrdValDt=" + sepaOrdValDt +
				", sepaBenValDt=" + sepaBenValDt +
				", sepaRsnOrgtrNm='" + sepaRsnOrgtrNm + '\'' +
				", sepaRsnOrgtrBicBei='" + sepaRsnOrgtrBicBei + '\'' +
				", sepaRsnCd='" + sepaRsnCd + '\'' +
				", sepaRsnPrtry='" + sepaRsnPrtry + '\'' +
				", sepaRsnAddtlinf='" + sepaRsnAddtlinf + '\'' +
				", flErrore=" + flErrore +
				", cdErrore='" + cdErrore + '\'' +
				", dsErrore='" + dsErrore + '\'' +
				", idIstanza=" + idIstanza +
				'}';
	}
}
