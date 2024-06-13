package com.vmware.vim25;

import com.vmware.vim25.GuestProgramSpec;
import com.vmware.vim25.GuestWindowsProgramSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestWindowsProgramSpec", propOrder = {"startMinimized"})
public class GuestWindowsProgramSpec extends GuestProgramSpec {
  protected boolean startMinimized;
  
  public boolean isStartMinimized() {
    return this.startMinimized;
  }
  
  public void setStartMinimized(boolean paramBoolean) {
    this.startMinimized = paramBoolean;
  }
}
