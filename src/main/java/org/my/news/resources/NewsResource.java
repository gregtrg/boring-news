package org.my.news.resources;

import org.my.news.dto.News;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NewsResource {

    private List<News> news;

    {
        news = new ArrayList<>();
        news.add(new News("news 1", "author 1", LocalDateTime.now().minusDays(1)));
        news.add(new News("news 2", "author 2", LocalDateTime.now().minusMonths(2)));
        news.add(new News("news 3", "author 3", LocalDateTime.now().minusMinutes(10)));
    }


    @RequestMapping("/news")
    public ResponseEntity<List<News>> getAllNews() {
        return ResponseEntity.ok(news);
    }
}
