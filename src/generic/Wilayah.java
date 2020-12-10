package generic;

public class Wilayah {
	private String provinsi;
	private String kabupaten;

	public Wilayah(String provinsi, String kabupaten) {
		super();
		this.provinsi = provinsi;
		this.kabupaten = kabupaten;
	}

	public String getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}

	public String getKabupaten() {
		return kabupaten;
	}

	public void setKabupaten(String kabupaten) {
		this.kabupaten = kabupaten;
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.provinsi + " - " + this.kabupaten;
//	}

}
