package br.com.stefanini.projetojdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetojdbc.entity.Users;
import br.com.stefanini.projetojdbc.intefaces.UsersDao;

@Repository
public class UsersDaoImpl implements UsersDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public class UsersRowMapper  implements RowMapper<Users>{
		@Override
		public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
			Users user = new Users();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("noms"));
			user.setAge(rs.getInt("age"));
			return user;
		}	
	}
	
	@Override
	public int save(Users user) {
		return jdbcTemplate.update("insert into users (name,age) values (?,?)",
				user.getName(),
				user.getAge());
	}

	@Override
	public List<Users> findAll() {
		return jdbcTemplate.query("select * from users",new UsersRowMapper());
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Users findById(Integer code) {
		Object id = null;
		return jdbcTemplate.queryForObject(
				"select * from users where id=?", 
				new Object[] {id} ,
				(rs, rowNum)-> new Users(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("age")
						)
				);
	}

	public int update(Users user) {
		return jdbcTemplate.update("update users set name=?, age=? ",
				user.getName(),
				user.getAge(),
				user.getId());
	}
	
	public int delete(int id) {
		return jdbcTemplate.update("delete from users where id=?", id);
	}
}
