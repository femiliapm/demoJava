package learnJava.service;

public class RegistrasiServiceImpl implements RegistrationService, PaymentService{

	@Override
	public void registrasi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void cancel() {
//		// TODO Auto-generated method stub
//		PaymentService.super.cancel();
//	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel(String payment) {
		// TODO Auto-generated method stub
		PaymentService.super.cancel(payment);
	}

	public static void main(String[] args) {
		RegistrasiServiceImpl rsi = new RegistrasiServiceImpl();
		rsi.cancel("payment dibatalkan");
	}
}
