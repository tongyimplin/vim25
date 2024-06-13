package com.vmware.vim25;

import com.vmware.vim25.CpuCompatibilityUnknown;
import com.vmware.vim25.CpuIncompatible;
import com.vmware.vim25.CpuIncompatible1ECX;
import com.vmware.vim25.CpuIncompatible81EDX;
import com.vmware.vim25.FaultToleranceCpuIncompatible;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpuIncompatible", propOrder = {"level", "registerName", "registerBits", "desiredBits", "host"})
@XmlSeeAlso({FaultToleranceCpuIncompatible.class, CpuCompatibilityUnknown.class, CpuIncompatible81EDX.class, CpuIncompatible1ECX.class})
public class CpuIncompatible extends VirtualHardwareCompatibilityIssue {
  protected int level;
  
  @XmlElement(required = true)
  protected String registerName;
  
  protected String registerBits;
  
  protected String desiredBits;
  
  protected ManagedObjectReference host;
  
  public int getLevel() {
    return this.level;
  }
  
  public void setLevel(int paramInt) {
    this.level = paramInt;
  }
  
  public String getRegisterName() {
    return this.registerName;
  }
  
  public void setRegisterName(String paramString) {
    this.registerName = paramString;
  }
  
  public String getRegisterBits() {
    return this.registerBits;
  }
  
  public void setRegisterBits(String paramString) {
    this.registerBits = paramString;
  }
  
  public String getDesiredBits() {
    return this.desiredBits;
  }
  
  public void setDesiredBits(String paramString) {
    this.desiredBits = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
