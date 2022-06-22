package com.example.controller;

import com.example.domain.reviewVo;
import com.example.repository.reviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class reviewController {

    @Autowired
    private reviewService reviewservice;

    @GetMapping("/")
    public ModelAndView reList() throws Exception {
        ModelAndView mav = new ModelAndView("list");
        List<reviewVo> reviewlist = reviewservice.reviewlist();
        mav.addObject("relist",reviewlist);

        return mav;
    }
}
