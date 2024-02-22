package com.hj.VTS.service.impl;

import com.hj.VTS.dto.OwnerDto;
import com.hj.VTS.model.Owner;
import com.hj.VTS.repository.OwnerRepository;
import com.hj.VTS.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerServiceImpl implements OwnerService {

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    private OwnerRepository ownerRepository;

    @Override
    public List<OwnerDto> findAllClubs() {
        List<Owner> owners = ownerRepository.findAll();
        return owners.stream().map(owner -> mapToOwnerDto(owner)).collect(Collectors.toList());
    }

    private OwnerDto mapToOwnerDto(Owner owner) {
        return OwnerDto.builder()
                .id(owner.getId())
                .name(owner.getName())
                .projects(owner.getProjects())
                .build();
    }

}
