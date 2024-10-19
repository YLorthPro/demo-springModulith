package fr.ylorthioir.demomodulith.borrow.infrastructure.config.beans.application.service;

import fr.ylorthioir.demomodulith.borrow.application.mapper.BorrowApplicationMapper;
import fr.ylorthioir.demomodulith.borrow.application.port.out.BookOutputPort;
import fr.ylorthioir.demomodulith.borrow.application.service.BorrowApplicationService;
import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;
import org.springframework.stereotype.Component;

@Component
public class BorrowSpringApplicationService extends BorrowApplicationService {
    public BorrowSpringApplicationService(BookOutputPort bookOutputPort, BorrowDomainRepository borrowDomainRepository, BorrowApplicationMapper borrowApplicationMapper) {
        super(bookOutputPort, borrowDomainRepository, borrowApplicationMapper);
    }
}
