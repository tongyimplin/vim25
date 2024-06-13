package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsPortLeavePortgroupEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortLeavePortgroupEvent", propOrder = {"portKey", "portgroupKey", "portgroupName"})
public class DvsPortLeavePortgroupEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String portKey;
  
  @XmlElement(required = true)
  protected String portgroupKey;
  
  @XmlElement(required = true)
  protected String portgroupName;
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public String getPortgroupKey() {
    return this.portgroupKey;
  }
  
  public void setPortgroupKey(String paramString) {
    this.portgroupKey = paramString;
  }
  
  public String getPortgroupName() {
    return this.portgroupName;
  }
  
  public void setPortgroupName(String paramString) {
    this.portgroupName = paramString;
  }
}
