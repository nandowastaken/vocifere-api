package com.vocifere.vocifereapi.word;

public class Word {
    private Long id;
    private String word;
    private String audio;
    private String meaning;
    private String language;

    public Word(Long id, String word, String audio, String meaning, String language) {
        this.id = id;
        this.word = word;
        this.audio = audio;
        this.meaning = meaning;
        this.language = language;
    }

    public Word(String word, String audio, String meaning, String language) {
        this.word = word;
        this.audio = audio;
        this.meaning = meaning;
        this.language = language;
    }
}
