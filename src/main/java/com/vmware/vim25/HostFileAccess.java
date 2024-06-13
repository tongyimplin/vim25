package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFileAccess;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFileAccess", propOrder = {"who", "what"})
public class HostFileAccess extends DynamicData {
  @XmlElement(required = true)
  protected String who;
  
  @XmlElement(required = true)
  protected String what;
  
  public String getWho() {
    return this.who;
  }
  
  public void setWho(String paramString) {
    this.who = paramString;
  }
  
  public String getWhat() {
    return this.what;
  }
  
  public void setWhat(String paramString) {
    this.what = paramString;
  }
}
