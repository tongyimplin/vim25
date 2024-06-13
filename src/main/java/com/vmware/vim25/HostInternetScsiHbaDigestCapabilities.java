package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaDigestCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaDigestCapabilities", propOrder = {"headerDigestSettable", "dataDigestSettable", "targetHeaderDigestSettable", "targetDataDigestSettable"})
public class HostInternetScsiHbaDigestCapabilities extends DynamicData {
  protected Boolean headerDigestSettable;
  
  protected Boolean dataDigestSettable;
  
  protected Boolean targetHeaderDigestSettable;
  
  protected Boolean targetDataDigestSettable;
  
  public Boolean isHeaderDigestSettable() {
    return this.headerDigestSettable;
  }
  
  public void setHeaderDigestSettable(Boolean paramBoolean) {
    this.headerDigestSettable = paramBoolean;
  }
  
  public Boolean isDataDigestSettable() {
    return this.dataDigestSettable;
  }
  
  public void setDataDigestSettable(Boolean paramBoolean) {
    this.dataDigestSettable = paramBoolean;
  }
  
  public Boolean isTargetHeaderDigestSettable() {
    return this.targetHeaderDigestSettable;
  }
  
  public void setTargetHeaderDigestSettable(Boolean paramBoolean) {
    this.targetHeaderDigestSettable = paramBoolean;
  }
  
  public Boolean isTargetDataDigestSettable() {
    return this.targetDataDigestSettable;
  }
  
  public void setTargetDataDigestSettable(Boolean paramBoolean) {
    this.targetDataDigestSettable = paramBoolean;
  }
}
