/**
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. From visualizing data to 3D printing, take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.autodesk.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Bucket json response
 */
@ApiModel(description = "Bucket json response")

public class Buckets   {
  @JsonProperty("bucketKey")
  private String bucketKey = null;

  @JsonProperty("bucketOwner")
  private String bucketOwner = null;

  @JsonProperty("createdDate")
  private Long createdDate = null;

  @JsonProperty("permissions")
  private List<BucketsPermissions> permissions = new ArrayList<BucketsPermissions>();

  /**
   * [Data retention policy](https://developer.autodesk.com/en/docs/data/v2/overview/retention-policy/)  Acceptable values: `transient`, `temporary` or `persistent` 
   */
  public enum PolicyKeyEnum {
    TRANSIENT("transient"),
    
    TEMPORARY("temporary"),
    
    PERSISTENT("persistent");

    private String value;

    PolicyKeyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("policyKey")
  private PolicyKeyEnum policyKey = null;

  public Buckets bucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
    return this;
  }

   /**
   * The key for the created bucket
   * @return bucketKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "The key for the created bucket")
  public String getBucketKey() {
    return bucketKey;
  }

  public void setBucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
  }

  public Buckets bucketOwner(String bucketOwner) {
    this.bucketOwner = bucketOwner;
    return this;
  }

   /**
   * Owner of the bucket
   * @return bucketOwner
  **/
  @ApiModelProperty(example = "null", required = true, value = "Owner of the bucket")
  public String getBucketOwner() {
    return bucketOwner;
  }

  public void setBucketOwner(String bucketOwner) {
    this.bucketOwner = bucketOwner;
  }

  public Buckets createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Timestamp in epoch time
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Timestamp in epoch time")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public Buckets permissions(List<BucketsPermissions> permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Array of objects representing the applications with access granted at bucket creation
   * @return permissions
  **/
  @ApiModelProperty(example = "null", required = true, value = "Array of objects representing the applications with access granted at bucket creation")
  public List<BucketsPermissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<BucketsPermissions> permissions) {
    this.permissions = permissions;
  }

  public Buckets policyKey(PolicyKeyEnum policyKey) {
    this.policyKey = policyKey;
    return this;
  }

   /**
   * [Data retention policy](https://developer.autodesk.com/en/docs/data/v2/overview/retention-policy/)  Acceptable values: `transient`, `temporary` or `persistent` 
   * @return policyKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "[Data retention policy](https://developer.autodesk.com/en/docs/data/v2/overview/retention-policy/)  Acceptable values: `transient`, `temporary` or `persistent` ")
  public PolicyKeyEnum getPolicyKey() {
    return policyKey;
  }

  public void setPolicyKey(PolicyKeyEnum policyKey) {
    this.policyKey = policyKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Buckets buckets = (Buckets) o;
    return Objects.equals(this.bucketKey, buckets.bucketKey) &&
        Objects.equals(this.bucketOwner, buckets.bucketOwner) &&
        Objects.equals(this.createdDate, buckets.createdDate) &&
        Objects.equals(this.permissions, buckets.permissions) &&
        Objects.equals(this.policyKey, buckets.policyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketKey, bucketOwner, createdDate, permissions, policyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Buckets {\n");

    sb.append("    bucketKey: ").append(toIndentedString(bucketKey)).append("\n");
    sb.append("    bucketOwner: ").append(toIndentedString(bucketOwner)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    policyKey: ").append(toIndentedString(policyKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

