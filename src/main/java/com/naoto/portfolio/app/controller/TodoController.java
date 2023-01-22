package com.naoto.portfolio.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naoto.portfolio.domain.todos.model.Todo;
import com.naoto.portfolio.infrastructure.todos.TodoMapper;



@Controller

public class TodoController {

    @Autowired
    TodoMapper todoMapper;

    @RequestMapping(value = "/todos")
    public String index(Model model) {
        List<Todo> list = todoMapper.selectAll();
        model.addAttribute("todos", list);
        return "todos/index";
    }

    @RequestMapping(value= "/add")
    public String add(Todo todo) {
        todoMapper.add(todo);
        return "redirect:/todos" ;
    }
}
