package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.VspanSameSessionPortConflict;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VspanSameSessionPortConflict", propOrder = {"vspanSessionKey", "portKey"})
public class VspanSameSessionPortConflict extends DvsFault {
  @XmlElement(required = true)
  protected String vspanSessionKey;
  
  @XmlElement(required = true)
  protected String portKey;
  
  public String getVspanSessionKey() {
    return this.vspanSessionKey;
  }
  
  public void setVspanSessionKey(String paramString) {
    this.vspanSessionKey = paramString;
  }
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
}
