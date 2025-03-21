// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.authoring.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Deployment model. */
@Immutable
public final class Deployment {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of Deployment class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public Deployment(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
