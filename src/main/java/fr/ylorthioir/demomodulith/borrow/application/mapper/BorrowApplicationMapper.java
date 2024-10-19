package fr.ylorthioir.demomodulith.borrow.application.mapper;

import fr.ylorthioir.demomodulith.borrow.application.dto.response.BorrowDTO;
import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;

public interface BorrowApplicationMapper {
    BorrowDTO toDto(Borrow entity);
}
