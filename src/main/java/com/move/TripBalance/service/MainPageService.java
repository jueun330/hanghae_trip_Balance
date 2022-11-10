package com.move.TripBalance.service;

import com.move.TripBalance.controller.response.ResponseDto;
import com.move.TripBalance.domain.Member;
import com.move.TripBalance.jwt.TokenProvider;
import com.move.TripBalance.repository.PostRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
@Getter
public class MainPageService {

    private final PostRepository postRepository;
    private final TokenProvider tokenProvider;

    private final ApiService apiService;

    @Transactional
    public ResponseDto<?> getTop5Posts(){
        return ResponseDto.success(postRepository.findTop5ByHearts(LocalDateTime.now()));
    }

    @Transactional
    public Member validateMember(HttpServletRequest request) {
        if (!tokenProvider.validateToken(request.getHeader("Refresh_Token"))) {
            return null;
        }
        return tokenProvider.getMemberFromAuthentication();
    }
}
