package fr.ylorthioir.demomodulith.borrow.application.port.in;

import fr.ylorthioir.demomodulith.borrow.application.dto.response.BorrowDTO;
import fr.ylorthioir.demomodulith.borrow.application.mapper.BorrowApplicationMapper;
import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;
import fr.ylorthioir.demomodulith.borrow.domain.service.BorrowDomainService;

import java.util.UUID;

public class BorrowInputPort {
    private final BorrowDomainService borrowDomainService;
    private final BorrowApplicationMapper borrowApplicationMapper;
    private final BorrowDomainRepository borrowDomainRepository;

    public BorrowInputPort(BorrowDomainService borrowDomainService, BorrowApplicationMapper borrowApplicationMapper, BorrowDomainRepository borrowDomainRepository) {
        this.borrowDomainService = borrowDomainService;
        this.borrowApplicationMapper = borrowApplicationMapper;
        this.borrowDomainRepository = borrowDomainRepository;
    }
    
    public BorrowDTO findById(UUID id) {
        return borrowApplicationMapper.toDto(borrowDomainRepository.findById(id).orElseThrow(RuntimeException::new));
    }
    
    public void borrowBook(UUID bookId) {
        borrowDomainService.borrowBook(bookId);
    }
    
    public void returnedBook(UUID id) {
        borrowDomainService.returnBook(id);
    }
}
