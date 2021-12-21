package com.example.SpringDemo.dao;

import com.example.SpringDemo.pojo.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post, Long> {

}
