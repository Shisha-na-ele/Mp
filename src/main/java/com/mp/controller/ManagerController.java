package com.mp.controller;

import com.mp.dao.ManagerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    private final ManagerDao managerDao;

    @Autowired
    public ManagerController(ManagerDao managerDao) {
        this.managerDao = managerDao;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("AllManager", managerDao.index());
        return "Manager/index";
    }
}
