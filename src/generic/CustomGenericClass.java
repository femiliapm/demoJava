package generic;

public class CustomGenericClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public CustomGenericClass() {

	}
	
	public static void main(String[] args) {
		CustomGenericClass<Integer> integer = new CustomGenericClass<>();
		CustomGenericClass<String> string = new CustomGenericClass<>();
		
		integer.setT(10);
		string.setT("ini dengan type string");
		
		System.out.println(integer.getT());
		System.out.println(string.getT());
	}
}
