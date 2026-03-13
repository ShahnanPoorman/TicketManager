package com.example.ticketmanager;

import java.util.List;

public record ErrorResponse(int status, String message, List<String> errors) { }
