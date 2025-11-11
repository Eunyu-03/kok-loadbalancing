package com.example.kok.repository;

import com.example.kok.dto.RetrievedExperienceDTO;
import com.example.kok.dto.RetrievedInternDTO;
import com.example.kok.mapper.RetrievedExperienceMapper;
import com.example.kok.mapper.RetrievedInternMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RetrievedInternDAO {
    private final RetrievedInternMapper retrievedInternMapper;
//    멤버 id와 상세 조회한 공고 id insert
    public void save(Long memberId, Long internId) {
        retrievedInternMapper.insertRetrievedIntern(memberId, internId);
    }
}
