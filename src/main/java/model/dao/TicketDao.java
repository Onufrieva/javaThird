package model.dao;

import model.dto.TicketListDto;
import model.entity.Schedule;
import model.entity.Ticket;

import java.util.List;

public interface TicketDao  extends GenericDao<Ticket> {
    int getLastId();
    List<TicketListDto> getUserTicketsPage(int offset, int userID);
    int countRows(int userID);

}
