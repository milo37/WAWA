package com.mulcam.doji.wawa;

/**
 * Created by DongJinPark on 2017-06-07.
 */

import java.util.Date;

/**
 * Created by student on 2017-06-05.
 */

public class PetInfo {
    private int idx;
    private String resist;
    private String id;
    private String name;
    private String kind;
    private String birthday;
    private String neutral;
    private Double weight;
    private String sex;
    private String groomingStart;
    private int groomingPeriod;
    private int mainPet;
    private int fileId;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getResist() {
        return resist;
    }

    public void setResist(String resist) {
        this.resist = resist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNeutral() {
        return neutral;
    }

    public void setNeutral(String neutral) {
        this.neutral = neutral;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroomingStart() {
        return groomingStart;
    }

    public void setGroomingStart(String groomingStart) {
        this.groomingStart = groomingStart;
    }

    public int getGroomingPeriod() {
        return groomingPeriod;
    }

    public void setGroomingPeriod(int groomingPeriod) {
        this.groomingPeriod = groomingPeriod;
    }

    public int getMainPet() {
        return mainPet;
    }

    public void setMainPet(int mainPet) {
        this.mainPet = mainPet;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "PetInfo{" +
                "idx=" + idx +
                ", resist='" + resist + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", birthday=" + birthday +
                ", neutral='" + neutral + '\'' +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", groomingStart=" + groomingStart +
                ", groomingPeriod=" + groomingPeriod +
                ", mainPet=" + mainPet +
                ", fileId=" + fileId +
                '}';
    }
}
