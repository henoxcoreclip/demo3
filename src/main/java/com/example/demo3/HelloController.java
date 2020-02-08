package com.example.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public List<Player> index() throws Exception {
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String uname = "root";
		String pass = "root";
		String query1 = "select demo.id,ename,team,points from demo join demo1 on demo.id=demo1.id order by points desc";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, uname, pass);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query1);

		List<Player> nameList = new ArrayList<>();
		while (resultSet.next()) {
			Player player = new Player(resultSet.getInt("id"), resultSet.getString("ename"),
					resultSet.getString("team"),resultSet.getInt("points"));
			nameList.add(player);
		}
		return nameList;
	}

}