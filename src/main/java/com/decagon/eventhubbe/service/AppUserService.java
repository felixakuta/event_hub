package com.decagon.eventhubbe.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface AppUserService {
    UserDetails loadUserByUsername(String username);
}