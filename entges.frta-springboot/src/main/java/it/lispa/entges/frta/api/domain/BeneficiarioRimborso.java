package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/***
 BeneficiarioRimborso extends BeneficiarioRimborsoTable(TGA7AT_FRTA_ECO_BENEFICIARIO)
 *
 * ***/
public class BeneficiarioRimborso extends BeneficiarioRimborsoTable{

	private String civico;
	private String flpfpg;
	private String luogoNascita;

	public String getCivico() {
		return civico;
	}

	public void setCivico(String civico) {
		this.civico = civico;
	}

	public String getFlpfpg() {
		return flpfpg;
	}

	public void setFlpfpg(String flpfpg) {
		this.flpfpg = flpfpg;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	@Override
	public String toString() {
		return "BeneficiarioRimborso{" +
				"civico='" + civico + '\'' +
				", flpfpg='" + flpfpg + '\'' +
				", luogoNascita='" + luogoNascita + '\'' +
				'}';
	}
}
