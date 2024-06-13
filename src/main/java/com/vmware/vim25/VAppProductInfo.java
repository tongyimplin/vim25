package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VAppProductInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppProductInfo", propOrder = {"key", "classId", "instanceId", "name", "vendor", "version", "fullVersion", "vendorUrl", "productUrl", "appUrl"})
public class VAppProductInfo extends DynamicData {
  protected int key;
  
  protected String classId;
  
  protected String instanceId;
  
  protected String name;
  
  protected String vendor;
  
  protected String version;
  
  protected String fullVersion;
  
  protected String vendorUrl;
  
  protected String productUrl;
  
  protected String appUrl;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public String getClassId() {
    return this.classId;
  }
  
  public void setClassId(String paramString) {
    this.classId = paramString;
  }
  
  public String getInstanceId() {
    return this.instanceId;
  }
  
  public void setInstanceId(String paramString) {
    this.instanceId = paramString;
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
  
  public String getFullVersion() {
    return this.fullVersion;
  }
  
  public void setFullVersion(String paramString) {
    this.fullVersion = paramString;
  }
  
  public String getVendorUrl() {
    return this.vendorUrl;
  }
  
  public void setVendorUrl(String paramString) {
    this.vendorUrl = paramString;
  }
  
  public String getProductUrl() {
    return this.productUrl;
  }
  
  public void setProductUrl(String paramString) {
    this.productUrl = paramString;
  }
  
  public String getAppUrl() {
    return this.appUrl;
  }
  
  public void setAppUrl(String paramString) {
    this.appUrl = paramString;
  }
}
