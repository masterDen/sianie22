package ru.sianie22.core.persistence.seminars;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * author: Denis Grigorichev
 * Created at: 14.02.16
 */
@Entity
public class Seminar {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private Date executeDate;

    private String title;

    private String description;

    private String videoUrl;

    public Seminar() {
    }

    public Seminar(Date executeDate, String title, String description, String videoUrl) {
        this.executeDate = executeDate;
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
    }

    public Integer getId() {
        return id;
    }

    public Date getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(Date executeDate) {
        this.executeDate = executeDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
