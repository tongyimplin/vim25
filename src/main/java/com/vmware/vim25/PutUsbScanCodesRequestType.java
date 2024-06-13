package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PutUsbScanCodesRequestType;
import com.vmware.vim25.UsbScanCodeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutUsbScanCodesRequestType", propOrder = {"_this", "spec"})
public class PutUsbScanCodesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected UsbScanCodeSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public UsbScanCodeSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(UsbScanCodeSpec paramUsbScanCodeSpec) {
    this.spec = paramUsbScanCodeSpec;
  }
}
