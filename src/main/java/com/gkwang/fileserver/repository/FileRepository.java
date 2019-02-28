package com.gkwang.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gkwang.fileserver.domain.File;


public interface FileRepository extends MongoRepository<File, String> {
}
