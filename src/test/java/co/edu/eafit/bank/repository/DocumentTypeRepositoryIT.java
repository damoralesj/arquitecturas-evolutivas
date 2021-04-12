package co.edu.eafit.bank.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.eafit.bank.domain.DocumentType;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class DocumentTypeRepositoryIT {

	@Autowired
	DocumentTypeRepository documentTypeRepository;
	
	
	@Test
	void findAll() {

		// Arrange
			List<DocumentType> documentTypes = null;
		
		//Act
			documentTypes = documentTypeRepository.findAll();
		
		//Assert
			assertNotNull(documentTypes);
			assertFalse(documentTypes.isEmpty());
			
		// No debería hacer esto
			documentTypes.forEach(docType ->{
				log.info(docType.getName());
			});
	}
}
