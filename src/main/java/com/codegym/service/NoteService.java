package com.codegym.service;

import com.codegym.model.Note;
import com.codegym.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NoteService {
    Page<Note> findAllByTitleContainingOrContentContaining(String title, String content, Pageable pageable);

    Page<Note> findAll(Pageable pageable);

    Page<Note> findAllByType(Type type, Pageable pageable);

    Note findById(Long id);

    void save(Note note);

    void remove(Long id);
}
