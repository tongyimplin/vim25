package com.vmware.vim25;

import com.vmware.vim25.NotEnoughLicenses;
import com.vmware.vim25.VramLimitLicense;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VramLimitLicense", propOrder = {"limit"})
public class VramLimitLicense extends NotEnoughLicenses {
  protected int limit;
  
  public int getLimit() {
    return this.limit;
  }
  
  public void setLimit(int paramInt) {
    this.limit = paramInt;
  }
}
