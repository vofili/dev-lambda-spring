package com.nubeero.controller;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import lombok.*;

@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Message {

    int messageId;
    String subject;
    String messageBody;
    String sendTo;

}
