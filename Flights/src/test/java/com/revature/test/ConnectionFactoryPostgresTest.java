package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;


import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.util.ConnectionFactoryPostgres;

class ConnectionFactoryPostgresTest {
	
	@BeforeEach
	private void setUp() {
		
	}

	@Test
 public void test() throws ClassNotFoundException, SQLException {
		
		assertNotNull(ConnectionFactoryPostgres.getConnection(), "Connection to DB should be created.");
		
	}

}
