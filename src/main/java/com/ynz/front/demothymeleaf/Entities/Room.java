package com.ynz.front.demothymeleaf.Entities;

import com.ynz.front.demothymeleaf.mapper.Persistable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ROOM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room implements Persistable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String roomNum;

    @Column(name = "BED_INFO")
    private String bedInfo;

    @Builder
    public Room(String name, String roomNum, String bedInfo) {
        this.name = name;
        this.roomNum = roomNum;
        this.bedInfo = bedInfo;
    }
}
