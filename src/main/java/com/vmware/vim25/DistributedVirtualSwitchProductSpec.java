package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchProductSpec", propOrder = {"name", "vendor", "version", "build", "forwardingClass", "bundleId", "bundleUrl"})
public class DistributedVirtualSwitchProductSpec extends DynamicData {
  protected String name;
  
  protected String vendor;
  
  protected String version;
  
  protected String build;
  
  protected String forwardingClass;
  
  protected String bundleId;
  
  protected String bundleUrl;
  
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
  
  public String getBuild() {
    return this.build;
  }
  
  public void setBuild(String paramString) {
    this.build = paramString;
  }
  
  public String getForwardingClass() {
    return this.forwardingClass;
  }
  
  public void setForwardingClass(String paramString) {
    this.forwardingClass = paramString;
  }
  
  public String getBundleId() {
    return this.bundleId;
  }
  
  public void setBundleId(String paramString) {
    this.bundleId = paramString;
  }
  
  public String getBundleUrl() {
    return this.bundleUrl;
  }
  
  public void setBundleUrl(String paramString) {
    this.bundleUrl = paramString;
  }
}
