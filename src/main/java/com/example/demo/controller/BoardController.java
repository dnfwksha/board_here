package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;
    @GetMapping("/")
    public String main(){
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String write(Board board){

        boardService.write(board);

        return "";
    }

    @GetMapping("/board/list")
    public String list(Model model){

        model.addAttribute("list", boardService.list());

        return "boardlist";
    }
}
