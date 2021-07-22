package com.zerui.videoplatform.service;

import com.zerui.videoplatform.entity.Organization;

import java.util.List;

public interface OrganizationService {

    int addOrganization(Organization organization);

    List<Organization> findAll();
}
