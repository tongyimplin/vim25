package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiagnosticPartition;
import com.vmware.vim25.HostScsiDiskPartition;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiagnosticPartition", propOrder = {"storageType", "diagnosticType", "slots", "id"})
public class HostDiagnosticPartition extends DynamicData {
  @XmlElement(required = true)
  protected String storageType;
  
  @XmlElement(required = true)
  protected String diagnosticType;
  
  protected int slots;
  
  @XmlElement(required = true)
  protected HostScsiDiskPartition id;
  
  public String getStorageType() {
    return this.storageType;
  }
  
  public void setStorageType(String paramString) {
    this.storageType = paramString;
  }
  
  public String getDiagnosticType() {
    return this.diagnosticType;
  }
  
  public void setDiagnosticType(String paramString) {
    this.diagnosticType = paramString;
  }
  
  public int getSlots() {
    return this.slots;
  }
  
  public void setSlots(int paramInt) {
    this.slots = paramInt;
  }
  
  public HostScsiDiskPartition getId() {
    return this.id;
  }
  
  public void setId(HostScsiDiskPartition paramHostScsiDiskPartition) {
    this.id = paramHostScsiDiskPartition;
  }
}
