package com.harry.winser.spring.boot.java.biscuit.service.internal;

import com.harry.winser.spring.boot.java.biscuit.dao.Biscuit;
import com.harry.winser.spring.boot.java.biscuit.dao.BiscuitDao;
import com.harry.winser.spring.boot.java.biscuit.service.BiscuitDto;
import com.harry.winser.spring.boot.java.biscuit.service.BiscuitService;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BiscuitServiceImpl implements BiscuitService {

    private final BiscuitDao biscuitDao;

    public BiscuitServiceImpl(BiscuitDao biscuitDao) {
        this.biscuitDao = biscuitDao;
    }

    @Override
    public Set<BiscuitDto> getAllBiscuits() {
        return this.biscuitDao.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toSet());
    }

    @Override
    public BiscuitDto getBiscuitByName(String name) {


        return null;
    }

    private BiscuitDto convertToDto(Biscuit source) {

        return new BiscuitDto(source.getGuid(), source.getName(), source.getDescription());
    }
}
