package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsHostStatusUpdated;
import com.vmware.vim25.HostEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostStatusUpdated", propOrder = {"hostMember", "oldStatus", "newStatus", "oldStatusDetail", "newStatusDetail"})
public class DvsHostStatusUpdated extends DvsEvent {
  @XmlElement(required = true)
  protected HostEventArgument hostMember;
  
  protected String oldStatus;
  
  protected String newStatus;
  
  protected String oldStatusDetail;
  
  protected String newStatusDetail;
  
  public HostEventArgument getHostMember() {
    return this.hostMember;
  }
  
  public void setHostMember(HostEventArgument paramHostEventArgument) {
    this.hostMember = paramHostEventArgument;
  }
  
  public String getOldStatus() {
    return this.oldStatus;
  }
  
  public void setOldStatus(String paramString) {
    this.oldStatus = paramString;
  }
  
  public String getNewStatus() {
    return this.newStatus;
  }
  
  public void setNewStatus(String paramString) {
    this.newStatus = paramString;
  }
  
  public String getOldStatusDetail() {
    return this.oldStatusDetail;
  }
  
  public void setOldStatusDetail(String paramString) {
    this.oldStatusDetail = paramString;
  }
  
  public String getNewStatusDetail() {
    return this.newStatusDetail;
  }
  
  public void setNewStatusDetail(String paramString) {
    this.newStatusDetail = paramString;
  }
}
