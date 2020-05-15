package io.yeobi.sample.controller;

import io.yeobi.sample.entity.Sample;
import io.yeobi.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/samples")
    private List<Sample> getSamples() {
        return sampleService.getSamples();
    }

    @GetMapping("/sample")
    private Sample getSample() {
        return sampleService.getSampleBySampleId(1L);
    }
}
