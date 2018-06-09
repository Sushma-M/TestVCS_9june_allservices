/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Shift generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`Shift`", uniqueConstraints = {
            @UniqueConstraint(name = "`UK_d8auwq05um6bp8uwxgntu5i0o`", columnNames = {"`StartTime`", "`EndTime`"}),
            @UniqueConstraint(name = "`UK_t5p380tn7qe2ynvkpp2iuw164`", columnNames = {"`Name`"})})
public class Shift implements Serializable {

    private Short shiftId;
    private String name;
    private Time startTime;
    private Time endTime;
    private LocalDateTime modifiedDate;
    private List<EmployeeDepartmentHistory> employeeDepartmentHistories;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ShiftID`", nullable = false, scale = 0, precision = 3)
    public Short getShiftId() {
        return this.shiftId;
    }

    public void setShiftId(Short shiftId) {
        this.shiftId = shiftId;
    }

    @Column(name = "`Name`", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`StartTime`", nullable = false)
    public Time getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    @Column(name = "`EndTime`", nullable = false)
    public Time getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Column(name = "`ModifiedDate`", nullable = false)
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shift")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<EmployeeDepartmentHistory> getEmployeeDepartmentHistories() {
        return this.employeeDepartmentHistories;
    }

    public void setEmployeeDepartmentHistories(List<EmployeeDepartmentHistory> employeeDepartmentHistories) {
        this.employeeDepartmentHistories = employeeDepartmentHistories;
    }

    @PostPersist
    public void onPostPersist() {
        if(employeeDepartmentHistories != null) {
            employeeDepartmentHistories.forEach(_employeeDepartmentHistory -> _employeeDepartmentHistory.setShift(this));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shift)) return false;
        final Shift shift = (Shift) o;
        return Objects.equals(getShiftId(), shift.getShiftId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShiftId());
    }
}