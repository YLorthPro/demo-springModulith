package fr.ylorthioir.demomodulith.borrow.infrastructure.persistence;

import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;
import fr.ylorthioir.demomodulith.borrow.domain.repository.BorrowDomainRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class BorrowPostgresRepository implements BorrowDomainRepository {
    
    private final BorrowSpringDataRepository borrowSpringDataRepository;

    public BorrowPostgresRepository(BorrowSpringDataRepository borrowSpringDataRepository) {
        this.borrowSpringDataRepository = borrowSpringDataRepository;
    }

    @Override
    public Borrow save(Borrow borrow) {
        return borrowSpringDataRepository.save(borrow);
    }

    @Override
    public Optional<Borrow> findById(UUID id) {
        return borrowSpringDataRepository.findById(id);
    }
}
