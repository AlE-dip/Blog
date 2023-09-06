package com.ale.blog.service;


import com.ale.blog.entity.RefreshToken;
import com.ale.blog.entity.User;
import com.ale.blog.handler.exception.AppException;
import com.ale.blog.handler.mapper.AccessToken;
import com.ale.blog.handler.mapper.RefreshTokenInput;

public interface RefreshTokenService {
    AccessToken createAccessToken(RefreshTokenInput refreshTokenInput) throws AppException;
    RefreshToken createRefreshToken(User user);
}