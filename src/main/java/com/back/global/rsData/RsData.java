package com.back.global.rsData;

public record RsData<T>(String resultCode, String ms, T data) {
    public RsData(String resultCode, String formatted) {
        this(resultCode, formatted, null);
    }
}
