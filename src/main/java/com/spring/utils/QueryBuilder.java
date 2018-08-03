package com.spring.utils;

public class QueryBuilder {
	public static final String INSERT = "INSERT INTO TBL_TICKET(TICKETID,FROMCITY,TOCITY,SEATNUM) VALUES(?,?,?,?)";

	public static final String SELECT_BY_ID = "SELECT * FROM TBL_TICKET WHERE ID=?";

	public static final String SELECT_ALL = "SELECT * FROM TBL_TICKET";

	public static final String UPDATE_SOURCE_BY_ID = "UPDATE TBL_TICKET SET FROMCITY=?,TOCITY=?,SEATNUM=? WHERE ID=?";

	public static final String UPDATE_SEAT_NUM_BY_ID = "UPDATE TBL_TICKET SET SEATNUM=? WHERE ID=?";

	public static final String DELETE_BY_ID = "DELETE FROM TBL_TICKET WHERE ID=?";

	public static final String DELETE_ALL = "DELETE FROM TBL_TICKET";

}
