package io.yeobi.sample.service;

import io.yeobi.sample.entity.Sample;
import io.yeobi.sample.repository.SampleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<Sample> getSamples() {
        return sampleRepository.findAll();
    }

    public Sample getSampleBySampleId(Long sampleId) {
        return sampleRepository.findBySampleId(sampleId);
    }

    public Sample upsertSample(String name, String id, String password) {
        Sample sample = new Sample();
        sample.setName(name);
        sample.setId(id);
        sample.setPassword(password);
        return sampleRepository.save(sample);
    }
}
