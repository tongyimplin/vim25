package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.VspanPortMoveFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VspanPortMoveFault", propOrder = {"srcPortgroupName", "destPortgroupName", "portKey"})
public class VspanPortMoveFault extends DvsFault {
  @XmlElement(required = true)
  protected String srcPortgroupName;
  
  @XmlElement(required = true)
  protected String destPortgroupName;
  
  @XmlElement(required = true)
  protected String portKey;
  
  public String getSrcPortgroupName() {
    return this.srcPortgroupName;
  }
  
  public void setSrcPortgroupName(String paramString) {
    this.srcPortgroupName = paramString;
  }
  
  public String getDestPortgroupName() {
    return this.destPortgroupName;
  }
  
  public void setDestPortgroupName(String paramString) {
    this.destPortgroupName = paramString;
  }
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
}
