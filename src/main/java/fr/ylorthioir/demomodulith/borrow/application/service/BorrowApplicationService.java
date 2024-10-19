package fr.ylorthioir.demomodulith.borrow.application.service;

import fr.ylorthioir.demomodulith.borrow.application.mapper.BorrowApplicationMapper;
import fr.ylorthioir.demomodulith.borrow.application.port.out.BookOutputPort;
import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;
import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;

import java.util.UUID;

public class BorrowApplicationService {
    private final BookOutputPort bookOutputPort;
    private final BorrowDomainRepository borrowDomainRepository;
    private final BorrowApplicationMapper borrowApplicationMapper;

    public BorrowApplicationService(BookOutputPort bookOutputPort, BorrowDomainRepository borrowDomainRepository, BorrowApplicationMapper borrowApplicationMapper) {
        this.bookOutputPort = bookOutputPort;
        this.borrowDomainRepository = borrowDomainRepository;
        this.borrowApplicationMapper = borrowApplicationMapper;
    }

    public void bookReturned(UUID borrowId) {
        Borrow borrow = borrowDomainRepository.findById(borrowId).orElseThrow(()-> new RuntimeException());
        bookOutputPort.returnedBook(borrowApplicationMapper.toDto(borrow));
    }
}
