package model.Services;

import java.time.LocalDate;

import model.Entities.Contract;
import model.Entities.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i = 1;i<=months;i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = paymentService.interest(basicQuota, i); 
			double fee = paymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate,quota));
		}

	}
}
