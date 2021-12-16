package com.example.simplenoticeboard;

import com.example.simplenoticeboard.entity.NoticeBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<NoticeBoard> getBoards() {
        return boardRepository.findAll();
    }

    public long registerBoard(NoticeBoard noticeBoard) {
        return boardRepository.save(noticeBoard).getId();
    }

    public long modifyBoard(NoticeBoard noticeBoard) {
        NoticeBoard board = boardRepository.findById(noticeBoard.getId()).get();
        board.setTitle(noticeBoard.getTitle());
        board.setContents(noticeBoard.getContents());
        board.setAuthor(noticeBoard.getAuthor());
        return board.getId();
    }

    public long deleteBoard(long boardId) {
        boardRepository.delete(boardRepository.findById(boardId).get());
        return boardId;
    }
}
