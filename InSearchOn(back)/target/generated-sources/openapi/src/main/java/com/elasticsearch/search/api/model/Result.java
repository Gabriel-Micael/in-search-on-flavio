package com.elasticsearch.search.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Result
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-29T20:49:01.654238048-03:00[America/Sao_Paulo]")

public class Result  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("title")
  private String title;

  @JsonProperty("url")
  private String url;

  @JsonProperty("abs")
  private String abs;

  @JsonProperty("reading_time")
  private Integer readingTime;

  @JsonProperty("dt_creation")
  private String dtCreation;

  public Result title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Result url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Result abs(String abs) {
    this.abs = abs;
    return this;
  }

  /**
   * Get abs
   * @return abs
  */
  @ApiModelProperty(value = "")


  public String getAbs() {
    return abs;
  }

  public void setAbs(String abs) {
    this.abs = abs;
  }

  public Result readingTime(Integer readingTime) {
    this.readingTime = readingTime;
    return this;
  }

  /**
   * Get readingTime
   * @return readingTime
  */
  @ApiModelProperty(value = "")


  public Integer getReadingTime() {
    return readingTime;
  }

  public void setReadingTime(Integer readingTime) {
    this.readingTime = readingTime;
  }

  public Result dtCreation(String dtCreation) {
    this.dtCreation = dtCreation;
    return this;
  }

  /**
   * Get dtCreation
   * @return dtCreation
  */
  @ApiModelProperty(value = "")


  public String getDtCreation() {
    return dtCreation;
  }

  public void setDtCreation(String dtCreation) {
    this.dtCreation = dtCreation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.title, result.title) &&
        Objects.equals(this.url, result.url) &&
        Objects.equals(this.abs, result.abs) &&
        Objects.equals(this.readingTime, result.readingTime) &&
        Objects.equals(this.dtCreation, result.dtCreation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, url, abs, readingTime, dtCreation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    abs: ").append(toIndentedString(abs)).append("\n");
    sb.append("    readingTime: ").append(toIndentedString(readingTime)).append("\n");
    sb.append("    dtCreation: ").append(toIndentedString(dtCreation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

