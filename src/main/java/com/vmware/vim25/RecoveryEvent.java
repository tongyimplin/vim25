package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.RecoveryEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoveryEvent", propOrder = {"hostName", "portKey", "dvsUuid", "vnic"})
public class RecoveryEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected String portKey;
  
  protected String dvsUuid;
  
  protected String vnic;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public String getDvsUuid() {
    return this.dvsUuid;
  }
  
  public void setDvsUuid(String paramString) {
    this.dvsUuid = paramString;
  }
  
  public String getVnic() {
    return this.vnic;
  }
  
  public void setVnic(String paramString) {
    this.vnic = paramString;
  }
}
