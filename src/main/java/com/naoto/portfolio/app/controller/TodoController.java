package com.naoto.portfolio.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.naoto.portfolio.app.service.TodoService;
import com.naoto.portfolio.domain.todos.model.Todo;




@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public String index(Model model) {
        List<Todo> list = todoService.selectIncomplete();
        List<Todo> doneList = todoService.selectComplete();
        model.addAttribute("todos", list);
        model.addAttribute("doneTodos",doneList);
        return "todos/index";
    }

   

    @PostMapping("/add")
    public String add(@ModelAttribute Todo todo) {
        todoService.add(todo);;
        return "redirect:/todos" ;
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Todo todo) {
        todoService.update(todo);
        return "redirect:/todos";
    }

    @PostMapping("/delete")
    public String delete() {
        todoService.delete();
        return "redirect:/todos";
    }
}
