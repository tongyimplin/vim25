package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.ReadOnlyDisksWithLegacyDestination;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadOnlyDisksWithLegacyDestination", propOrder = {"roDiskCount", "timeoutDanger"})
public class ReadOnlyDisksWithLegacyDestination extends MigrationFault {
  protected int roDiskCount;
  
  protected boolean timeoutDanger;
  
  public int getRoDiskCount() {
    return this.roDiskCount;
  }
  
  public void setRoDiskCount(int paramInt) {
    this.roDiskCount = paramInt;
  }
  
  public boolean isTimeoutDanger() {
    return this.timeoutDanger;
  }
  
  public void setTimeoutDanger(boolean paramBoolean) {
    this.timeoutDanger = paramBoolean;
  }
}
