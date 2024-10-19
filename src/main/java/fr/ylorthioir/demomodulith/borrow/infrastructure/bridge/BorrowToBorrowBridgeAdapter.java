package fr.ylorthioir.demomodulith.borrow.infrastructure.bridge;

import fr.ylorthioir.demomodulith.book.application.port.out.BorrowOutputPort;
import fr.ylorthioir.demomodulith.borrow.infrastructure.internal.BorrowInternalInputAdapter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BorrowToBorrowBridgeAdapter implements BorrowOutputPort {
    
    private final BorrowInternalInputAdapter borrowInternalInputAdapter;
    
    public BorrowToBorrowBridgeAdapter(BorrowInternalInputAdapter borrowInternalInputAdapter) {
        this.borrowInternalInputAdapter = borrowInternalInputAdapter;
    }
    
    //Ici on map une entité du module Borrow vers un DTO pour le module Book s'il le faut, 
    //on peut donc avoir des imports d'un autre module mais de la couche applicative
    @Override
    public void borrowBook(UUID bookId) {
        borrowInternalInputAdapter.borrowBook(bookId);
    }
}
