package learnJava.service;

public interface PaymentService {
	public void pay(); //tanpa body
	public void register();
	
//	dengan body
	default void cancel(String payment) {
		System.out.println("default method untuk");
		System.out.println(payment);
		PaymentService.failed();
	}
	
	static void failed() {
		System.out.println("payment gagal");
	}
}
