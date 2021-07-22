package com.zerui.videoplatform.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zerui.videoplatform.api.ApiOrganizationService;
import com.zerui.videoplatform.entity.Organization;
import com.zerui.videoplatform.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Reference(version = "1.0.0")
    private ApiOrganizationService apiOrganizationService;

    @Override
    public int addOrganization(Organization organization) {
        return apiOrganizationService.addOrganization(organization);
    }

    @Override
    public List<Organization> findAll() {
        return apiOrganizationService.findAll();
    }
}
