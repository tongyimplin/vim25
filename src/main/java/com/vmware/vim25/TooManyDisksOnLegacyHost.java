package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.TooManyDisksOnLegacyHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TooManyDisksOnLegacyHost", propOrder = {"diskCount", "timeoutDanger"})
public class TooManyDisksOnLegacyHost extends MigrationFault {
  protected int diskCount;
  
  protected boolean timeoutDanger;
  
  public int getDiskCount() {
    return this.diskCount;
  }
  
  public void setDiskCount(int paramInt) {
    this.diskCount = paramInt;
  }
  
  public boolean isTimeoutDanger() {
    return this.timeoutDanger;
  }
  
  public void setTimeoutDanger(boolean paramBoolean) {
    this.timeoutDanger = paramBoolean;
  }
}
