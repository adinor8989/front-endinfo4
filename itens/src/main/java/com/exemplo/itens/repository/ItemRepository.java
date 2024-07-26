package com.exemplo.itens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.itens.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

