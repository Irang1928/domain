package com.example.mapper;

import com.example.domain.reviewVo;

import java.util.List;

public interface reviewmapper {
    // 문의 글 조회
    public List<reviewVo> reviewlist() throws Exception;
}
