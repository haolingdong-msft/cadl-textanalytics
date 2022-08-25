// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.authoring;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.language.authoring.models.DeploymentJob;
import com.azure.language.authoring.models.SwapDeploymentsJob;

/** Initializes a new instance of the synchronous MicrosoftCognitiveLanguageServiceAnalyzeTextAuthoringClient type. */
@ServiceClient(builder = JobsClientBuilder.class)
public final class JobsClient {
    @Generated private final JobsAsyncClient client;

    /**
     * Initializes an instance of JobsClient class.
     *
     * @param client the async client.
     */
    @Generated
    JobsClient(JobsAsyncClient client) {
        this.client = client;
    }

    /**
     * Gets the status of an existing deployment job.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     createdDateTime: String (Required)
     *     lastUpdatedDateTime: String (Required)
     *     expirationDateTime: String (Required)
     *     status: String(notStarted/running/succeeded/failed/cancelled/cancelling/partiallyCompleted) (Required)
     *     warnings (Required): [
     *          (Required){
     *             code: String (Required)
     *             message: String (Required)
     *         }
     *     ]
     *     errors: ResponseError (Required)
     *     id: String (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param jobId The jobId parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the status of an existing deployment job along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDeploymentStatusWithResponse(
            String projectName, String deploymentName, String jobId, RequestOptions requestOptions) {
        return this.client.getDeploymentStatusWithResponse(projectName, deploymentName, jobId, requestOptions).block();
    }

    /**
     * Gets the status of an existing swap deployment job.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     createdDateTime: String (Required)
     *     lastUpdatedDateTime: String (Required)
     *     expirationDateTime: String (Required)
     *     status: String(notStarted/running/succeeded/failed/cancelled/cancelling/partiallyCompleted) (Required)
     *     warnings (Required): [
     *          (Required){
     *             code: String (Required)
     *             message: String (Required)
     *         }
     *     ]
     *     errors: ResponseError (Required)
     *     id: String (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param jobId The jobId parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the status of an existing swap deployment job along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getSwapDeploymentsStatusWithResponse(
            String projectName, String deploymentName, String jobId, RequestOptions requestOptions) {
        return this.client
                .getSwapDeploymentsStatusWithResponse(projectName, deploymentName, jobId, requestOptions)
                .block();
    }

    /*
     * Generated convenience method for getDeploymentStatusWithResponse
     */
    /**
     * Gets the status of an existing deployment job.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param jobId The jobId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an existing deployment job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeploymentJob getDeploymentStatus(String projectName, String deploymentName, String jobId) {
        RequestOptions requestOptions = new RequestOptions();
        return getDeploymentStatusWithResponse(projectName, deploymentName, jobId, requestOptions)
                .getValue()
                .toObject(DeploymentJob.class);
    }

    /*
     * Generated convenience method for getDeploymentStatusWithResponse
     */
    /**
     * Gets the status of an existing deployment job.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param jobId The jobId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an existing deployment job along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DeploymentJob> getDeploymentStatusWithResponse(
            String projectName, String deploymentName, String jobId, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse =
                getDeploymentStatusWithResponse(projectName, deploymentName, jobId, requestOptions);
        return new SimpleResponse<>(
                protocolMethodResponse, protocolMethodResponse.getValue().toObject(DeploymentJob.class));
    }

    /*
     * Generated convenience method for getSwapDeploymentsStatusWithResponse
     */
    /**
     * Gets the status of an existing swap deployment job.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param jobId The jobId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an existing swap deployment job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SwapDeploymentsJob getSwapDeploymentsStatus(String projectName, String deploymentName, String jobId) {
        RequestOptions requestOptions = new RequestOptions();
        return getSwapDeploymentsStatusWithResponse(projectName, deploymentName, jobId, requestOptions)
                .getValue()
                .toObject(SwapDeploymentsJob.class);
    }

    /*
     * Generated convenience method for getSwapDeploymentsStatusWithResponse
     */
    /**
     * Gets the status of an existing swap deployment job.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param jobId The jobId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an existing swap deployment job along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SwapDeploymentsJob> getSwapDeploymentsStatusWithResponse(
            String projectName, String deploymentName, String jobId, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse =
                getSwapDeploymentsStatusWithResponse(projectName, deploymentName, jobId, requestOptions);
        return new SimpleResponse<>(
                protocolMethodResponse, protocolMethodResponse.getValue().toObject(SwapDeploymentsJob.class));
    }
}
