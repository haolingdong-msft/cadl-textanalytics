// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.authoring.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Status monitor resource for long running operations. */
@Fluent
public final class OperationStatus {
    /*
     * The unique ID of the operation.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The status of the operation
     */
    @JsonProperty(value = "status", required = true)
    private OperationState status;

    /*
     * Error object that describes the error when status is "Failed".
     */
    @JsonProperty(value = "error")
    private ResponseError error;

    /**
     * Creates an instance of OperationStatus class.
     *
     * @param id the id value to set.
     * @param status the status value to set.
     */
    @JsonCreator
    public OperationStatus(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "status", required = true) OperationState status) {
        this.id = id;
        this.status = status;
    }

    /**
     * Get the id property: The unique ID of the operation.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public OperationState getStatus() {
        return this.status;
    }

    /**
     * Get the error property: Error object that describes the error when status is "Failed".
     *
     * @return the error value.
     */
    public ResponseError getError() {
        return this.error;
    }

    /**
     * Set the error property: Error object that describes the error when status is "Failed".
     *
     * @param error the error value to set.
     * @return the OperationStatus object itself.
     */
    public OperationStatus setError(ResponseError error) {
        this.error = error;
        return this;
    }
}
