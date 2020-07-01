package it.lispa.entges.frta.api.domain;

import java.util.List;

/**
 * 
 * classe Flusso estende FlussoTable (TGA7AT_FRTA_FLUSSO)
 */
public class Flusso extends FlussoTable{

	private Integer elaborateConSuccesso;
	private List<Istanza> istanze; //l'ho lasciata com'era, non so se serve
	private List<IstanzaFlusso> listaIstanzeErrore;
	private Integer numeroIstanze;
    //carica flusso frta
	private String x_err_buff,p_user;
	private Integer x_ret_code;

	public Integer getElaborateConSuccesso() {
		return elaborateConSuccesso;
	}

	public void setElaborateConSuccesso(Integer elaborateConSuccesso) {
		this.elaborateConSuccesso = elaborateConSuccesso;
	}

	public List<Istanza> getIstanze() {
		return istanze;
	}

	public void setIstanze(List<Istanza> istanze) {
		this.istanze = istanze;
	}

	public List<IstanzaFlusso> getListaIstanzeErrore() {
		return listaIstanzeErrore;
	}

	public void setListaIstanzeErrore(List<IstanzaFlusso> listaIstanzeErrore) {
		this.listaIstanzeErrore = listaIstanzeErrore;
	}

	public Integer getNumeroIstanze() {
		return numeroIstanze;
	}

	public void setNumeroIstanze(Integer numeroIstanze) {
		this.numeroIstanze = numeroIstanze;
	}

	public String getX_err_buff() {
		return x_err_buff;
	}

	public void setX_err_buff(String x_err_buff) {
		this.x_err_buff = x_err_buff;
	}

	public String getP_user() {
		return p_user;
	}

	public void setP_user(String p_user) {
		this.p_user = p_user;
	}

	public Integer getX_ret_code() {
		return x_ret_code;
	}

	public void setX_ret_code(Integer x_ret_code) {
		this.x_ret_code = x_ret_code;
	}

	@Override
	public String toString() {
		return "Flusso{" +
				"elaborateConSuccesso=" + elaborateConSuccesso +
				", istanze=" + istanze +
				", listaIstanzeErrore=" + listaIstanzeErrore +
				", numeroIstanze=" + numeroIstanze +
				", x_err_buff='" + x_err_buff + '\'' +
				", p_user='" + p_user + '\'' +
				", x_ret_code=" + x_ret_code +
				'}';
	}
}
