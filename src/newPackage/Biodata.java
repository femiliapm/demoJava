package newPackage;

//subclass - child : Biodata
public class Biodata extends Parent {
	public String myBiodata(String nama) {
		return nama;
	}

	public String panggilAlamat(String alamat) {
		return alamat;
	}

	public static void main(String[] args) {
		Biodata biodata = new Biodata();
		System.out.println(biodata.myBiodata("Femilia"));
		System.out.println(biodata.panggilNama("Putri"));
		biodata.setAlamat("Jakarta");
		System.out.println(biodata.getAlamat());
	}
}
