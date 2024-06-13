package com.vmware.vim25;

import com.vmware.vim25.DiskChangeInfo;
import com.vmware.vim25.VstorageObjectVCenterQueryChangedDiskAreasResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "VstorageObjectVCenterQueryChangedDiskAreasResponse")
public class VstorageObjectVCenterQueryChangedDiskAreasResponse {
  @XmlElement(required = true)
  protected DiskChangeInfo returnval;
  
  public DiskChangeInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(DiskChangeInfo paramDiskChangeInfo) {
    this.returnval = paramDiskChangeInfo;
  }
}
