package com.example.simplenoticeboard;

import com.example.simplenoticeboard.entity.NoticeBoard;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "BoardController", description = "게시판 API")
@RequiredArgsConstructor
@RequestMapping("/notice/boards")
@RestController
public class BoardController {

    private final BoardService boardService;

    @ApiOperation(value = "게시글 조회")
    @GetMapping
    public List<NoticeBoard> getBoards() {
        return boardService.getBoards();
    }

    @ApiOperation(value = "게시글 등록")
    @PostMapping
    public long registerBoard(@RequestBody NoticeBoard noticeBoard) {
        return boardService.registerBoard(noticeBoard);
    }

    @ApiOperation(value = "게시글 수정")
    @PutMapping
    public long modifyBoard(@RequestBody NoticeBoard noticeBoard) {
        return boardService.modifyBoard(noticeBoard);
    }

    @ApiOperation(value = "게시글 삭제")
    @DeleteMapping("/{boardId}")
    public long deleteBoard(@PathVariable("boardId") long boardId) {
        return boardService.deleteBoard(boardId);
    }
}
