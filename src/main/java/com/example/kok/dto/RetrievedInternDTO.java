package com.example.kok.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
public class RetrievedInternDTO {
    private Long id;
    private Long memberId;
    private Long internId;
}
