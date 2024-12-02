/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getSalIntegrationEnrichmentAssets options.
 */
public class GetSalIntegrationEnrichmentAssetsOptions extends GenericModel {

  protected String projectId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationEnrichmentAssetsOptions instance.
     *
     * @param getSalIntegrationEnrichmentAssetsOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationEnrichmentAssetsOptions getSalIntegrationEnrichmentAssetsOptions) {
      this.projectId = getSalIntegrationEnrichmentAssetsOptions.projectId;
      this.authInstanceId = getSalIntegrationEnrichmentAssetsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetSalIntegrationEnrichmentAssetsOptions.
     *
     * @return the new GetSalIntegrationEnrichmentAssetsOptions instance
     */
    public GetSalIntegrationEnrichmentAssetsOptions build() {
      return new GetSalIntegrationEnrichmentAssetsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetSalIntegrationEnrichmentAssetsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationEnrichmentAssetsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationEnrichmentAssetsOptions() { }

  protected GetSalIntegrationEnrichmentAssetsOptions(Builder builder) {
    projectId = builder.projectId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationEnrichmentAssetsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * enrichment project id.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}
