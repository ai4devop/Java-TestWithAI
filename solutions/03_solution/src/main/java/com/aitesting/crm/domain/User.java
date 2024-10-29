package com.aitesting.crm.domain;

import com.aitesting.crm.enums.RoleEnum;

public record User(Long id, String name, String phoneNumber, RoleEnum role) {

}
