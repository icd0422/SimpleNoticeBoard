package com.example.simplenoticeboard;

import com.example.simplenoticeboard.entity.NoticeBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<NoticeBoard, Long> {
}
