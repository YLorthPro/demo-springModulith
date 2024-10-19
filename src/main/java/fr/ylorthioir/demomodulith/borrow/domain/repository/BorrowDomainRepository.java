package fr.ylorthioir.demomodulith.borrow.domain.repository;

import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;

import java.util.Optional;
import java.util.UUID;

public interface BorrowDomainRepository {
    Borrow save(Borrow borrow);
    Optional<Borrow> findById(UUID id);
}
