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

import java.util.Objects;


/**
 * Advanced options for &#x60;thumbnail&#x60; type.
 */
@ApiModel(description = "Advanced options for `thumbnail` type.")

public class JobThumbnailOutputPayloadAdvanced   {
  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  public JobThumbnailOutputPayloadAdvanced width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Set the width. Possible values are `100`, `200` and `400`.
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "Set the width. Possible values are `100`, `200` and `400`.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public JobThumbnailOutputPayloadAdvanced height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Set the height. Possible values are `100`, `200` and `400`.
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "Set the height. Possible values are `100`, `200` and `400`.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobThumbnailOutputPayloadAdvanced jobThumbnailOutputPayloadAdvanced = (JobThumbnailOutputPayloadAdvanced) o;
    return Objects.equals(this.width, jobThumbnailOutputPayloadAdvanced.width) &&
        Objects.equals(this.height, jobThumbnailOutputPayloadAdvanced.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobThumbnailOutputPayloadAdvanced {\n");

    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

