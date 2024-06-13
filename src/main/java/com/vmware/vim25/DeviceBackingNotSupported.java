package com.vmware.vim25;

import com.vmware.vim25.DVPortNotSupported;
import com.vmware.vim25.DeviceBackingNotSupported;
import com.vmware.vim25.DeviceNotSupported;
import com.vmware.vim25.UnusedVirtualDiskBlocksNotScrubbed;
import com.vmware.vim25.VirtualDiskBlocksNotFullyProvisioned;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceBackingNotSupported", propOrder = {"backing"})
@XmlSeeAlso({DVPortNotSupported.class, UnusedVirtualDiskBlocksNotScrubbed.class, VirtualDiskBlocksNotFullyProvisioned.class})
public class DeviceBackingNotSupported extends DeviceNotSupported {
  @XmlElement(required = true)
  protected String backing;
  
  public String getBacking() {
    return this.backing;
  }
  
  public void setBacking(String paramString) {
    this.backing = paramString;
  }
}
