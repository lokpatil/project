package com.example.lokesh.watchlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lokesh.watchlist.entity.Movie;


@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}

