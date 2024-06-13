package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVsanInternalSystemDeleteVsanObjectsResult;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVsanInternalSystemDeleteVsanObjectsResult", propOrder = {"uuid", "success", "failureReason"})
public class HostVsanInternalSystemDeleteVsanObjectsResult extends DynamicData {
  @XmlElement(required = true)
  protected String uuid;
  
  protected boolean success;
  
  protected List<LocalizableMessage> failureReason;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public boolean isSuccess() {
    return this.success;
  }
  
  public void setSuccess(boolean paramBoolean) {
    this.success = paramBoolean;
  }
  
  public List<LocalizableMessage> getFailureReason() {
    if (this.failureReason == null)
      this.failureReason = new ArrayList<>(); 
    return this.failureReason;
  }
}
