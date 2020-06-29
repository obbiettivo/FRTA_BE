package it.lispa.entges.frta.api.domain;

/**
 * 
 * classe Allegato
 * 
 *
 */
public class Allegato {

	private Integer idAllegato;
	private byte[] fileAllegato;
	private String tipoAllegato;
	private Istanza istanza;
	private String filename;

	public Allegato() {
	}

	public Integer getIdAllegato() {
		return idAllegato;
	}

	public void setIdAllegato(Integer idAllegato) {
		this.idAllegato = idAllegato;
	}

	public String getTipoAllegato() {
		return tipoAllegato;
	}

	public void setTipoAllegato(String tipoAllegato) {
		this.tipoAllegato = tipoAllegato;
	}

	public byte[] getFileAllegato() {
		return fileAllegato;
	}

	public void setFileAllegato(byte[] fileAllegato) {
		this.fileAllegato = fileAllegato;
	}

	public Istanza getIstanza() {
		return istanza;
	}

	public void setIstanza(Istanza istanza) {
		this.istanza = istanza;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}