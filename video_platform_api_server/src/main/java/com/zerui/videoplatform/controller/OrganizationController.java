package com.zerui.videoplatform.controller;

import com.zerui.videoplatform.entity.Organization;
import com.zerui.videoplatform.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/organization")
@Controller
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping
    @ResponseBody
    public void addOrganization(@RequestBody @Validated Organization organization){
        organizationService.addOrganization(organization);
    }

    @ResponseBody
    @GetMapping
    public List<Organization> findAll(){
        return organizationService.findAll();
    }
}
