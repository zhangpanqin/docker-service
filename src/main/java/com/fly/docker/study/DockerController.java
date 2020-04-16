package com.fly.docker.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-04-16-10:05
 */
@RestController
public class DockerController {
    @GetMapping("/docker")
    public String docker() {
        return "docker";
    }
}
