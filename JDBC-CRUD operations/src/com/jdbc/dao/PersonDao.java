package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.controller.PersonController;
import com.jdbc.dto.PersonDto;

public class PersonDao {
	String driver = "com.mysql.cj.jdbc.Driver";
	String query = "jdbc:mysql://localhost:3306/jdbc-crud?user=root&password=Srisowmya@12";

	public int createTable() {
		try {
			Class.forName(driver);
			// while writing this statement use first void as return type bcoz try catch
			// will not show
			Connection connection = DriverManager.getConnection(query);
			Statement statement = connection.createStatement();// here we used statement interface bcoz we are not
																// passing any values in create table method so use
																// statement as it is static
			int res = statement.executeUpdate(
					"create table person(id int primary key,name varchar(45),age int,email varchar(45),password varchar(45))");
			connection.close();// as it is a non select query use eU
			return res;// as eU return type is int

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	public int insertValues(int id, String name, int age, String email, String password) {
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(query);
			PreparedStatement ps = connection.prepareStatement("insert into person values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, email);
			ps.setString(5, password);

			int res = ps.executeUpdate();
			connection.close();
			return res;

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return 0;

	}

	public List<PersonDto> getAll() {
		List<PersonDto> list = new ArrayList<PersonDto>();
		try {

			Class.forName(driver);
			Connection connection = DriverManager.getConnection(query);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from person");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				PersonDto person = new PersonDto();
				person.setId(id);
				person.setName(name);
				person.setAge(age);
				person.setEmail(email);
				person.setPassword(password);

				list.add(person);

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	public PersonDto getById(int id) {
		PersonDto person = new PersonDto();
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(query);
			PreparedStatement ps = connection.prepareStatement("select * from person where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				person.setId(rs.getInt(1));
				person.setName(rs.getString(2));
				person.setAge(rs.getInt(3));
				person.setEmail(rs.getString(4));
				person.setPassword(rs.getString(5));

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return person;

	}

	public void Update() {
		PersonDto person = new PersonDto();
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(query);
			PreparedStatement ps = connection.prepareStatement("update person set name='arunsai' where id=2");
			
			ps.executeUpdate();
			connection.close();
			

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		

	}
	
	public void deleteById(int id) {
		try {
			Class.forName(driver);
			Connection connection=DriverManager.getConnection(query);
			PreparedStatement ps=connection.prepareStatement("delete from person where id=1");
			ps.executeUpdate();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
