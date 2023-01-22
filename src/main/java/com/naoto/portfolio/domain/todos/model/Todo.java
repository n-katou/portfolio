package com.naoto.portfolio.domain.todos.model;

import lombok.Data;


@Data

public class Todo {

    private int id;
    private String title;
    private int done_flg;
    private String time_limit;
    
}
