package com.vmware.vim25;

import com.vmware.vim25.StorageDrsHbrDiskNotMovable;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsHbrDiskNotMovable", propOrder = {"nonMovableDiskIds"})
public class StorageDrsHbrDiskNotMovable extends VimFault {
  @XmlElement(required = true)
  protected String nonMovableDiskIds;
  
  public String getNonMovableDiskIds() {
    return this.nonMovableDiskIds;
  }
  
  public void setNonMovableDiskIds(String paramString) {
    this.nonMovableDiskIds = paramString;
  }
}
