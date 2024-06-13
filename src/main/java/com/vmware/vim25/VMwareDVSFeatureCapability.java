package com.vmware.vim25;

import com.vmware.vim25.DVSFeatureCapability;
import com.vmware.vim25.VMwareDVSFeatureCapability;
import com.vmware.vim25.VMwareDVSVspanCapability;
import com.vmware.vim25.VMwareDvsIpfixCapability;
import com.vmware.vim25.VMwareDvsLacpCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSFeatureCapability", propOrder = {"vspanSupported", "lldpSupported", "ipfixSupported", "ipfixCapability", "multicastSnoopingSupported", "vspanCapability", "lacpCapability", "nsxSupported"})
public class VMwareDVSFeatureCapability extends DVSFeatureCapability {
  protected Boolean vspanSupported;
  
  protected Boolean lldpSupported;
  
  protected Boolean ipfixSupported;
  
  protected VMwareDvsIpfixCapability ipfixCapability;
  
  protected Boolean multicastSnoopingSupported;
  
  protected VMwareDVSVspanCapability vspanCapability;
  
  protected VMwareDvsLacpCapability lacpCapability;
  
  protected Boolean nsxSupported;
  
  public Boolean isVspanSupported() {
    return this.vspanSupported;
  }
  
  public void setVspanSupported(Boolean paramBoolean) {
    this.vspanSupported = paramBoolean;
  }
  
  public Boolean isLldpSupported() {
    return this.lldpSupported;
  }
  
  public void setLldpSupported(Boolean paramBoolean) {
    this.lldpSupported = paramBoolean;
  }
  
  public Boolean isIpfixSupported() {
    return this.ipfixSupported;
  }
  
  public void setIpfixSupported(Boolean paramBoolean) {
    this.ipfixSupported = paramBoolean;
  }
  
  public VMwareDvsIpfixCapability getIpfixCapability() {
    return this.ipfixCapability;
  }
  
  public void setIpfixCapability(VMwareDvsIpfixCapability paramVMwareDvsIpfixCapability) {
    this.ipfixCapability = paramVMwareDvsIpfixCapability;
  }
  
  public Boolean isMulticastSnoopingSupported() {
    return this.multicastSnoopingSupported;
  }
  
  public void setMulticastSnoopingSupported(Boolean paramBoolean) {
    this.multicastSnoopingSupported = paramBoolean;
  }
  
  public VMwareDVSVspanCapability getVspanCapability() {
    return this.vspanCapability;
  }
  
  public void setVspanCapability(VMwareDVSVspanCapability paramVMwareDVSVspanCapability) {
    this.vspanCapability = paramVMwareDVSVspanCapability;
  }
  
  public VMwareDvsLacpCapability getLacpCapability() {
    return this.lacpCapability;
  }
  
  public void setLacpCapability(VMwareDvsLacpCapability paramVMwareDvsLacpCapability) {
    this.lacpCapability = paramVMwareDvsLacpCapability;
  }
  
  public Boolean isNsxSupported() {
    return this.nsxSupported;
  }
  
  public void setNsxSupported(Boolean paramBoolean) {
    this.nsxSupported = paramBoolean;
  }
}
