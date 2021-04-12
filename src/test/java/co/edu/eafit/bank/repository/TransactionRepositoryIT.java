package co.edu.eafit.bank.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.eafit.bank.domain.Transaction;
import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j
class TransactionRepositoryIT {

	@Autowired
	TransactionRepository transactionRepository;
	
	
	@Test
	void findAll() {

		// Arrange
			List<Transaction> transactions = null;
		
		//Act
			transactions = transactionRepository.findAll();
		
		//Assert
			assertNotNull(transactions);
			assertFalse(transactions.isEmpty());
			
		// No debería hacer esto
			transactions.forEach(transaction ->{
				log.info(String.valueOf(transaction.getTranId()));
			});
	}
}
