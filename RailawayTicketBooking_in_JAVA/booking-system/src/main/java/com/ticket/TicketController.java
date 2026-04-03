package com.ticket.bookingsystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class TicketController {

  private final List<Ticket> tickets = new ArrayList<>();

  @GetMapping("/")
  public String index(@RequestParam(required = false) String keyword, Model model) {
    List<Ticket> filteredTickets = tickets;
    if (keyword != null && !keyword.isEmpty()) {
      String lowerCaseKeyword = keyword.toLowerCase();
      filteredTickets = tickets.stream()
          .filter(t -> t.name().toLowerCase().contains(lowerCaseKeyword) ||
              t.from().toLowerCase().contains(lowerCaseKeyword) ||
              t.to().toLowerCase().contains(lowerCaseKeyword))
          .toList();
    }
    model.addAttribute("tickets", filteredTickets);
    model.addAttribute("ticket", new Ticket(null, null, null, null, null));
    model.addAttribute("keyword", keyword);
    return "Index";
  }

  @PostMapping("/book")
  public String bookTicket(@Valid Ticket ticket, BindingResult result, Model model) {
    if (result.hasErrors()) {
      model.addAttribute("tickets", tickets);
      return "Index";
    }
    tickets.add(new Ticket(UUID.randomUUID(), ticket.name(), ticket.age(), ticket.from(), ticket.to()));
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String deleteTicket(@PathVariable UUID id) {
    tickets.removeIf(t -> t.id().equals(id));
    return "redirect:/";
  }
}