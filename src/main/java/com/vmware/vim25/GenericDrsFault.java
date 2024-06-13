package com.vmware.vim25;

import com.vmware.vim25.GenericDrsFault;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericDrsFault", propOrder = {"hostFaults"})
public class GenericDrsFault extends VimFault {
  protected List<LocalizedMethodFault> hostFaults;
  
  public List<LocalizedMethodFault> getHostFaults() {
    if (this.hostFaults == null)
      this.hostFaults = new ArrayList<>(); 
    return this.hostFaults;
  }
}
