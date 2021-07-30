package com.zerui.videoplatform.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.zerui.videoplatform.entity.Organization;
import com.zerui.videoplatform.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service(version = "1.0.0",loadbalance = "roundrobin")
public class ApiOrganizationImpl implements ApiOrganizationService{

    @Autowired
    private OrganizationService organizationService;

    @Override
    public int addOrganization(Organization organization) {
        return organizationService.addOrganization(organization);
    }

    @Override
    public List<Organization> findAll() {
        return organizationService.findAll();
    }
}
