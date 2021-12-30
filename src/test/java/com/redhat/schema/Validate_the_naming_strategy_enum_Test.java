package com.redhat.schema;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import com.redhat.schema.pusher.NamingStrategy;
import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import io.confluent.kafka.serializers.subject.RecordNameStrategy;
import io.confluent.kafka.serializers.subject.TopicNameStrategy;
import io.confluent.kafka.serializers.subject.TopicRecordNameStrategy;

class Validate_the_naming_strategy_enum_Test {
  @TestFactory
  Stream<DynamicTest> verify_members_strategy_class_equivalents() {
    return Stream.of(
      dynamicTest(
        "the RECORD member is equivalent to the RecordNameStrategy class",
        () -> assertThat(NamingStrategy.RECORD.getStrategy()).isEqualTo(RecordNameStrategy.class)),
      dynamicTest(
        "the TOPIC member is equivalent to the TopicNameStrategy class",
        () -> assertThat(NamingStrategy.TOPIC.getStrategy()).isEqualTo(TopicNameStrategy.class)),
      dynamicTest(
        "the TOPIC_RECORD member is equivalent to the TopicRecordNameStrategy class",
        () -> assertThat(NamingStrategy.TOPIC_RECORD.getStrategy()).isEqualTo(TopicRecordNameStrategy.class))
    );
  }
}
