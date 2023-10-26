package com.ale.blog.handler.mapper.pojo.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageDocumentRequest {
    @NotNull
    private Integer page;

    @NotNull
    private String scope;
}
