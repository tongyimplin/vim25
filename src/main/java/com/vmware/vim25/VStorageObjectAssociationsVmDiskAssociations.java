package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VStorageObjectAssociationsVmDiskAssociations;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectAssociationsVmDiskAssociations", propOrder = {"vmId", "diskKey"})
public class VStorageObjectAssociationsVmDiskAssociations extends DynamicData {
  @XmlElement(required = true)
  protected String vmId;
  
  protected int diskKey;
  
  public String getVmId() {
    return this.vmId;
  }
  
  public void setVmId(String paramString) {
    this.vmId = paramString;
  }
  
  public int getDiskKey() {
    return this.diskKey;
  }
  
  public void setDiskKey(int paramInt) {
    this.diskKey = paramInt;
  }
}
