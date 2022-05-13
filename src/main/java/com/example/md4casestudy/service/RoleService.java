package com.example.md4casestudy.service;

import com.example.md4casestudy.model.user.AppRole;

public interface RoleService extends GeneralService<AppRole> {
    AppRole findByName(String name);
}
