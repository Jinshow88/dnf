package com.game.dnf.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String serverId;
    @Column(length = 50, unique = true)
    private String characterId;
    @Column(length = 30)
    private String characterName;
    @Column(length = 20)
    private String level;
    @Column(length = 50)
    private String jobId;
    @Column(length = 50)
    private String jobGrowId;
    @Column(length = 30)
    private String jobName;
    @Column(length = 30)
    private String jobGrowName;
    @Column(length = 20)
    private String fame;

    public Search(String serverId, String characterId, String characterName, String level, String jobId, String jobGrowId
            , String jobName, String jobGrowName, String fame) {
        this.serverId = serverId;
        this.characterId = characterId;
        this.characterName = characterName;
        this.level = level;
        this.jobId = jobId;
        this.jobGrowId = jobGrowId;
        this.jobName = jobName;
        this.jobGrowName = jobGrowName;
        this.fame = fame;

    }

    public Search() {

    }
}

