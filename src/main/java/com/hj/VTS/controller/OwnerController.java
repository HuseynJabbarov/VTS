package com.hj.VTS.controller;

import com.hj.VTS.dto.OwnerDto;
import com.hj.VTS.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OwnerController {
    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/owners")
    public String listOwners(Model model) {
        List<OwnerDto> owners = ownerService.findAllClubs();
        model.addAttribute("owners", owners);
        return "owners-list";
    }
}
