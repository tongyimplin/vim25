package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmReloadFromPathEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReloadFromPathEvent", propOrder = {"configPath"})
public class VmReloadFromPathEvent extends VmEvent {
  @XmlElement(required = true)
  protected String configPath;
  
  public String getConfigPath() {
    return this.configPath;
  }
  
  public void setConfigPath(String paramString) {
    this.configPath = paramString;
  }
}
