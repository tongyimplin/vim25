package com.vmware.vim25;

import com.vmware.vim25.DeviceBackedVirtualDiskSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FileBackedVirtualDiskSpec;
import com.vmware.vim25.VirtualDiskSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSpec", propOrder = {"diskType", "adapterType"})
@XmlSeeAlso({DeviceBackedVirtualDiskSpec.class, FileBackedVirtualDiskSpec.class})
public class VirtualDiskSpec extends DynamicData {
  @XmlElement(required = true)
  protected String diskType;
  
  @XmlElement(required = true)
  protected String adapterType;
  
  public String getDiskType() {
    return this.diskType;
  }
  
  public void setDiskType(String paramString) {
    this.diskType = paramString;
  }
  
  public String getAdapterType() {
    return this.adapterType;
  }
  
  public void setAdapterType(String paramString) {
    this.adapterType = paramString;
  }
}
