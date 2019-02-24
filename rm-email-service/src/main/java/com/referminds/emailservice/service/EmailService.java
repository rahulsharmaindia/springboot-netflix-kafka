package com.referminds.emailservice.service;

import com.referminds.emailservice.entity.dto.UserDto;

public interface EmailService {

    void sendSimpleMessage(UserDto input);
}
