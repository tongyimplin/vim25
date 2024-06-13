package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.VspanDestPortConflict;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VspanDestPortConflict", propOrder = {"vspanSessionKey1", "vspanSessionKey2", "portKey"})
public class VspanDestPortConflict extends DvsFault {
  @XmlElement(required = true)
  protected String vspanSessionKey1;
  
  @XmlElement(required = true)
  protected String vspanSessionKey2;
  
  @XmlElement(required = true)
  protected String portKey;
  
  public String getVspanSessionKey1() {
    return this.vspanSessionKey1;
  }
  
  public void setVspanSessionKey1(String paramString) {
    this.vspanSessionKey1 = paramString;
  }
  
  public String getVspanSessionKey2() {
    return this.vspanSessionKey2;
  }
  
  public void setVspanSessionKey2(String paramString) {
    this.vspanSessionKey2 = paramString;
  }
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
}
