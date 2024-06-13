package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiTopologyLun;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiTopologyLun", propOrder = {"key", "lun", "scsiLun"})
public class HostScsiTopologyLun extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected int lun;
  
  @XmlElement(required = true)
  protected String scsiLun;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public int getLun() {
    return this.lun;
  }
  
  public void setLun(int paramInt) {
    this.lun = paramInt;
  }
  
  public String getScsiLun() {
    return this.scsiLun;
  }
  
  public void setScsiLun(String paramString) {
    this.scsiLun = paramString;
  }
}
