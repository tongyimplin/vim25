package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanClusterConfigInfoHostDefaultInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanClusterConfigInfoHostDefaultInfo", propOrder = {"uuid", "autoClaimStorage", "checksumEnabled"})
public class VsanClusterConfigInfoHostDefaultInfo extends DynamicData {
  protected String uuid;
  
  protected Boolean autoClaimStorage;
  
  protected Boolean checksumEnabled;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public Boolean isAutoClaimStorage() {
    return this.autoClaimStorage;
  }
  
  public void setAutoClaimStorage(Boolean paramBoolean) {
    this.autoClaimStorage = paramBoolean;
  }
  
  public Boolean isChecksumEnabled() {
    return this.checksumEnabled;
  }
  
  public void setChecksumEnabled(Boolean paramBoolean) {
    this.checksumEnabled = paramBoolean;
  }
}
