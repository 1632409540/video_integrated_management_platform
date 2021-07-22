package com.zerui.videoplatform.api;

import com.zerui.videoplatform.entity.Organization;

import java.util.List;

public interface ApiOrganizationService {

     int addOrganization(Organization organization);

     List<Organization> findAll();
}
