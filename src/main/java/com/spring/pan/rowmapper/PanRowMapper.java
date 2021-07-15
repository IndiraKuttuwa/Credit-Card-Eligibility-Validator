package com.spring.pan.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.pan.entity.Pan;

public class PanRowMapper implements RowMapper<Pan> {

	@Override
	public Pan mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pan pan = new Pan();
		pan.setPan(rs.getString("pan"));
		pan.setScore(rs.getFloat("score"));
		return pan;
	}

}
