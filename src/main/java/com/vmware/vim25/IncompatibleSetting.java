package com.vmware.vim25;

import com.vmware.vim25.IncompatibleSetting;
import com.vmware.vim25.InvalidArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompatibleSetting", propOrder = {"conflictingProperty"})
public class IncompatibleSetting extends InvalidArgument {
  @XmlElement(required = true)
  protected String conflictingProperty;
  
  public String getConflictingProperty() {
    return this.conflictingProperty;
  }
  
  public void setConflictingProperty(String paramString) {
    this.conflictingProperty = paramString;
  }
}
