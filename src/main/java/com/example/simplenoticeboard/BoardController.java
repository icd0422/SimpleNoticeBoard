package com.example.simplenoticeboard;

import com.example.simplenoticeboard.entity.NoticeBoard;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "BoardController", description = "게시판 API")
@RequiredArgsConstructor
@RequestMapping("/notice/boards")
@RestController
public class BoardController {

    private final BoardService boardService;

    @ApiOperation(value = "게시글 등록", response = Long.class)
    @PostMapping
    public long registerRanking(@RequestBody NoticeBoard noticeBoard) {
        return boardService.registerRanking(noticeBoard);
    }
}