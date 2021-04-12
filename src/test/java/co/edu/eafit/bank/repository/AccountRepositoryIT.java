package co.edu.eafit.bank.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.eafit.bank.domain.Account;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class AccountRepositoryIT {

	@Autowired
	AccountRepository accountRepository;
	
	
	@Test
	void findAll() {

		// Arrange
			List<Account> accounts = null;
		
		//Act
			accounts = accountRepository.findAll();
		
		//Assert
			assertNotNull(accounts);
			assertFalse(accounts.isEmpty());
			
		// No debería hacer esto
			accounts.forEach(account ->{
				log.info(account.getAccoId());
			});
	}
}
