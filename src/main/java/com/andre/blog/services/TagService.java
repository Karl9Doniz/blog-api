package com.andre.blog.services;

import com.andre.blog.domain.entities.Tag;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface TagService {
    List<Tag> getAllTags();
    List<Tag> createTags(Set<String> tagNames);
    void deleteTag(UUID id);
    Tag getTagById(UUID tagId);
    List<Tag> getTagByIds(Set<UUID> ids);
}
