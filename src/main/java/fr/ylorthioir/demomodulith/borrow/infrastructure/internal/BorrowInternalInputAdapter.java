package fr.ylorthioir.demomodulith.borrow.infrastructure.internal;

import fr.ylorthioir.demomodulith.borrow.application.mapper.BorrowApplicationMapper;
import fr.ylorthioir.demomodulith.borrow.application.port.in.BorrowInputPort;
import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;
import fr.ylorthioir.demomodulith.borrow.domain.service.BorrowDomainService;
import org.springframework.stereotype.Component;

@Component
public class BorrowInternalInputAdapter extends BorrowInputPort {
    public BorrowInternalInputAdapter(BorrowDomainService borrowDomainService, BorrowApplicationMapper borrowApplicationMapper, BorrowDomainRepository borrowDomainRepository) {
        super(borrowDomainService, borrowApplicationMapper, borrowDomainRepository);
    }
}
