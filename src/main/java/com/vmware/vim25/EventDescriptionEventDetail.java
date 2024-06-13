package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EventDescriptionEventDetail;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDescriptionEventDetail", propOrder = {"key", "description", "category", "formatOnDatacenter", "formatOnComputeResource", "formatOnHost", "formatOnVm", "fullFormat", "longDescription"})
public class EventDescriptionEventDetail extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected String description;
  
  @XmlElement(required = true)
  protected String category;
  
  @XmlElement(required = true)
  protected String formatOnDatacenter;
  
  @XmlElement(required = true)
  protected String formatOnComputeResource;
  
  @XmlElement(required = true)
  protected String formatOnHost;
  
  @XmlElement(required = true)
  protected String formatOnVm;
  
  @XmlElement(required = true)
  protected String fullFormat;
  
  protected String longDescription;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public String getCategory() {
    return this.category;
  }
  
  public void setCategory(String paramString) {
    this.category = paramString;
  }
  
  public String getFormatOnDatacenter() {
    return this.formatOnDatacenter;
  }
  
  public void setFormatOnDatacenter(String paramString) {
    this.formatOnDatacenter = paramString;
  }
  
  public String getFormatOnComputeResource() {
    return this.formatOnComputeResource;
  }
  
  public void setFormatOnComputeResource(String paramString) {
    this.formatOnComputeResource = paramString;
  }
  
  public String getFormatOnHost() {
    return this.formatOnHost;
  }
  
  public void setFormatOnHost(String paramString) {
    this.formatOnHost = paramString;
  }
  
  public String getFormatOnVm() {
    return this.formatOnVm;
  }
  
  public void setFormatOnVm(String paramString) {
    this.formatOnVm = paramString;
  }
  
  public String getFullFormat() {
    return this.fullFormat;
  }
  
  public void setFullFormat(String paramString) {
    this.fullFormat = paramString;
  }
  
  public String getLongDescription() {
    return this.longDescription;
  }
  
  public void setLongDescription(String paramString) {
    this.longDescription = paramString;
  }
}
