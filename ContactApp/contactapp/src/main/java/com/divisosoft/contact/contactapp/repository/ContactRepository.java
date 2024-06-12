package com.divisosoft.contact.contactapp.repository;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.divisosoft.contact.contactapp.model.Contact;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ContactRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public ContactRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final class ContactRowMapper implements RowMapper<Contact> {
        @Override
        public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
            Contact contact = new Contact();
            contact.setId(rs.getInt("id"));
            contact.setName(rs.getString("name"));
            contact.setEmail(rs.getString("email"));
            contact.setPhone(rs.getString("phone"));
            return contact;
        }
    }

    public List<Contact> findAll() {
        String sql = "SELECT * FROM contact";
        return jdbcTemplate.query(sql, new ContactRowMapper());
    }

    public Contact findById(int id) {
        String sql = "SELECT * FROM contact WHERE id = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return jdbcTemplate.queryForObject(sql, params, new ContactRowMapper());
    }

    public void save(Contact contact) {
        String sql = "INSERT INTO contact (name, email, phone) VALUES (:name, :email, :phone)";
        Map<String, Object> params = new HashMap<>();
        params.put("name", contact.getName());
        params.put("email", contact.getEmail());
        params.put("phone", contact.getPhone());
        jdbcTemplate.update(sql, params);
    }

    public void update(Contact contact) {
        String sql = "UPDATE contact SET name = :name, email = :email, phone = :phone WHERE id = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id", contact.getId());
        params.put("name", contact.getName());
        params.put("email", contact.getEmail());
        params.put("phone", contact.getPhone());
        jdbcTemplate.update(sql, params);
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM contact WHERE id = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        jdbcTemplate.update(sql, params);
    }
}
