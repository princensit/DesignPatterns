package com.designpatterns.DAOAndMultipleDatabases.model;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public PersonDAO getPersonDAO() {
		return new OraclePersonDAO();
	}

	@Override
	public LogDAO getLogDAO() {
		return new OracleLogDAO();
	}

}
