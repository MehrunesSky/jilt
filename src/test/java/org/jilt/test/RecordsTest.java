package org.jilt.test;

import org.jilt.test.data.record.RecordWithWorkaround;
import org.jilt.test.data.record.RecordWithWorkaroundBuilder;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordsTest {
    @Test
    public void builder_for_record_with_workaround_works() {
        RecordWithWorkaround record = new RecordWithWorkaroundBuilder()
                .name("some name")
                .age(23)
                .build();

        assertThat(record.name()).isEqualTo("some name");
        assertThat(record.age()).isEqualTo(23);
    }
}
