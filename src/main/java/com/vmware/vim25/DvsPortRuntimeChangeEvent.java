package com.vmware.vim25;

import com.vmware.vim25.DVPortStatus;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsPortRuntimeChangeEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortRuntimeChangeEvent", propOrder = {"portKey", "runtimeInfo"})
public class DvsPortRuntimeChangeEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String portKey;
  
  @XmlElement(required = true)
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
