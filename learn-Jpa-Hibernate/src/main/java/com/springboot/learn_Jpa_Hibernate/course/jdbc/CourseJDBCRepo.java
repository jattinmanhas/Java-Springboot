package com.springboot.learn_Jpa_Hibernate.course.jdbc;

import com.springboot.learn_Jpa_Hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo {
    @Autowired
    private JdbcTemplate springJDBCTemplate;

    private static String insertQuery = """
                Insert into course(id, name, author) values
                (?, ?, ?);
            """;

    private static String deleteQuery = """
             Delete from course where id = ?;
             """;

    public static String selectQuery = """
            Select * from course where id = ?
            """;

    public void insert(Course course){
        springJDBCTemplate.update(insertQuery, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id){
        springJDBCTemplate.update(deleteQuery, id);
    }

    public Course findById(long id){
        // Result set -> bean mapping => RowMappers => BeanPropertyRowMapper<>(class name)
        return springJDBCTemplate.queryForObject(selectQuery, new BeanPropertyRowMapper<>(Course.class), id);
    }


}
