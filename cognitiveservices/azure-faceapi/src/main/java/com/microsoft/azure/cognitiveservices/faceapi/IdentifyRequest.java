/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for identify face operation.
 */
public class IdentifyRequest {
    /**
     * personGroupId of the target person group, created by
     * PersonGroups.Create.
     */
    @JsonProperty(value = "personGroupId", required = true)
    private String personGroupId;

    /**
     * Array of candidate faceId created by Face - Detect.
     */
    @JsonProperty(value = "faceIds", required = true)
    private List<String> faceIds;

    /**
     * The number of top similar faces returned.
     */
    @JsonProperty(value = "maxNumOfCandidatesReturned")
    private Integer maxNumOfCandidatesReturned;

    /**
     * The confidenceThreshold property.
     */
    @JsonProperty(value = "confidenceThreshold")
    private double confidenceThreshold;

    /**
     * Get the personGroupId value.
     *
     * @return the personGroupId value
     */
    public String personGroupId() {
        return this.personGroupId;
    }

    /**
     * Set the personGroupId value.
     *
     * @param personGroupId the personGroupId value to set
     * @return the IdentifyRequest object itself.
     */
    public IdentifyRequest withPersonGroupId(String personGroupId) {
        this.personGroupId = personGroupId;
        return this;
    }

    /**
     * Get the faceIds value.
     *
     * @return the faceIds value
     */
    public List<String> faceIds() {
        return this.faceIds;
    }

    /**
     * Set the faceIds value.
     *
     * @param faceIds the faceIds value to set
     * @return the IdentifyRequest object itself.
     */
    public IdentifyRequest withFaceIds(List<String> faceIds) {
        this.faceIds = faceIds;
        return this;
    }

    /**
     * Get the maxNumOfCandidatesReturned value.
     *
     * @return the maxNumOfCandidatesReturned value
     */
    public Integer maxNumOfCandidatesReturned() {
        return this.maxNumOfCandidatesReturned;
    }

    /**
     * Set the maxNumOfCandidatesReturned value.
     *
     * @param maxNumOfCandidatesReturned the maxNumOfCandidatesReturned value to set
     * @return the IdentifyRequest object itself.
     */
    public IdentifyRequest withMaxNumOfCandidatesReturned(Integer maxNumOfCandidatesReturned) {
        this.maxNumOfCandidatesReturned = maxNumOfCandidatesReturned;
        return this;
    }

    /**
     * Get the confidenceThreshold value.
     *
     * @return the confidenceThreshold value
     */
    public double confidenceThreshold() {
        return this.confidenceThreshold;
    }

    /**
     * Set the confidenceThreshold value.
     *
     * @param confidenceThreshold the confidenceThreshold value to set
     * @return the IdentifyRequest object itself.
     */
    public IdentifyRequest withConfidenceThreshold(double confidenceThreshold) {
        this.confidenceThreshold = confidenceThreshold;
        return this;
    }

}
