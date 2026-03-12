package com.alekseev.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Главный класс конфигурационного сервера.
 *
 * @EnableConfigServer активирует REST API для обслуживания конфигурационных файлов.
 * Микросервисы будут обращаться к этому серверу, чтобы получить свои настройки
 * (например, URL базы данных, параметры Kafka) при старте.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}