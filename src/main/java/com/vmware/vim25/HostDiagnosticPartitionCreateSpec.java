package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiagnosticPartitionCreateSpec;
import com.vmware.vim25.HostDiskPartitionSpec;
import com.vmware.vim25.HostScsiDiskPartition;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiagnosticPartitionCreateSpec", propOrder = {"storageType", "diagnosticType", "id", "partition", "active"})
public class HostDiagnosticPartitionCreateSpec extends DynamicData {
  @XmlElement(required = true)
  protected String storageType;
  
  @XmlElement(required = true)
  protected String diagnosticType;
  
  @XmlElement(required = true)
  protected HostScsiDiskPartition id;
  
  @XmlElement(required = true)
  protected HostDiskPartitionSpec partition;
  
  protected Boolean active;
  
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
  
  public HostScsiDiskPartition getId() {
    return this.id;
  }
  
  public void setId(HostScsiDiskPartition paramHostScsiDiskPartition) {
    this.id = paramHostScsiDiskPartition;
  }
  
  public HostDiskPartitionSpec getPartition() {
    return this.partition;
  }
  
  public void setPartition(HostDiskPartitionSpec paramHostDiskPartitionSpec) {
    this.partition = paramHostDiskPartitionSpec;
  }
  
  public Boolean isActive() {
    return this.active;
  }
  
  public void setActive(Boolean paramBoolean) {
    this.active = paramBoolean;
  }
}
