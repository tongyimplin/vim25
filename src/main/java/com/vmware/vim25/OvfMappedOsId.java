package com.vmware.vim25;

import com.vmware.vim25.OvfImport;
import com.vmware.vim25.OvfMappedOsId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfMappedOsId", propOrder = {"ovfId", "ovfDescription", "targetDescription"})
public class OvfMappedOsId extends OvfImport {
  protected int ovfId;
  
  @XmlElement(required = true)
  protected String ovfDescription;
  
  @XmlElement(required = true)
  protected String targetDescription;
  
  public int getOvfId() {
    return this.ovfId;
  }
  
  public void setOvfId(int paramInt) {
    this.ovfId = paramInt;
  }
  
  public String getOvfDescription() {
    return this.ovfDescription;
  }
  
  public void setOvfDescription(String paramString) {
    this.ovfDescription = paramString;
  }
  
  public String getTargetDescription() {
    return this.targetDescription;
  }
  
  public void setTargetDescription(String paramString) {
    this.targetDescription = paramString;
  }
}
