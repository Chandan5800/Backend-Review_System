package com.apnareview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnareview.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
