package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprring.repository.ITicketRepository;

@Repository
public class TicketServiceImpl implements ITicketService{
	@Autowired
	ITicketRepository repository;

}
