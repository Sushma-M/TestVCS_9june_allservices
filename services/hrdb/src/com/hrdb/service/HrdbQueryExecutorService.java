/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.export.ExportOptions;

import com.hrdb.models.query.*;

public interface HrdbQueryExecutorService {

    Page<EmployeedatabyIdResponse> executeEmployeedatabyID(Integer id, Pageable pageable);

    void exportEmployeedatabyID(Integer id, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

}