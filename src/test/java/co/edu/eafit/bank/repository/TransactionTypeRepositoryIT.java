package co.edu.eafit.bank.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.eafit.bank.domain.TransactionType;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class TransactionTypeRepositoryIT {

	@Autowired
	TransactionTypeRepository transactionTypeRepository;
	
	
	@Test
	void findAll() {

		// Arrange
			List<TransactionType> transactionTypes = null;
		
		//Act
			transactionTypes = transactionTypeRepository.findAll();
		
		//Assert
			assertNotNull(transactionTypes);
			assertFalse(transactionTypes.isEmpty());
			
		// No debería hacer esto
			transactionTypes.forEach(transactionType ->{
				log.info(String.valueOf(transactionType.getTrtyId()));
			});
	}
}
