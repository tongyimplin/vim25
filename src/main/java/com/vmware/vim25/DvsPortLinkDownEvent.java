package com.vmware.vim25;

import com.vmware.vim25.DVPortStatus;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsPortLinkDownEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortLinkDownEvent", propOrder = {"portKey", "runtimeInfo"})
public class DvsPortLinkDownEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String portKey;
  
  protected DVPortStatus runtimeInfo;
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public DVPortStatus getRuntimeInfo() {
    return this.runtimeInfo;
  }
  
  public void setRuntimeInfo(DVPortStatus paramDVPortStatus) {
    this.runtimeInfo = paramDVPortStatus;
  }
}
