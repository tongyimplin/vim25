package com.vmware.vim25;

import com.vmware.vim25.ClusterIoFilterInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIoFilterInfo;
import com.vmware.vim25.IoFilterInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IoFilterInfo", propOrder = {"id", "name", "vendor", "version", "type", "summary", "releaseDate"})
@XmlSeeAlso({ClusterIoFilterInfo.class, HostIoFilterInfo.class})
public class IoFilterInfo extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String vendor;
  
  @XmlElement(required = true)
  protected String version;
  
  protected String type;
  
  protected String summary;
  
  protected String releaseDate;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
  
  public String getReleaseDate() {
    return this.releaseDate;
  }
  
  public void setReleaseDate(String paramString) {
    this.releaseDate = paramString;
  }
}
