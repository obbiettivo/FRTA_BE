package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;

/**
 * 
 * classe Allegato
 *
 * table: TGA7AT_PDT_ALLEGATO
 *
 * ID_ALLEGATO	NUMBER
 * FILE_ALLEGATO	BLOB
 * TIPO_ALLEGATO	VARCHAR2(1 BYTE)
 * ID_ISTANZA	NUMBER
 * FILENAME	VARCHAR2(255 BYTE)
 *
 */
@Entity
@Table(name = "TGA7AT_PDT_ALLEGATO")
public class AllegatoTable {

	@Id
	@Column(name = "ID_ALLEGATO")
	private Long idAllegato;

	@Column(name = "FILE_ALLEGATO")
	private byte[] fileAllegato;

	@Column(name = "TIPO_ALLEGATO")
	private String tipoAllegato;
	
	@Column(name = "ID_ISTANZA")
	private Integer idIstanza;

	@Column(name = "FILENAME")
	private String filename;

	public Long getIdAllegato() {
		return idAllegato;
	}

	public void setIdAllegato(Long idAllegato) {
		this.idAllegato = idAllegato;
	}

	public byte[] getFileAllegato() {
		return fileAllegato;
	}

	public void setFileAllegato(byte[] fileAllegato) {
		this.fileAllegato = fileAllegato;
	}

	public String getTipoAllegato() {
		return tipoAllegato;
	}

	public void setTipoAllegato(String tipoAllegato) {
		this.tipoAllegato = tipoAllegato;
	}

	public Integer getIdIstanza() {
		return idIstanza;
	}

	public void setIdIstanza(Integer idIstanza) {
		this.idIstanza = idIstanza;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "AllegatoTable{" +
				"idAllegato=" + idAllegato +
				", fileAllegato=" + Arrays.toString(fileAllegato) +
				", tipoAllegato='" + tipoAllegato + '\'' +
				", idIstanza=" + idIstanza +
				", filename='" + filename + '\'' +
				'}';
	}
}