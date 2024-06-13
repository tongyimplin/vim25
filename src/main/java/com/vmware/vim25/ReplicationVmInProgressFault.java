package com.vmware.vim25;

import com.vmware.vim25.ReplicationVmFault;
import com.vmware.vim25.ReplicationVmInProgressFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationVmInProgressFault", propOrder = {"requestedActivity", "inProgressActivity"})
public class ReplicationVmInProgressFault extends ReplicationVmFault {
  @XmlElement(required = true)
  protected String requestedActivity;
  
  @XmlElement(required = true)
  protected String inProgressActivity;
  
  public String getRequestedActivity() {
    return this.requestedActivity;
  }
  
  public void setRequestedActivity(String paramString) {
    this.requestedActivity = paramString;
  }
  
  public String getInProgressActivity() {
    return this.inProgressActivity;
  }
  
  public void setInProgressActivity(String paramString) {
    this.inProgressActivity = paramString;
  }
}
