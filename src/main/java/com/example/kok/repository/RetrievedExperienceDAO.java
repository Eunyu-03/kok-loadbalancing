package com.example.kok.repository;

import com.example.kok.dto.RetrievedExperienceDTO;
import com.example.kok.mapper.RetrievedExperienceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RetrievedExperienceDAO {
    private final RetrievedExperienceMapper retrievedExperienceMapper;
//    멤버 id와 상세 조회한 공고 id insert
    public void save(Long memberId, Long experienceId) {
        retrievedExperienceMapper.insertRetrievedExperience(memberId, experienceId);
    }

//    10번 이상 상세 페이지를 조회했는지 검사
    public boolean isOkayToRetrieve(Long memberId){
        return retrievedExperienceMapper.selectCountRetrieved(memberId)>10;
    }
}
