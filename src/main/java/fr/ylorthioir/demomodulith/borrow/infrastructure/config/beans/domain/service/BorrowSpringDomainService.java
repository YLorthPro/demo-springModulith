package fr.ylorthioir.demomodulith.borrow.infrastructure.config.beans.domain.service;

import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;
import fr.ylorthioir.demomodulith.borrow.domain.service.BorrowDomainService;
import org.springframework.stereotype.Component;

@Component
public class BorrowSpringDomainService extends BorrowDomainService {
    public BorrowSpringDomainService(BorrowDomainRepository borrowDomainRepository) {
        super(borrowDomainRepository);
    }
}
