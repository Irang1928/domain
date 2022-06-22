package com.example.repository;

import com.example.domain.reviewVo;
import com.example.mapper.Reviewmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reviewService {

    @Autowired
    private Reviewmapper reviewmapper;

    // 게시글 조회
    public List<reviewVo> reviewlist() throws Exception {
        // mapper 패키지 안의 reviewmapper.java 의 문의글 조회 reviewlist 메소드와 일치
        return reviewmapper.reviewlist();
    }
}
