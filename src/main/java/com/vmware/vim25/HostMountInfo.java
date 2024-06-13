package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMountInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMountInfo", propOrder = {"path", "accessMode", "mounted", "accessible", "inaccessibleReason"})
public class HostMountInfo extends DynamicData {
  protected String path;
  
  @XmlElement(required = true)
  protected String accessMode;
  
  protected Boolean mounted;
  
  protected Boolean accessible;
  
  protected String inaccessibleReason;
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public String getAccessMode() {
    return this.accessMode;
  }
  
  public void setAccessMode(String paramString) {
    this.accessMode = paramString;
  }
  
  public Boolean isMounted() {
    return this.mounted;
  }
  
  public void setMounted(Boolean paramBoolean) {
    this.mounted = paramBoolean;
  }
  
  public Boolean isAccessible() {
    return this.accessible;
  }
  
  public void setAccessible(Boolean paramBoolean) {
    this.accessible = paramBoolean;
  }
  
  public String getInaccessibleReason() {
    return this.inaccessibleReason;
  }
  
  public void setInaccessibleReason(String paramString) {
    this.inaccessibleReason = paramString;
  }
}
