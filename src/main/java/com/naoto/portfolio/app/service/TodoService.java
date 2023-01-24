package com.naoto.portfolio.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naoto.portfolio.domain.todos.model.Todo;
import com.naoto.portfolio.infrastructure.todos.TodoMapper;

@Service
public class TodoService {
    
    @Autowired
    private TodoMapper todoMapper;

    public List<Todo> selectAll() {
        return todoMapper.selectAll();
    }

    public List<Todo> selectIncomplete() {
        return todoMapper.selectIncomplete();
    }

    public List<Todo> selectComplete() {
        return todoMapper.selectComplete();
    }

    public void add(Todo todo) {
        todoMapper.add(todo);
    }

    public void update(Todo todo) {
        todoMapper.update(todo);
    }

    public void delete() {
        todoMapper.delete();
    }
}
