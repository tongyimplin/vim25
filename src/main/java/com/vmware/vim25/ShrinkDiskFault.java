package com.vmware.vim25;

import com.vmware.vim25.ShrinkDiskFault;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShrinkDiskFault", propOrder = {"diskId"})
public class ShrinkDiskFault extends VimFault {
  protected Integer diskId;
  
  public Integer getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(Integer paramInteger) {
    this.diskId = paramInteger;
  }
}
