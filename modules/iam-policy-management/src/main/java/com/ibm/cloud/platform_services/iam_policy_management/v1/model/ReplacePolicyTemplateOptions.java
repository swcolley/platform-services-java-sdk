/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replacePolicyTemplate options.
 */
public class ReplacePolicyTemplateOptions extends GenericModel {

  protected String policyTemplateId;
  protected String version;
  protected String ifMatch;
  protected TemplatePolicy policy;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String policyTemplateId;
    private String version;
    private String ifMatch;
    private TemplatePolicy policy;
    private String description;

    /**
     * Instantiates a new Builder from an existing ReplacePolicyTemplateOptions instance.
     *
     * @param replacePolicyTemplateOptions the instance to initialize the Builder with
     */
    private Builder(ReplacePolicyTemplateOptions replacePolicyTemplateOptions) {
      this.policyTemplateId = replacePolicyTemplateOptions.policyTemplateId;
      this.version = replacePolicyTemplateOptions.version;
      this.ifMatch = replacePolicyTemplateOptions.ifMatch;
      this.policy = replacePolicyTemplateOptions.policy;
      this.description = replacePolicyTemplateOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param policyTemplateId the policyTemplateId
     * @param version the version
     * @param ifMatch the ifMatch
     * @param policy the policy
     */
    public Builder(String policyTemplateId, String version, String ifMatch, TemplatePolicy policy) {
      this.policyTemplateId = policyTemplateId;
      this.version = version;
      this.ifMatch = ifMatch;
      this.policy = policy;
    }

    /**
     * Builds a ReplacePolicyTemplateOptions.
     *
     * @return the new ReplacePolicyTemplateOptions instance
     */
    public ReplacePolicyTemplateOptions build() {
      return new ReplacePolicyTemplateOptions(this);
    }

    /**
     * Set the policyTemplateId.
     *
     * @param policyTemplateId the policyTemplateId
     * @return the ReplacePolicyTemplateOptions builder
     */
    public Builder policyTemplateId(String policyTemplateId) {
      this.policyTemplateId = policyTemplateId;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the ReplacePolicyTemplateOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the ReplacePolicyTemplateOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the policy.
     *
     * @param policy the policy
     * @return the ReplacePolicyTemplateOptions builder
     */
    public Builder policy(TemplatePolicy policy) {
      this.policy = policy;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplacePolicyTemplateOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected ReplacePolicyTemplateOptions() { }

  protected ReplacePolicyTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyTemplateId,
      "policyTemplateId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.version,
      "version cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.policy,
      "policy cannot be null");
    policyTemplateId = builder.policyTemplateId;
    version = builder.version;
    ifMatch = builder.ifMatch;
    policy = builder.policy;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a ReplacePolicyTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the policyTemplateId.
   *
   * The policy template ID.
   *
   * @return the policyTemplateId
   */
  public String policyTemplateId() {
    return policyTemplateId;
  }

  /**
   * Gets the version.
   *
   * The policy template version.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the ifMatch.
   *
   * The revision number for updating a policy template version and must match the ETag value of the existing policy
   * template version. The Etag can be retrieved using the GET
   * /v1/policy_templates/{policy_template_id}/versions/{version} API and looking at the ETag response header.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the policy.
   *
   * The core set of properties associated with the template's policy objet.
   *
   * @return the policy
   */
  public TemplatePolicy policy() {
    return policy;
  }

  /**
   * Gets the description.
   *
   * description of template purpose.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

