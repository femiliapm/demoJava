package newPackage;

// Superclass - Parent : Inheritance
public class Parent {
	private String alamat;
	private String var;
	
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	protected String panggilNama(String nama) {
		return nama;
	}
}
