package com.hj.VTS.dto;

import com.hj.VTS.model.Owner;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
public class ProjectDto {
    private Long id;
    private String name;
    private LocalDateTime createdOn;
    private Owner owner;
}
