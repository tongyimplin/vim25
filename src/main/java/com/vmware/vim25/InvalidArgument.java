package com.vmware.vim25;

import com.vmware.vim25.IncompatibleSetting;
import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.InvalidDasConfigArgument;
import com.vmware.vim25.InvalidDasRestartPriorityForFtVm;
import com.vmware.vim25.InvalidDrsBehaviorForFtVm;
import com.vmware.vim25.InvalidIndexArgument;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidArgument", propOrder = {"invalidProperty"})
@XmlSeeAlso({InvalidIndexArgument.class, InvalidDasConfigArgument.class, InvalidDrsBehaviorForFtVm.class, IncompatibleSetting.class, InvalidDasRestartPriorityForFtVm.class})
public class InvalidArgument extends RuntimeFault {
  protected String invalidProperty;
  
  public String getInvalidProperty() {
    return this.invalidProperty;
  }
  
  public void setInvalidProperty(String paramString) {
    this.invalidProperty = paramString;
  }
}
