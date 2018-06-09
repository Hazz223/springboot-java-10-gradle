package com.harry.winser.spring.boot.java.biscuit.service;

import com.harry.winser.spring.boot.java.biscuit.domain.Biscuit;
import com.harry.winser.spring.boot.java.biscuit.domain.BiscuitDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

public class BiscuitServiceImpl implements BiscuitService {

    private final BiscuitDao biscuitDao;

    @Autowired
    public BiscuitServiceImpl(BiscuitDao biscuitDao) {
        this.biscuitDao = biscuitDao;
    }

    @Override
    public Set<BiscuitDto> getAllBiscuits() {

        return this.biscuitDao.finalAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toSet());
    }

    private BiscuitDto convertToDto(Biscuit source){
        return BiscuitDto.builder()
                .withGuid(source.getGuid())
                .withName(source.getName())
                .withDescription(source.getDescription())
                .build();
    }

}
