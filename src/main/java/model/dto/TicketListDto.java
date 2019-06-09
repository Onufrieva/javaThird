package model.dto;


import model.entity.Schedule;
import model.entity.Ticket;

public class TicketListDto {
    private Ticket ticket;
    private Schedule schedule;

    public TicketListDto(Ticket ticket, Schedule schedule) {
        this.ticket = ticket;
        this.schedule = schedule;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}