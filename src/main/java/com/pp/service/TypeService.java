package com.pp.service;

import com.pp.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Page<Type>  listType(Pageable pageable);

    Type updateType(Long id,Type type);

    void deleteType(Long id);

}
