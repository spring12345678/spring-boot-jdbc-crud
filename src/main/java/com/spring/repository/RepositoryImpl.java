package com.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.model.Ticket;
import com.spring.utils.QueryBuilder;

@Repository
public class RepositoryImpl implements ITicketRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createTicket(Ticket ticket) {
		return jdbcTemplate.update(QueryBuilder.INSERT,ticket.getTicketid(),ticket.getFromcity(),ticket.getTocity(),ticket.getSeatnum());
	}

	@Override
	public int updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryBuilder.UPDATE_SEAT_NUM_BY_ID,ticket.getSeatnum(),ticket.getTicketid());
	}

	@Override
	public List<Ticket> selectAll() {
		RowMapper<Ticket> rm=new TicketRowMapper();
		return jdbcTemplate.query(QueryBuilder.SELECT_ALL,rm);
		
	}

	@Override
	public Ticket selectTicketById(int id) {
		RowMapper<Ticket> rm=new TicketRowMapper();
		
		return jdbcTemplate.queryForObject(QueryBuilder.SELECT_BY_ID,new Object[] {id},rm);
	}

	@Override
	public int deleteTicketById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryBuilder.DELETE_BY_ID,id);
	}

	@Override
	public int deleteAllTickets() {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(QueryBuilder.DELETE_ALL);
	}

	
	}

	


