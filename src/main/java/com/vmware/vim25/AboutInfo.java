package com.vmware.vim25;

import com.vmware.vim25.AboutInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AboutInfo", propOrder = {"name", "fullName", "vendor", "version", "build", "localeVersion", "localeBuild", "osType", "productLineId", "apiType", "apiVersion", "instanceUuid", "licenseProductName", "licenseProductVersion"})
public class AboutInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String fullName;
  
  @XmlElement(required = true)
  protected String vendor;
  
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String build;
  
  protected String localeVersion;
  
  protected String localeBuild;
  
  @XmlElement(required = true)
  protected String osType;
  
  @XmlElement(required = true)
  protected String productLineId;
  
  @XmlElement(required = true)
  protected String apiType;
  
  @XmlElement(required = true)
  protected String apiVersion;
  
  protected String instanceUuid;
  
  protected String licenseProductName;
  
  protected String licenseProductVersion;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getFullName() {
    return this.fullName;
  }
  
  public void setFullName(String paramString) {
    this.fullName = paramString;
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
  
  public String getBuild() {
    return this.build;
  }
  
  public void setBuild(String paramString) {
    this.build = paramString;
  }
  
  public String getLocaleVersion() {
    return this.localeVersion;
  }
  
  public void setLocaleVersion(String paramString) {
    this.localeVersion = paramString;
  }
  
  public String getLocaleBuild() {
    return this.localeBuild;
  }
  
  public void setLocaleBuild(String paramString) {
    this.localeBuild = paramString;
  }
  
  public String getOsType() {
    return this.osType;
  }
  
  public void setOsType(String paramString) {
    this.osType = paramString;
  }
  
  public String getProductLineId() {
    return this.productLineId;
  }
  
  public void setProductLineId(String paramString) {
    this.productLineId = paramString;
  }
  
  public String getApiType() {
    return this.apiType;
  }
  
  public void setApiType(String paramString) {
    this.apiType = paramString;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public void setApiVersion(String paramString) {
    this.apiVersion = paramString;
  }
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
  
  public String getLicenseProductName() {
    return this.licenseProductName;
  }
  
  public void setLicenseProductName(String paramString) {
    this.licenseProductName = paramString;
  }
  
  public String getLicenseProductVersion() {
    return this.licenseProductVersion;
  }
  
  public void setLicenseProductVersion(String paramString) {
    this.licenseProductVersion = paramString;
  }
}
