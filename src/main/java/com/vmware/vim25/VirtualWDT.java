package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualWDT;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualWDT", propOrder = {"runOnBoot", "running"})
public class VirtualWDT extends VirtualDevice {
  protected boolean runOnBoot;
  
  protected boolean running;
  
  public boolean isRunOnBoot() {
    return this.runOnBoot;
  }
  
  public void setRunOnBoot(boolean paramBoolean) {
    this.runOnBoot = paramBoolean;
  }
  
  public boolean isRunning() {
    return this.running;
  }
  
  public void setRunning(boolean paramBoolean) {
    this.running = paramBoolean;
  }
}
