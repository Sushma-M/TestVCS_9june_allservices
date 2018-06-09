/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testallservicesforvcs.adventureworks2014.VjobCandidate;
import com.testallservicesforvcs.adventureworks2014.VjobCandidateId;

/**
 * Service object for domain model class {@link VjobCandidate}.
 */
public interface VjobCandidateService {

    /**
     * Creates a new VjobCandidate. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on VjobCandidate if any.
     *
     * @param vjobCandidate Details of the VjobCandidate to be created; value cannot be null.
     * @return The newly created VjobCandidate.
     */
    VjobCandidate create(@Valid VjobCandidate vjobCandidate);


	/**
     * Returns VjobCandidate by given id if exists.
     *
     * @param vjobcandidateId The id of the VjobCandidate to get; value cannot be null.
     * @return VjobCandidate associated with the given vjobcandidateId.
	 * @throws EntityNotFoundException If no VjobCandidate is found.
     */
    VjobCandidate getById(VjobCandidateId vjobcandidateId);

    /**
     * Find and return the VjobCandidate by given id if exists, returns null otherwise.
     *
     * @param vjobcandidateId The id of the VjobCandidate to get; value cannot be null.
     * @return VjobCandidate associated with the given vjobcandidateId.
     */
    VjobCandidate findById(VjobCandidateId vjobcandidateId);

	/**
     * Find and return the list of VjobCandidates by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param vjobcandidateIds The id's of the VjobCandidate to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return VjobCandidates associated with the given vjobcandidateIds.
     */
    List<VjobCandidate> findByMultipleIds(List<VjobCandidateId> vjobcandidateIds, boolean orderedReturn);


    /**
     * Updates the details of an existing VjobCandidate. It replaces all fields of the existing VjobCandidate with the given vjobCandidate.
     *
     * This method overrides the input field values using Server side or database managed properties defined on VjobCandidate if any.
     *
     * @param vjobCandidate The details of the VjobCandidate to be updated; value cannot be null.
     * @return The updated VjobCandidate.
     * @throws EntityNotFoundException if no VjobCandidate is found with given input.
     */
    VjobCandidate update(@Valid VjobCandidate vjobCandidate);

    /**
     * Deletes an existing VjobCandidate with the given id.
     *
     * @param vjobcandidateId The id of the VjobCandidate to be deleted; value cannot be null.
     * @return The deleted VjobCandidate.
     * @throws EntityNotFoundException if no VjobCandidate found with the given id.
     */
    VjobCandidate delete(VjobCandidateId vjobcandidateId);

    /**
     * Deletes an existing VjobCandidate with the given object.
     *
     * @param vjobCandidate The instance of the VjobCandidate to be deleted; value cannot be null.
     */
    void delete(VjobCandidate vjobCandidate);

    /**
     * Find all VjobCandidates matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidates.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<VjobCandidate> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all VjobCandidates matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidates.
     *
     * @see Pageable
     * @see Page
     */
    Page<VjobCandidate> findAll(String query, Pageable pageable);

    /**
     * Exports all VjobCandidates matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all VjobCandidates matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the VjobCandidates in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the VjobCandidate.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}