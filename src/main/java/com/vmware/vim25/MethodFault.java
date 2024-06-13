package com.vmware.vim25;

import com.vmware.vim25.InvalidCollectorVersion;
import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.MethodFault;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodFault", propOrder = {"faultCause", "faultMessage"})
@XmlSeeAlso({InvalidProperty.class, InvalidCollectorVersion.class, RuntimeFault.class, VimFault.class})
public class MethodFault {
  protected LocalizedMethodFault faultCause;
  
  protected List<LocalizableMessage> faultMessage;
  
  public LocalizedMethodFault getFaultCause() {
    return this.faultCause;
  }
  
  public void setFaultCause(LocalizedMethodFault paramLocalizedMethodFault) {
    this.faultCause = paramLocalizedMethodFault;
  }
  
  public List<LocalizableMessage> getFaultMessage() {
    if (this.faultMessage == null)
      this.faultMessage = new ArrayList<>(); 
    return this.faultMessage;
  }
}
