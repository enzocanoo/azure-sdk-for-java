/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of creating person.
 */
public class CreatePersonResultInner {
    /**
     * personID of the new created person.
     */
    @JsonProperty(value = "personId", required = true)
    private String personId;

    /**
     * Get the personId value.
     *
     * @return the personId value
     */
    public String personId() {
        return this.personId;
    }

    /**
     * Set the personId value.
     *
     * @param personId the personId value to set
     * @return the CreatePersonResultInner object itself.
     */
    public CreatePersonResultInner withPersonId(String personId) {
        this.personId = personId;
        return this;
    }

}
