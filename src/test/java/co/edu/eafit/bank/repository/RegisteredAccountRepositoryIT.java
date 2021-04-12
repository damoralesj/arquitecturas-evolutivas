package co.edu.eafit.bank.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.eafit.bank.domain.RegisteredAccount;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class RegisteredAccountRepositoryIT {

	@Autowired
	RegisteredAccountRepository registeredAccountRepository;
	
	
	@Test
	void findAll() {

		// Arrange
			List<RegisteredAccount> registeredAccounts = null;
		
		//Act
			registeredAccounts = registeredAccountRepository.findAll();
		
		//Assert
			assertNotNull(registeredAccounts);
			assertFalse(registeredAccounts.isEmpty());
			
		// No debería hacer esto
			registeredAccounts.forEach(regAccount ->{
				log.info(String.valueOf(regAccount.getReacId()));
			});
	}
}
