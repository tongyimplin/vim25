package com.vmware.vim25;

import com.vmware.vim25.CheckLicenseFeatureResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CheckLicenseFeatureResponse")
public class CheckLicenseFeatureResponse {
  protected boolean returnval;
  
  public boolean isReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(boolean paramBoolean) {
    this.returnval = paramBoolean;
  }
}
