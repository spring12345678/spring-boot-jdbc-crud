package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Ticket;

public class TicketRowMapper implements RowMapper<Ticket>{

	@Override
	public Ticket mapRow(ResultSet rs, int rn) throws SQLException {
		Ticket ticket=new Ticket();
		ticket.setTicketid(rs.getInt("TICKET_ID"));
		ticket.setFromcity(rs.getString("FROM_CITY"));
		ticket.setTocity(rs.getString("To_CITY"));
		ticket.setSeatnum(rs.getInt("SEAT_NUM"));
		return null;
	}

}
