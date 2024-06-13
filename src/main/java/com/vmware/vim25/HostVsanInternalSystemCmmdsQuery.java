package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVsanInternalSystemCmmdsQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVsanInternalSystemCmmdsQuery", propOrder = {"type", "uuid", "owner"})
public class HostVsanInternalSystemCmmdsQuery extends DynamicData {
  protected String type;
  
  protected String uuid;
  
  protected String owner;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getOwner() {
    return this.owner;
  }
  
  public void setOwner(String paramString) {
    this.owner = paramString;
  }
}
