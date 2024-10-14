package com.br.mybatis.common.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class StringArrTypeHandler implements TypeHandler<String[]> {

	@Override
	public String[] getResult(ResultSet rs, String columnName) throws SQLException {
		
		/*
		 * 		db로 부터 조회된 컬럼값 뽑기		=>	원하는 타입으로 변환
		 * ResultSet객체.getXXX("컬럼명"|컬럼순번)
		 * 
		 * ResultSet객체.getString("interest")		=>			String[]
		 * 			"낚시,운동,게임"				=>	"낚시,운동,게임".split(",")
		 */
		
		String resultDB = rs.getString(columnName); // "낚시,운동,게임"		
		return resultDB == null ? null : resultDB.split(","); // ["낚시","운동","게임"]
	}

	@Override
	public String[] getResult(ResultSet rs, int columnIndex) throws SQLException {
		return null;
	}

	@Override
	public String[] getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return null;
	}

	@Override
	public void setParameter(PreparedStatement ps, int i, String[] parameter, JdbcType jdbcType) throws SQLException {
		/*
		 * int i <= 접근되는 위치의 홀더(?) 순번
		 * String[] parameter <= interest 필드값 (String[])
		 * 
		 * ps.setXXXX(홀더순번, 대체할값);
		 * 
		 * ps.setString(i, parameter값을 String으로 변환값)
		 */
		ps.setString(i, parameter==null ? null : String.join(",", parameter));
		
	}

}
