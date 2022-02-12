package com.min.edu.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * 환경설정 파일인 SqlMapConfig.xml(+Mapper) 파일을 읽어서 java 객체인 SqlSessionFactory객체를 만들어 줌
 * 입력해야 될 값이 많기 떄문에 xml을 통해서 작성한 후 IO를 통해서 읽어낸다
 * 웹시스템 CRUD가 기본이기 떄문에 static생성자를 통해서 실행 
 */
public class SqlSessionFactoryManager {

	private static SqlSessionFactory factory;
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
	static {
		//사용할 xml의 위치를 => IO읽은 메소드를 사용함 Resources
		String path = "com/min/edu/mybatis/SqlMapConfig.xml";
		//static 영역에서 작성하는 static 생성자기 떄문에 throw를 못함
		try {
			Reader reader = Resources.getResourceAsReader(path);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
