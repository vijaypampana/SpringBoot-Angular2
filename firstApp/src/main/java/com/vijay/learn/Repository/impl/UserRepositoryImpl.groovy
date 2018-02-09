package com.vijay.learn.Repository.impl

import com.vijay.learn.Repository.UserRepository
import com.vijay.learn.common.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository

import java.sql.ResultSet
import java.sql.SQLException

@Repository
class UserRepositoryImpl implements UserRepository {

    private JdbcTemplate jdbcTemplate

    @Autowired
    UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate
    }

    @Override
    void create(User user) {
        try {
            String sql = "Insert into users (id, firstName, lastName, DOB, userName, password, active ) values (?,?,?,?,?,?,?)"
            jdbcTemplate.update(sql, user.getId(), user.getFirstName(), user.getLastName(), user.getDOB(), user.getUserName(), user.getPassword(), true)
        } catch (Exception e) {
            e.printStackTrace()
        }
    }

    @Override
    List<User> getAll() {
        String sql = "SELECT id, firstName, lastName, DOB, userName FROM users where active=true"
        return jdbcTemplate.query(sql, new userMapper())
    }



    @Override
    void deleteUser(long id) {
        String sql = "Delete * from Users where id = ?"
        this.jdbcTemplate.update(sql,Long.valueOf(id))
    }

    @Override
    User getUser(long id) {
        return null
    }

    @Override
    void updateUser(long id, User user) {

    }
}

final class userMapper implements RowMapper<User>{

    @Override
    User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User()
        user.setId(resultSet.getString("id"))
        user.setFirstName(resultSet.getString("firstName"))
        user.setLastName(resultSet.getString("lasttName"))
        user.setDOB(resultSet.getString("DOB"))
        user.setUserName(resultSet.getString("userName"))
        return user
    }
}
