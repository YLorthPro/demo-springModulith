package fr.ylorthioir.demomodulith.borrow.domain.service;

import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;
import fr.ylorthioir.demomodulith.borrow.domain.factory.BorrowFactory;
import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;

import java.util.Optional;
import java.util.UUID;

public class BorrowDomainService {
    private final BorrowDomainRepository borrowDomainRepository;

    public BorrowDomainService(BorrowDomainRepository borrowDomainRepository) {
        this.borrowDomainRepository = borrowDomainRepository;
    }
    
    public void borrowBook(UUID bookId) {
        Borrow borrow = BorrowFactory.build(bookId);
        borrowDomainRepository.save(borrow);
    }
    
    public Optional<Borrow> findById(UUID id) {
        return borrowDomainRepository.findById(id);
    }
    
    public void returnBook(UUID id) {
        Borrow borrow = findById(id).orElseThrow(RuntimeException::new);
        borrow.isReturned();
        borrowDomainRepository.save(borrow);
    }
}
