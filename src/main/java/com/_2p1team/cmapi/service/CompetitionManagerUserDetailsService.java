package com._2p1team.cmapi.service;

import com._2p1team.cmapi.model.UserPrincipal;
import com._2p1team.cmapi.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CompetitionManagerUserDetailsService implements UserDetailsService {

    private UsersRepository repository;

    @Autowired
    public CompetitionManagerUserDetailsService(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new UserPrincipal(
            this.repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username "+username+" not found"))
        );
    }

}