package com.example.kok.mapper;

import com.example.kok.dto.RetrievedExperienceDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RetrievedExperienceMapper {
//    insert
    public void insertRetrievedExperience(Long memberId, Long experienceId);
}
