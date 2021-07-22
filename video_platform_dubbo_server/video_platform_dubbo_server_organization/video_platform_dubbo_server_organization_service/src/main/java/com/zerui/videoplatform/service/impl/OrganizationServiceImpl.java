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
        return baseMapper.insert(organization);
    }

    @Override
    public List<Organization> findAll() {
        return baseMapper.selectList(null);
    }
}
