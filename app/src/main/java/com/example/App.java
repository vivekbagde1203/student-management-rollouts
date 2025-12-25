package com.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080);

        get("/", (req, res) -> "Student Management App - VERSION v2 (GREEN)");
    }
}

