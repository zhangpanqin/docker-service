package com.fly.docker.study;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-04-16-10:05
 */
@RestController
@Slf4j
public class DockerController {
    @GetMapping("/docker")
    public String docker() {
        log.info("请求数据了22244777");
        return "docker";
    }
}
