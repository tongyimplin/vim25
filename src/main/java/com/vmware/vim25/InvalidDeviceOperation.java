package com.vmware.vim25;

import com.vmware.vim25.InvalidDeviceOperation;
import com.vmware.vim25.InvalidDeviceSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDeviceOperation", propOrder = {"badOp", "badFileOp"})
public class InvalidDeviceOperation extends InvalidDeviceSpec {
  protected VirtualDeviceConfigSpecOperation badOp;
  
  protected VirtualDeviceConfigSpecFileOperation badFileOp;
  
  public VirtualDeviceConfigSpecOperation getBadOp() {
    return this.badOp;
  }
  
  public void setBadOp(VirtualDeviceConfigSpecOperation paramVirtualDeviceConfigSpecOperation) {
    this.badOp = paramVirtualDeviceConfigSpecOperation;
  }
  
  public VirtualDeviceConfigSpecFileOperation getBadFileOp() {
    return this.badFileOp;
  }
  
  public void setBadFileOp(VirtualDeviceConfigSpecFileOperation paramVirtualDeviceConfigSpecFileOperation) {
    this.badFileOp = paramVirtualDeviceConfigSpecFileOperation;
  }
}
