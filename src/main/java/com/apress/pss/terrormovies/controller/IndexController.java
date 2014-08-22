package com.apress.pss.terrormovies.controller;

import com.apress.pss.terrormovies.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 14-8-22.
 */
@Controller
@RequestMapping("")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView showIndex() {
        ModelAndView mv = new ModelAndView("index");
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Study Oversea 1"));
        products.add(new Product("Study Oversea 2"));
        products.add(new Product("Study Oversea 3"));
        products.add(new Product("Study Oversea 4"));
        products.add(new Product("Study Oversea 5"));
        mv.addObject("products", products);
        return mv;
    }
}
