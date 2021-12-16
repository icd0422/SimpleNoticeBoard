package com.example.simplenoticeboard;

import com.example.simplenoticeboard.entity.NoticeBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public long registerRanking(NoticeBoard noticeBoard) {
        return boardRepository.save(noticeBoard).getId();
    }
}
