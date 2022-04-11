package com.virjar.sekiro.business.netty.util;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class ConstantHashUtil {

    public static long murHash(String key) {
        return Hashing.murmur3_128().hashString(key, StandardCharsets.UTF_8).asLong();
    }
}
