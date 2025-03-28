package com.andre.blog.domain.dtos;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagDto {
    private UUID id;
    private String name;
}
