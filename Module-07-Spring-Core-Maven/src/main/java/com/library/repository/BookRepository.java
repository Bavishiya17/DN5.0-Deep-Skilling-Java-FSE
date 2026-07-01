package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void doRepositoryWork() {
        System.out.println("Doing repository work...");
    }
}