package fr.ylorthioir.demomodulith.borrow.infrastructure.api.rest;

import fr.ylorthioir.demomodulith.borrow.application.dto.response.BorrowDTO;
import fr.ylorthioir.demomodulith.borrow.application.mapper.BorrowApplicationMapper;
import fr.ylorthioir.demomodulith.borrow.application.port.in.BorrowInputPort;
import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;
import fr.ylorthioir.demomodulith.borrow.domain.service.BorrowDomainService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BorrowRestInputAdapter extends BorrowInputPort {

    public BorrowRestInputAdapter(BorrowDomainService borrowDomainService, BorrowApplicationMapper borrowApplicationMapper, BorrowDomainRepository borrowDomainRepository) {
        super(borrowDomainService, borrowApplicationMapper, borrowDomainRepository);
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @GetMapping("/borrows/{id}")
    public BorrowDTO findById(@PathVariable UUID id) {
        return super.findById(id);
    }
}
