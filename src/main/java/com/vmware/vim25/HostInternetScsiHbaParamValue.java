package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaParamValue;
import com.vmware.vim25.OptionValue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaParamValue", propOrder = {"isInherited"})
public class HostInternetScsiHbaParamValue extends OptionValue {
  protected Boolean isInherited;
  
  public Boolean isIsInherited() {
    return this.isInherited;
  }
  
  public void setIsInherited(Boolean paramBoolean) {
    this.isInherited = paramBoolean;
  }
}
