package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiagnosticPartitionCreateDescription;
import com.vmware.vim25.HostDiagnosticPartitionCreateSpec;
import com.vmware.vim25.HostDiskPartitionLayout;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiagnosticPartitionCreateDescription", propOrder = {"layout", "diskUuid", "spec"})
public class HostDiagnosticPartitionCreateDescription extends DynamicData {
  @XmlElement(required = true)
  protected HostDiskPartitionLayout layout;
  
  @XmlElement(required = true)
  protected String diskUuid;
  
  @XmlElement(required = true)
  protected HostDiagnosticPartitionCreateSpec spec;
  
  public HostDiskPartitionLayout getLayout() {
    return this.layout;
  }
  
  public void setLayout(HostDiskPartitionLayout paramHostDiskPartitionLayout) {
    this.layout = paramHostDiskPartitionLayout;
  }
  
  public String getDiskUuid() {
    return this.diskUuid;
  }
  
  public void setDiskUuid(String paramString) {
    this.diskUuid = paramString;
  }
  
  public HostDiagnosticPartitionCreateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostDiagnosticPartitionCreateSpec paramHostDiagnosticPartitionCreateSpec) {
    this.spec = paramHostDiagnosticPartitionCreateSpec;
  }
}
