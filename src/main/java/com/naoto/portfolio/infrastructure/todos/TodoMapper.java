package com.naoto.portfolio.infrastructure.todos;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.naoto.portfolio.domain.todos.model.Todo;

@Mapper
public interface TodoMapper {
    List<Todo> selectAll();
    List<Todo> selectIncomplete();
    List<Todo> selectComplete();
    void add(Todo todo);
    void update(Todo todo);
    void delete();
}
