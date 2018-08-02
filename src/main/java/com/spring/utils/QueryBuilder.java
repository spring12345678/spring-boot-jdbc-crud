package com.spring.utils;

public class QueryBuilder {
	public static final String INSERT = "INSERT INTO TBL_EMPLOYEE(FIRST-NAME,LAST-NAME,DOJ,AGE,SAL,DEPTNO) VALUES(?,?,?,?,?)";

	public static final String SELECT_BY_ID = "SELECT * FROM TBL_EMPLOYEE WHERE ID=?";

	public static final String SELECT_ALL = "SELECT * FROM TBL_EMPLOYEE";

	public static final String UPDATE_SOURCE_BY_ID = "UPDATE TBL_EMPLOYEE SET FIRST-NAME="pallavi",LAST-NAME="Nayak",DOJ="21.JUNE.2018",AGE=23,SAL=23k,DEPTNO="121" WHERE ID=1";

	public static final String UPDATE_SEAT_NUM_BY_ID = "UPDATE TBL_EMPLOYEE SET FIRST-NAME="PALLAVI" WHERE ID=1;

	public static final String DELETE_BY_ID = "DELETE TBL_EMPLOYEE WHERE ID=1";

	public static final String DELETE_ALL = "DELETE TBL_EMPLOYEE";

}
