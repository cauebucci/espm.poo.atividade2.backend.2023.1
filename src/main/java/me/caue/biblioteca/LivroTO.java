package me.caue.biblioteca;

public record LivroTO (
    String id,
    String titulo,
    String autor,
    String editora,
    int ano,
    double preco
) {}
