package ru.sianie22.core.persistence.seminars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sianie22.core.persistence.dao.SeminarRepository;

import java.util.*;

/**
 * author: Denis Grigorichev
 * Created at: 14.02.16
 */
@Service
public class SeminarPersistenceManager {

    @Autowired
    private SeminarRepository seminarRepository;

    @Transactional
    public Seminar create(String title, String description, Date executeDate, String videoUrl){
        Seminar result = new Seminar(executeDate, title, description, videoUrl);
        return seminarRepository.save(result);
    }

    @Transactional
    public Seminar update(int seminarId, String title, String description, Date executeDate, String videoUrl){
        Seminar seminar = seminarRepository.findOne(seminarId);
        if (seminar == null) {
            //TODO throw NotFoundException
        }

        seminar.setDescription(description);
        seminar.setExecuteDate(executeDate);
        seminar.setTitle(title);
        seminar.setVideoUrl(videoUrl);
        return seminarRepository.save(seminar);
    }

    public List<Seminar> getAllSeminars(){
        return Collections.unmodifiableList(seminarRepository.findAll(new Sort(Sort.Direction.ASC, "executeDate")));
    }
}
