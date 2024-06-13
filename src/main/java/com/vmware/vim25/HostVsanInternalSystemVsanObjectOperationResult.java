package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVsanInternalSystemVsanObjectOperationResult;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVsanInternalSystemVsanObjectOperationResult", propOrder = {"uuid", "failureReason"})
public class HostVsanInternalSystemVsanObjectOperationResult extends DynamicData {
  @XmlElement(required = true)
  protected String uuid;
  
  protected List<LocalizableMessage> failureReason;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public List<LocalizableMessage> getFailureReason() {
    if (this.failureReason == null)
      this.failureReason = new ArrayList<>(); 
    return this.failureReason;
  }
}
