package com.br.mybatis.common.template;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {

	/*
	 * 기존의 JDBCTemplate
	 * 
	 * public static Connection getConnection() {
	 * 		driver.properties 파일 읽어들이면서
	 * 		해당 db와 접속된 Connection 생성해서 반환
	 * }
	 * 
	 * public static void close(JDBC용 객체) {
	 * 		전달받은 JDBC용 객체를 반납시키는 구문
	 * }
	 * 
	 * public static void commit|rollback(Connection 객체) {
	 * 		트랜잭션 처리
	 * }
	 */
	
	public static SqlSession getSqlSession() {
		// mybatis-config.xml 파일 읽어들여서
		// 해당 db와 접속된 SqlSession 객체 생성해서 반환
		
		SqlSession sqlSession = null;
		
		try {
			InputStream inputStream = Resources.getResourceAsStream("config/mybatis-config.xml");
			sqlSession = new SqlSessionFactoryBuilder().build(inputStream).openSession(false);
			// openSession의 false : auto commit을 안하겠다는 의미
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSession;
	}
	
}
