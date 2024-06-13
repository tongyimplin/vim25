package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostMembershipInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostMembershipInfo", propOrder = {"nodeUuid", "hostname"})
public class VsanHostMembershipInfo extends DynamicData {
  @XmlElement(required = true)
  protected String nodeUuid;
  
  @XmlElement(required = true)
  protected String hostname;
  
  public String getNodeUuid() {
    return this.nodeUuid;
  }
  
  public void setNodeUuid(String paramString) {
    this.nodeUuid = paramString;
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public void setHostname(String paramString) {
    this.hostname = paramString;
  }
}
