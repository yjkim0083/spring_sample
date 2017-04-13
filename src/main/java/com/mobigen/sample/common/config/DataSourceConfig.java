package com.mobigen.sample.common.config;

import java.util.Properties;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Lazy
@EnableTransactionManagement
@MapperScan(basePackages = {"com.mobigen.sample.dao"})
@PropertySource("classpath:property/db.properties")
public class DataSourceConfig {
	
	@Bean(destroyMethod = "close")
	public HikariDataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setJdbcUrl("jdbc:sqlite:sample.db");
		
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		System.out.println("=======================================");
//		System.out.println("Create Tables");
//		System.out.println("=======================================");
//		jdbcTemplate.execute("drop table users if exsits");
//		jdbcTemplate.execute("create table users(id serial, firstName varchar(255), lastName varchar(255), email varchar(255))");
//		jdbcTemplate.update("INSERT INTO users(firstName, lastName, email) values (?,?,?)", "Mike", "Lanyon", "lanyonm@gmail.com");
				
		return dataSource;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("classpath:/sqlMap/mappers/*.xml"));
        sessionFactory.setTypeAliasesPackage("com.mobigen.sample.domain");
        return sessionFactory;
    }
	
	@Bean
	public SqlSessionTemplate sqlSession() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory().getObject());
	}

}
