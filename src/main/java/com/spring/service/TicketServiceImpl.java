package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.repository.ITicketRepository;

@Repository
public class TicketServiceImpl implements ITicketService{
	@Autowired
	ITicketRepository repository;

}
