package com.manga.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
public class MangaApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangaApiApplication.class, args);
    }
}

@RestController
@RequestMapping("/api/manga")
class MangaController {

    private final List<Manga> mangaList = new ArrayList<>();

    public MangaController() {
        // Dados iniciais
        mangaList.add(new Manga(1, "Jujutsu Kaisen", "Gege Akutami", "Ação, Sobrenatural", 23));
        mangaList.add(new Manga(2, "Naruto", "Masashi Kishimoto", "Ação, Aventura", 72));
        mangaList.add(new Manga(3, "One Piece", "Eiichiro Oda", "Ação, Aventura", 100));
        mangaList.add(new Manga(4, "Black Clover", "Yūki Tabata", "Ação, Fantasia", 33));
        mangaList.add(new Manga(5, "Haikyuu!!", "Haruichi Furudate", "Esporte", 45));
    }

    @GetMapping
    public List<Manga> getAllMangas() {
        return mangaList;
    }

    @GetMapping("/{id}")
    public Manga getMangaById(@PathVariable int id) {
        return mangaList.stream()
                .filter(manga -> manga.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Mangá não encontrado."));
    }

    @PostMapping
    public Manga addManga(@RequestBody Manga newManga) {
        mangaList.add(newManga);
        return newManga;
    }

    @PutMapping("/{id}")
    public Manga updateManga(@PathVariable int id, @RequestBody Manga updatedManga) {
        Manga manga = mangaList.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Mangá não encontrado."));

        manga.setTitle(updatedManga.getTitle());
        manga.setAuthor(updatedManga.getAuthor());
        manga.setGenre(updatedManga.getGenre());
        manga.setVolumes(updatedManga.getVolumes());
        return manga;
    }

    @DeleteMapping("/{id}")
    public String deleteManga(@PathVariable int id) {
        boolean removed = mangaList.removeIf(manga -> manga.getId() == id);
        if (!removed) {
            throw new RuntimeException("Mangá não encontrado.");
        }
        return "Mangá removido com sucesso.";
    }
}

class Manga {
    private int id;
    private String title;
    private String author;
    private String genre;
    private int volumes;

    // Construtor padrão
    public Manga() {}

    // Construtor com argumentos
    public Manga(int id, String title, String author, String genre, int volumes) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.volumes = volumes;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }
}