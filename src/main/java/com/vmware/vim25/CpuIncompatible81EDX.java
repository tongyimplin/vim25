package com.vmware.vim25;

import com.vmware.vim25.CpuIncompatible;
import com.vmware.vim25.CpuIncompatible81EDX;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpuIncompatible81EDX", propOrder = {"nx", "ffxsr", "rdtscp", "lm", "other", "otherOnly"})
public class CpuIncompatible81EDX extends CpuIncompatible {
  protected boolean nx;
  
  protected boolean ffxsr;
  
  protected boolean rdtscp;
  
  protected boolean lm;
  
  protected boolean other;
  
  protected boolean otherOnly;
  
  public boolean isNx() {
    return this.nx;
  }
  
  public void setNx(boolean paramBoolean) {
    this.nx = paramBoolean;
  }
  
  public boolean isFfxsr() {
    return this.ffxsr;
  }
  
  public void setFfxsr(boolean paramBoolean) {
    this.ffxsr = paramBoolean;
  }
  
  public boolean isRdtscp() {
    return this.rdtscp;
  }
  
  public void setRdtscp(boolean paramBoolean) {
    this.rdtscp = paramBoolean;
  }
  
  public boolean isLm() {
    return this.lm;
  }
  
  public void setLm(boolean paramBoolean) {
    this.lm = paramBoolean;
  }
  
  public boolean isOther() {
    return this.other;
  }
  
  public void setOther(boolean paramBoolean) {
    this.other = paramBoolean;
  }
  
  public boolean isOtherOnly() {
    return this.otherOnly;
  }
  
  public void setOtherOnly(boolean paramBoolean) {
    this.otherOnly = paramBoolean;
  }
}
