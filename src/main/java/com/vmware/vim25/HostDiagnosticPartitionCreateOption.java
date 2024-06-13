package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiagnosticPartitionCreateOption;
import com.vmware.vim25.HostScsiDisk;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiagnosticPartitionCreateOption", propOrder = {"storageType", "diagnosticType", "disk"})
public class HostDiagnosticPartitionCreateOption extends DynamicData {
  @XmlElement(required = true)
  protected String storageType;
  
  @XmlElement(required = true)
  protected String diagnosticType;
  
  @XmlElement(required = true)
  protected HostScsiDisk disk;
  
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
  
  public HostScsiDisk getDisk() {
    return this.disk;
  }
  
  public void setDisk(HostScsiDisk paramHostScsiDisk) {
    this.disk = paramHostScsiDisk;
  }
}
