package fr.ylorthioir.demomodulith.borrow.infrastructure.api.mapper;

import fr.ylorthioir.demomodulith.borrow.application.dto.response.BorrowDTO;
import fr.ylorthioir.demomodulith.borrow.application.mapper.BorrowApplicationMapper;
import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;
import org.springframework.stereotype.Component;

@Component
public class BorrowSpringMapper implements BorrowApplicationMapper {
    @Override
    public BorrowDTO toDto(Borrow entity) {
        return new BorrowDTO(entity.getId(), entity.getBookId(), entity.getBorrowDate(), entity.getReturnDate());
    }
}
