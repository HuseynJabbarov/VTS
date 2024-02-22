package com.hj.VTS.dto;

import com.hj.VTS.model.Project;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class OwnerDto {
    private Long id;
    private String name;
    private Set<Project> projects;
}
