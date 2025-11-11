package com.example.kok.mapper;

import com.example.kok.dto.RetrievedInternDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RetrievedInternMapper {
//    insert
    public void insertRetrievedIntern(Long memberId, Long internId);
}
