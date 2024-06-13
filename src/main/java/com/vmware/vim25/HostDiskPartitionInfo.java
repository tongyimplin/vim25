package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskPartitionInfo;
import com.vmware.vim25.HostDiskPartitionLayout;
import com.vmware.vim25.HostDiskPartitionSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskPartitionInfo", propOrder = {"deviceName", "spec", "layout"})
public class HostDiskPartitionInfo extends DynamicData {
  @XmlElement(required = true)
  protected String deviceName;
  
  @XmlElement(required = true)
  protected HostDiskPartitionSpec spec;
  
  @XmlElement(required = true)
  protected HostDiskPartitionLayout layout;
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
  
  public HostDiskPartitionSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostDiskPartitionSpec paramHostDiskPartitionSpec) {
    this.spec = paramHostDiskPartitionSpec;
  }
  
  public HostDiskPartitionLayout getLayout() {
    return this.layout;
  }
  
  public void setLayout(HostDiskPartitionLayout paramHostDiskPartitionLayout) {
    this.layout = paramHostDiskPartitionLayout;
  }
}
