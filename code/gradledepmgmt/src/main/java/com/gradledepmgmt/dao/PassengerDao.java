package com.gradledepmgmt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PassengerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Object> getPassengers() {
		return jdbcTemplate.query("select fullname from passenger", (rs, rowNum) -> {
			List<String> passengerNames = new ArrayList<>();
			while (rs.next()) {
				passengerNames.add(rs.getString(1));
			}
			return passengerNames;
		});
	}
}
