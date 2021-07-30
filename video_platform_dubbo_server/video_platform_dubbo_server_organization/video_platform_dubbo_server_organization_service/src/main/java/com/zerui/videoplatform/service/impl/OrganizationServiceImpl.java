package com.zerui.videoplatform.service.impl;

import com.zerui.videoplatform.common.BaseServiceImpl;
import com.zerui.videoplatform.entity.Organization;
import com.zerui.videoplatform.service.OrganizationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class OrganizationServiceImpl extends BaseServiceImpl<Organization> implements OrganizationService {

    @Override
    public int addOrganization(Organization organization) {
        int insert = baseMapper.insert(organization);
        System.out.println("Insert : "+ organization);
        return insert;
    }

    @Override
    public List<Organization> findAll() {
        List<Organization> organizations = baseMapper.selectList(null);
        System.out.println(organizations);
        return organizations;
    }
}
