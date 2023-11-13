package com.ale.blog.handler.mapper.pojo.response;

import com.ale.blog.handler.mapper.pojo.response.state.BroadcastType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BroadcastResponse {
    private String userId;
    private BroadcastType type;
    private Object payload;
}
