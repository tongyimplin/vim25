package com.vmware.vim25;

import com.vmware.vim25.NotEnoughLicenses;
import com.vmware.vim25.VmLimitLicense;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmLimitLicense", propOrder = {"limit"})
public class VmLimitLicense extends NotEnoughLicenses {
  protected int limit;
  
  public int getLimit() {
    return this.limit;
  }
  
  public void setLimit(int paramInt) {
    this.limit = paramInt;
  }
}
