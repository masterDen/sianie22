package ru.sianie22.core.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sianie22.core.persistence.seminars.Seminar;

/**
 * author: Denis Grigorichev
 * Created at: 14.02.16
 */
@Repository
public interface SeminarRepository extends JpaRepository<Seminar, Integer> {
}
