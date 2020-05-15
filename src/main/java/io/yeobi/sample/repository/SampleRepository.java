package io.yeobi.sample.repository;

import io.yeobi.sample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
    Sample findBySampleId(Long sampleId);
}
