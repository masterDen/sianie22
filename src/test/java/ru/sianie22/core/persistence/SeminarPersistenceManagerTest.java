package ru.sianie22.core.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.util.Assert;
import ru.sianie22.config.CoreConfiguration;
import ru.sianie22.config.TestAppCoreConfig;
import ru.sianie22.core.persistence.seminars.Seminar;
import ru.sianie22.core.persistence.seminars.SeminarPersistenceManager;

import java.util.Date;
import java.util.List;

/**
 * author: Denis Grigorichev
 * Created at: 14.02.16
 */
@PropertySource("testApplication.properties")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestAppCoreConfig.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("test")
public class SeminarPersistenceManagerTest {

    @Autowired
    private SeminarPersistenceManager seminarPersistenceManager;

    @Test
    public void crud(){
        Seminar seminar = seminarPersistenceManager.create("title1", "desc1", new Date(), "");
        Assert.notNull(seminar);

        seminarPersistenceManager.create("title2", "Loren ipsum....", new Date(), "");
        seminarPersistenceManager.create("title3", "Loren ipsum....", new Date(), "");
        seminarPersistenceManager.create("title4", "Loren ipsum....", new Date(), "");
        seminarPersistenceManager.create("title5", "Loren ipsum....", new Date(), "");
        seminarPersistenceManager.create("title2", "Loren ipsum....", new Date(), "");
        List<Seminar> allSeminars = seminarPersistenceManager.getAllSeminars();

        Assert.isTrue(allSeminars.size() == 6);
    }
}
