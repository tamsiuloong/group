package com.loong.group.domain;

import javax.persistence.*;

/**
 * Created by loong on 2017-03-23.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String phone;
    @ManyToOne
    @JoinColumn(name="schoolid")
    private School school;
    private String javaBase;//java基础
    private String target;//培训目标
    private String targetConfidence;//目标信心
    private String whyUHere;//为什么来这里
    private String achievements;//培训后得到的成果
    private String experienceAndHow;//希望有什么样的体验，如何实现？
    private String expect;//你有什么样的期望
    private String selfContro;//自我管理能力



    @ManyToOne
    @JoinColumn(name="classesid")
    private Classes classes;//班级
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getJavaBase() {
        return javaBase;
    }

    public void setJavaBase(String javaBase) {
        this.javaBase = javaBase;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTargetConfidence() {
        return targetConfidence;
    }

    public void setTargetConfidence(String targetConfidence) {
        this.targetConfidence = targetConfidence;
    }

    public String getWhyUHere() {
        return whyUHere;
    }

    public void setWhyUHere(String whyUHere) {
        this.whyUHere = whyUHere;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getExperienceAndHow() {
        return experienceAndHow;
    }

    public void setExperienceAndHow(String experienceAndHow) {
        this.experienceAndHow = experienceAndHow;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public String getSelfContro() {
        return selfContro;
    }

    public void setSelfContro(String selfContro) {
        this.selfContro = selfContro;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
