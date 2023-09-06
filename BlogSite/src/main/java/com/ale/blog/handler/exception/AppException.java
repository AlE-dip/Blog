package com.ale.blog.handler.exception;

import com.ale.blog.handler.utils.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppException extends RuntimeException{
    private MessageType messageType;
}
