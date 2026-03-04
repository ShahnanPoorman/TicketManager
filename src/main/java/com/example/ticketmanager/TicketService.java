package com.example.ticketmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(String name, String content){
        Ticket ticket = new Ticket(name, content);
        return ticketRepository.save(ticket);
    }

    public Ticket getTicketById(int id){
        return ticketRepository
                .findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    public Ticket updateTicketName(int id, String newName){
        Ticket ticket = ticketRepository
                .findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        ticket.setName(newName);
        return ticketRepository.save(ticket);
    }
    public Ticket updateTicketContent(int id, String newContent){
        Ticket ticket = ticketRepository
                .findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        ticket.setContent(newContent);
        return ticketRepository.save(ticket);
    }

    public void deleteTicket(int id){
        if (!ticketRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        ticketRepository.deleteById(id);
    }




}
