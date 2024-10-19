package fr.ylorthioir.demomodulith.borrow.infrastructure.persistence;

import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BorrowSpringDataRepository extends JpaRepository<Borrow, UUID> {
}
