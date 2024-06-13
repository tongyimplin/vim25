package com.vmware.vim25;

import com.vmware.vim25.GuestOperationsFault;
import com.vmware.vim25.GuestProcessNotFound;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestProcessNotFound", propOrder = {"pid"})
public class GuestProcessNotFound extends GuestOperationsFault {
  protected long pid;
  
  public long getPid() {
    return this.pid;
  }
  
  public void setPid(long paramLong) {
    this.pid = paramLong;
  }
}
