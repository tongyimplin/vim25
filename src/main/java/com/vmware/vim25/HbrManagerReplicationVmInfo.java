package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HbrManagerReplicationVmInfo;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ReplicationVmProgressInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HbrManagerReplicationVmInfo", propOrder = {"state", "progressInfo", "imageId", "lastError"})
public class HbrManagerReplicationVmInfo extends DynamicData {
  @XmlElement(required = true)
  protected String state;
  
  protected ReplicationVmProgressInfo progressInfo;
  
  protected String imageId;
  
  protected LocalizedMethodFault lastError;
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public ReplicationVmProgressInfo getProgressInfo() {
    return this.progressInfo;
  }
  
  public void setProgressInfo(ReplicationVmProgressInfo paramReplicationVmProgressInfo) {
    this.progressInfo = paramReplicationVmProgressInfo;
  }
  
  public String getImageId() {
    return this.imageId;
  }
  
  public void setImageId(String paramString) {
    this.imageId = paramString;
  }
  
  public LocalizedMethodFault getLastError() {
    return this.lastError;
  }
  
  public void setLastError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.lastError = paramLocalizedMethodFault;
  }
}
